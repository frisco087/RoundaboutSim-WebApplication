

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.User"%>

<!doctype html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0,  minimum-scale=1">
        <meta name="description" content="Enter Content">
        <meta name="author" content="Daniel O' Keeffe">

        <title>Roundabout Sim - Login / Sign Up</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <!--fonts-->
        <link href="https://fonts.googleapis.com/css?family=Poppins&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto+Slab&display=swap" rel="stylesheet">
        <!--animate-->
        <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
        <!--Favicon-->
        <!--Favicon-->
        <link data-brackets-id='3508' rel="icon" href="/favicon.ico" type="image/x-icon">
        <meta name="msapplication-TileColor" content="#ffffff">
        <meta name="msapplication-TileImage" content="/ms-icon-144x144.png">
        <meta name="theme-color" content="#ffffff">
        <!--css-->
        <link rel="stylesheet" href="css/style.css">

    </head>
    <div class='thetop'></div>

    <body>
        <!--Nav-->
        <nav>
            <div class="logo">
                <a href="#"><img src="img/logo.png"></a>
            </div>
        </nav>


        <!--main wrapper-->
        <div class="main-wrap">
            <div class="pusher"></div>
            <div class="pusher"></div>
            <div class="pusher"></div>
            <div class="pusher"></div>

            <div class="login-box">
                <div class="center-item">
                    <h1 data-aos="fade-up" data-aos-offset="10" data-aos-delay="200" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">Log In</h1>
                    <hr data-aos="fade-up" data-aos-offset="10" data-aos-delay="200" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                </div>

                <!-- Contact Form -->
                <!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
                <div class="row" data-aos="fade-up" data-aos-offset="10" data-aos-delay="200" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                    <div class="">
                        <div class="rowpad">
                            <form action="UserController" method="post" class="login-form" name="Login">
                                <div class="control-group form-group">
                                    <div class="controls input-container">
                                        <i class="fa fa-user icon"></i>
                                        <label>Username</label>
                                        <input type="text" class="form-control" name="username" placeholder="Username" id="username" required data-validation-required-message="Please enter your name.">
                                        <p class="help-block"></p>
                                    </div>
                                </div>

                                <div class="control-group form-group">
                                    <div class="controls input-container">
                                        <i class="fa fa-key icon"></i>
                                        <label>Password</label>
                                        <input type="password" name="password" placeholder="Password" id="password" class="form-control" required data-validation-required-message="Please enter your password.">
                                        <p><input type="checkbox" onclick="myFunction()">Show Password</p>
                                    </div>
                                </div>

                                <div id="success"></div>
                                <!-- For success/fail messages -->
                                <button type="submit" name="menu" value="Process Login" class="btn btn-primary hvr-sweep-to-right" id="sendMessageButton">Login</button><br><br>
                                <p class="center-item">or</p>
                                <a href="UserController?menu=SignUp"><button type="button" name="menu" value="SignUp" class="btn btn-primary hvr-sweep-to-right" id="">Sign Up</button></a>
                            </form>
                        </div>
                    </div>

                </div>
                <!-- /.row -->
            </div>
            <div class="pusher"></div>
            <div class="pusher"></div>
        </div>
        <!--Main wrap end-->

        <div class="footer">
            <div class="footer-wrap">
                <img class="foot-logo" src="img/logo.png">
                <div class="black-line"></div>
                <div class="social-icon-wrap">
                    <a href=""><img src="img/iconmonstr-facebook-3-240.png" alt="facebook logo"></a>
                    <a href=""><img src="img/iconmonstr-instagram-1-240.png" alt="instagram logo"></a>
                    <a href=""><img src="img/iconmonstr-twitter-3-240.png" alt="twitter logo"></a>
                    <a href=""><img src="img/iconmonstr-youtube-3-240.png" alt="youtube logo"></a>
                </div>
                <a data-brackets-id='3631' href="mailto:RoundaboutSim@live.com?Subject=Hello%20again">
                    <p data-brackets-id='3632'><i data-brackets-id='3633' class="fas fa-envelope-open-text fa-1x"></i>Email: RoundaboutSim@live.com</p>
                </a>
                <a href="tel:3530003333">
                    <p><i class="fas fa-phone-volume fa-1x"></i>Phone: +353 (0)00 3333</p>
                </a>
                <a href="#">
                    <p class="footer-company-name">Website built by <br>Daniel O' Keeffe &copy; 2019</p>
                </a>
                <ul data-brackets-id='3640' class="foot-nav">
                   
                </ul>
            </div>
            <!--scroll top-->
            <div class='scrolltop'>
                <div class='scroll icon'><i class="fa fa-4x fa-angle-up"></i></div>
            </div>
        </div>



        <!--scripts-->
        <script src="js/app.js"></script>
        <!--    <script src="js/testimonial.js"></script>-->
        <script src="js/scrollToTop.js"></script>
        <!--animate on scroll-->
        <script src="https://unpkg.com/aos@next/dist/aos.js"></script>
        <script>
                                            AOS.init();
        </script>

        <script>
            /* Scroll to top*/
            $(window).scroll(function () {
                if ($(this).scrollTop() > 50) {
                    $('.scrolltop:hidden').stop(true, true).fadeIn();
                } else {
                    $('.scrolltop').stop(true, true).fadeOut();
                }
            });
            $(function () {
                $(".scroll").click(function () {
                    $("html,body").animate({
                        scrollTop: $(".thetop").offset().top
                    }, "1000");
                    return false
                })
            })
        </script>
        <script>
            function myFunction() {
                var x = document.getElementById("password");
                if (x.type === "password") {
                    x.type = "text";
                } else {
                    x.type = "password";
                }
            }
        </script>
        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Contact form JavaScript -->
        <!-- Do not edit these files! In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
        <script src="js/jqBootstrapValidation.js"></script>
        <script src="js/contact_me.js"></script>
    </body></html>
