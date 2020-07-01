package model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User implements Serializable {

    private int userid;
    private String email;
    private String username;
    private String password;
    private String bio;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String email, String username, String password, String bio) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.bio = bio;
    }

    public User(int userid) {
        this.userid = userid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public User Login(String username, String password) {

        System.out.println("in User login");
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        String query = "Select * from user where name = ? AND password = ?";

        try {
            System.out.println("in User login try catch");
            System.out.println(username + "  " + password);
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                this.setUserid(resultSet.getInt("id"));
                this.setUsername(resultSet.getString("name"));
                this.setPassword(resultSet.getString("password"));
                this.setBio(resultSet.getString("bio"));
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        return this;
    }

    public User saveToDatabase() {

        Connection connection = DatabaseUtilityClass.getConnection();
        System.out.println("in savetoDB");
        String sql = "INSERT INTO user (name, password, email, bio) VALUES (?,?,?,?)";
        String query = "SELECT LAST_INSERT_ID()";
        try {

            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            ps.setString(1, this.getUsername());
            ps.setString(2, this.getPassword());
            ps.setString(3, this.getEmail());
            ps.setString(4, this.getBio());

            System.out.println(ps);

            ps.executeUpdate();
            ResultSet rs = ps2.executeQuery();
            while (rs.next()) {
                this.setUserid(rs.getInt(1));
            }

            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }

    public User getUserDetails(int userid) {

        User u = null;
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        String query = "Select * from user where id = ?";

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, userid);

            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                u = new User();
                u.setUserid(resultSet.getInt("id"));
                u.setUsername(resultSet.getString("name"));
                u.setPassword(resultSet.getString("password"));
                u.setEmail(resultSet.getString("email"));
                u.setBio(resultSet.getString("bio"));

                return u;
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        return u;
    }

    public User deleteDateabase(int UserID) {

        Connection connection = DatabaseUtilityClass.getConnection();
        System.out.println("in delete DB ");
        String sql = "DELETE user FROM user WHERE id = ? ";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, this.getUserid());

            ps.executeUpdate();

            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }

    public ArrayList<User> getAllUsers() {

        ArrayList allusers = new ArrayList<>();
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        String query = "Select * from user";

        try {

            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                User s = new User();
                s.setUserid(resultSet.getInt("id"));
                s.setUsername(resultSet.getString("name"));
                s.setPassword(resultSet.getString("password"));
                s.setEmail(resultSet.getString("email"));
                s.setBio(resultSet.getString("bio"));
                allusers.add(s);
                System.out.println("All Users" + s);
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        return allusers;
    }

    public User updateDatabase(int userid, String name, String password, String email, String bio) {

        Connection connection = DatabaseUtilityClass.getConnection();

        this.setUsername(name);
        this.setPassword(password);
        this.setEmail(email);
        this.setBio(bio);

        String sql = "UPDATE user SET name = ?,  password = ?,  email = ?, bio = ? WHERE id = ? ";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, this.getUsername());
            ps.setString(2, this.getPassword());
            ps.setString(3, this.getEmail());
            ps.setString(4, this.getBio());
            ps.setInt(5, this.getUserid());
            System.out.println("ps" + ps.toString());
            ps.executeUpdate();

            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }

    public User delete(int userid) {
        Connection connection = DatabaseUtilityClass.getConnection();

        String sql = "DELETE FROM user WHERE id=?;";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, userid);

            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }
}
