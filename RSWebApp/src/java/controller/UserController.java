package controller;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Daniel
 *
 */
public class UserController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("user controller");
        HttpSession session = request.getSession();
        
        User user = (User) session.getAttribute("user");
        if (user == null) {
            System.out.println("no user object");
            user = new User();
            session.setAttribute("user", user);
        }
        
        String menu = request.getParameter("menu");
        System.out.println("menu " + menu);
        switch (menu) {

            case "Login":
                gotoPage("/login.jsp", request, response);
                break;

            case "SignUp":
                gotoPage("/signup.jsp", request, response);
                break;

            case "Logout":
                session.invalidate();
                gotoPage("/login.jsp", request, response);
                break;

            case "Process Login":
                boolean validLogin = ProcessLogin(request, session);
                System.out.println("in process login");
                User use = (User) session.getAttribute("user");

                if (!validLogin) {
                    System.out.println("not valid login");
                    String message = "invalid logon details.. try again";
                    session.setAttribute("message", message);
                    gotoPage("/login.jsp", request, response);
                } else {
                    //Admin login
                    if ("admin".equals(use.getUsername())) {
                        String password = "123";
                        String md5 = encryption(password);

                        if (md5.equals(use.getPassword())) {
                            System.out.println("admin");
                            User users = new User();
                            //get all users
                            ArrayList<User> allusers = new ArrayList<>();
                            allusers = users.getAllUsers();
                            //put in session
                            session.setAttribute("allusers", allusers);
                            gotoPage("/admin.jsp", request, response);
                        }
                    } else {
                        System.out.println("normal user logged in");
                        gotoPage("/index.jsp", request, response);
                    }
                }
                break;

            case "Process SignUp":
                ProcessSave(request, session);
                gotoPage("/index.jsp", request, response);
                break;

            case "Gallery":
                gotoPage("/gallery.jsp", request, response);
                break;

            case "Profile":
                UserDetails(request, user, session);
                gotoPage("/profile.jsp", request, response);
                break;

            case "Contact":
                gotoPage("/contact.jsp", request, response);
                break;

            case "Cookies":
                gotoPage("/cookies.jsp", request, response);
                break;

            case "Terms":
                gotoPage("/terms.jsp", request, response);
                break;

            case "Privacy":
                gotoPage("/privacypolicy.jsp", request, response);
                break;

            case "ARApp":
                gotoPage("/ar-app.jsp", request, response);
                break;

            case "PromoVid":
                gotoPage("/promo-video.jsp", request, response);
                break;

            case "Background":
                gotoPage("/background.jsp", request, response);
                break;

            case "Home":
                System.out.println("Home");
                gotoPage("/index.jsp", request, response);
                break;

            //admin area -> go to edit specific user
            case "getUserView":
                String userid = request.getParameter("user_id");
                int user_id = Integer.parseInt(userid);
                System.out.println("user_id" + user_id);

                User s = new User();
                s = s.getUserDetails(user_id);

                if (s != null) {

                    session.setAttribute("user", s);
                    System.out.println("sesion contents" + session.getAttribute("user"));
                    User u = new User();
                    System.out.println("get user details " + s.getUserid());
                    u = u.getUserDetails(s.getUserid());
                    System.out.println("u" + u.getUserid());
                    if (u != null) {
                        System.out.println("user" + u.getUsername());
                        session.setAttribute("user", u);
                    } else {
                        System.out.println("user details null");
                    }
                }
                gotoPage("/detailedUserView.jsp", request, response);
                break;

            //admin update user details
            case "Update":
                ProcessUpdate(request, session, user);
                User users = new User();
                ArrayList<User> allusers = new ArrayList<>();
                allusers = users.getAllUsers();
                session.setAttribute("allusers", allusers);
                gotoPage("/admin.jsp", request, response);
                break;

            //user update profile
            case "Update Profile":
                boolean worked = ProcessUserUpdate(request, user, session);
                gotoPage("/profile.jsp", request, response);
                break;

            //Admin delete user
            case "DeleteUser":
                String snid = request.getParameter("user_id");
                int nid = Integer.parseInt(snid);
                User user2 = new User();
                user2.delete(nid);

                ArrayList<User> allusers2 = new ArrayList<>();
                allusers2 = user2.getAllUsers();

                session.setAttribute("allusers", allusers2);
                gotoPage("/admin.jsp", request, response);
                break;

            //user delete account
            case "Delete User":
                ProcessDelete(request, user, session);
                session.invalidate();
                gotoPage("/login.jsp", request, response);
                break;

            default:
                gotoPage("/invalid.jsp", request, response);
                break;
        }
    }

    private boolean ProcessUpdate(HttpServletRequest request, HttpSession session, User user) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        
        int UserID = user.getUserid();
        String md5 = encryption(password);
        String passcheck = user.getPassword();
        
         if(password.equals(passcheck)){
            User u = user.updateDatabaseAdmin(UserID, username, password, email);
            session.setAttribute("user", u);
        }else{
            User u = user.updateDatabaseAdmin(UserID, username, md5, email);
            session.setAttribute("user", u);
        }
         
        System.out.println("in process update");
        // put it back in the sesssion
        System.out.println("after update");
        return true;
    }

    private void ProcessDelete(HttpServletRequest request, User user, HttpSession session) {
        int UserID = user.getUserid();
        System.out.println("in  delete");

        User u = new User(user.getUserid());
        u.deleteDateabase(UserID);
        // put it back in the sesssion
        System.out.println("after delete");
        session.setAttribute("user", u);
    }

    private boolean ProcessLogin(HttpServletRequest request, HttpSession session) {
        System.out.println("in process login method");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + " " + password);
        String md5 = encryption(password);

        User us = new User(username, md5);
        us.Login(username, md5);
        session.setAttribute("user", us);
        System.out.println("User id: " + us.getUserid());
        if (us.getUserid() != 0) {
            return true;
        } else {
            return false;
        }
    }

    private void ProcessSave(HttpServletRequest request, HttpSession session) {
        System.out.println("in Process save");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        String bio = request.getParameter("bio");
        String score = request.getParameter("score");
        String md5 = encryption(password);
        
        User us = new User(email, username, md5, bio, score);
        us.saveToDatabase();

        session.setAttribute("user", us);
        System.out.println("useridss" + us.getUserid());
    }

    private void gotoPage(String url,
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
    
     private void UserDetails(HttpServletRequest request, User user, HttpSession session) {
        int UserID = user.getUserid();

        User u = new User(user.getUserid());
        u = u.getUserDetails(UserID);
        session.setAttribute("user", u);
    }

    private boolean ProcessUserUpdate(HttpServletRequest request, User user, HttpSession session) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String md5 = encryption(password);
        String bio = request.getParameter("bio");
        String passcheck = user.getPassword();
        int UserID = user.getUserid();
        
        if(password.equals(passcheck)){
            User u = user.updateDatabase(UserID, username, password, email, bio);
            session.setAttribute("user", u);
        }else{
            User u = user.updateDatabase(UserID, username, md5, email, bio);
            session.setAttribute("user", u);
        }
        
        System.out.println("in process update");

        
        // put it back in the sesssion
        System.out.println("after update");
        return true;
    }

    private String encryption(String password) {
        String md5 = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(password.getBytes(), 0, password.length());
            md5 = new BigInteger(1, digest.digest()).toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return md5;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

   
}
