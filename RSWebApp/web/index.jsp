
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html data-brackets-id='3493' lang="en">

<head data-brackets-id='3494'>
    <meta data-brackets-id='3495' charset="UTF-8">
    <meta data-brackets-id='3496' name="viewport" content="width=device-width, initial-scale=1.0,  minimum-scale=1">
    <meta data-brackets-id='3497' name="description" content="Enter Content">
    <meta data-brackets-id='3498' name="author" content="Daniel O' Keeffe">

    <title data-brackets-id='3499'>Roundabout Sim - Home Page</title>
    <link data-brackets-id='3500' rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link data-brackets-id='3501' rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <script data-brackets-id='3502' src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script data-brackets-id='3503' src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <!--fonts-->
    <link data-brackets-id='3504' href="https://fonts.googleapis.com/css?family=Poppins&display=swap" rel="stylesheet">
    <link data-brackets-id='3505' href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
    <link data-brackets-id='3506' href="https://fonts.googleapis.com/css?family=Roboto+Slab&display=swap" rel="stylesheet">
    <!--animate-->
    <link data-brackets-id='3507' rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
    <!--Favicon-->
    <link data-brackets-id='3508' rel="icon" href="/favicon.ico" type="image/x-icon">
    <!--css-->
    <link data-brackets-id='3509' rel="stylesheet" href="css/style.css">
</head>

<div data-brackets-id='3510' class='thetop'></div>

<body data-brackets-id='3511'>
    <!--Nav-->
    <nav data-brackets-id='3512'>
        
        <div data-brackets-id='3513' class="logo">
            <a data-brackets-id='3514' href="UserController?menu=Home"><img data-brackets-id='3515' src="img/logo.png"></a>
        </div>
        <ul data-brackets-id='3516' class="menu">
            <li data-brackets-id='3517'><a data-brackets-id='3518' class="active" href="UserController?menu=Home">Home</a></li>
            <li data-brackets-id='3519'><a data-brackets-id='3520' href="UserController?menu=Gallery">Gallery</a></li>
            <li data-brackets-id='3521'><a data-brackets-id='3522' href="UserController?menu=Profile">Profile</a></li>
            <li data-brackets-id='3523'><a data-brackets-id='3524' href="UserController?menu=Contact">Contact</a></li>
            <li data-brackets-id='3525'><a data-brackets-id='3526' href="UserController?menu=Logout">Logout</a></li>
        </ul>
        <div data-brackets-id='3527' class="burger">
            <div data-brackets-id='3528' class="line1"></div>
            <div data-brackets-id='3529' class="line2"></div>
            <div data-brackets-id='3530' class="line3"></div>
        </div>
    </nav>

    <!--carousel-->
    <div data-brackets-id='3531' id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol data-brackets-id='3532' class="carousel-indicators">
            <li data-brackets-id='3533' data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-brackets-id='3534' data-target="#myCarousel" data-slide-to="1"></li>
            <li data-brackets-id='3535' data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div data-brackets-id='3536' class="carousel-inner">
            <div data-brackets-id='3537' class="item active">
                <img data-brackets-id='3538' src="img/1.jpg" alt="">
            </div>

            <div data-brackets-id='3539' class="item">
                <img data-brackets-id='3540' src="img/2.jpg" alt="">
            </div>
            <!--            <button class="btn">Button</button>-->
        </div>

        <!-- Left and right controls -->
        <a data-brackets-id='3543' class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span data-brackets-id='3544' class="glyphicon glyphicon-chevron-left"></span>
            <span data-brackets-id='3545' class="sr-only">Previous</span>
        </a>
        <a data-brackets-id='3546' class="right carousel-control" href="#myCarousel" data-slide="next">
            <span data-brackets-id='3547' class="glyphicon glyphicon-chevron-right"></span>
            <span data-brackets-id='3548' class="sr-only">Next</span>
        </a>
    </div>

    <!--main wrapper-->
    <div data-brackets-id='3549' class="main-wraph">

        <!--Promotions-->
        <div data-brackets-id='3551' class="promotion-box">
            <h1 class="titleHome" data-brackets-id='3552' data-aos="fade-up" data-aos-offset="10" data-aos-delay="200" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">Welcome to Roundabout Simulator</h1>

            <div data-brackets-id='3553' class="pusher"></div>

            <!--box section-->
            <div data-brackets-id='3554' class="box-section" data-aos="fade-up" data-aos-offset="50" data-aos-delay="500" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                <div data-brackets-id='3555' class="box-lrg" data-aos="fade-up" data-aos-offset="50" data-aos-delay="500" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                    <img data-brackets-id='3556' class="promo" src="img/game-preview.PNG">
                    <p data-brackets-id='3559'>Roundabout Simulator is a project that was designed to educate road users both young and old on how to navigate a roundabout correctly which in return will make roads a safer place. The game allows the user to gain experience and confidence by allowing them to navigate the roundabout in a simulated enviornment without any risks. The game promts the user to take a certain exit on the roundabout. The game will inform them if they make any mistakes and award points for correctly navigating the roundabout. The game is built using unity and features traffic and pedestians to simulate a real world envoirnment. Download the game on your personal computer and start learning now.</p>

                </div>
                <a data-brackets-id='3560' href="downloads/test.zip" download="RoundAboutSim">
                    <li data-brackets-id='3561' class="btn hvr-sweep-to-right">Download</li>
                </a>
            </div>
        </div>

        <div data-brackets-id='3562' class="pusher"></div>
        <div data-brackets-id='3563' class="pusher"></div>

        <!--Promotions-->
        <div data-brackets-id='3564' class="promotion-box">
            <div data-brackets-id='3565' class="pusher"></div>

            <!--box section-->
            <div data-brackets-id='3566' class="box-section">
                <div data-brackets-id='3567' class="box box1" data-aos="fade-up" data-aos-offset="50" data-aos-delay="500" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                    <i data-brackets-id='3568' class="fas fa-vr-cardboard fa-2x"></i>
                    <h2 data-brackets-id='3569'>AR Application</h2>
                    <div data-brackets-id='3570' id="hide-box"><br><br>
                        <p data-brackets-id='3572'>This augmented reality experience allows the user can scan a poster with their phone to view a short promotional video about the Roundabout Simulator game.</p>
                        <a data-brackets-id='3573' href="UserController?menu=ARApp"><br>
                            <li data-brackets-id='3574' class="btn hvr-sweep-to-right">Read More</li>
                        </a>
                    </div>
                </div>
                <div data-brackets-id='3575' class="box" data-aos="fade-up" data-aos-offset="50" data-aos-delay="500" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                    <i data-brackets-id='3576' class="fas fa-video fa-2x"></i>
                    <h2 data-brackets-id='3577'>Promotional Video</h2>
                    <div data-brackets-id='3578' id="hide-box"> <br>       
                        <p data-brackets-id='3580'>Click the button below to view a promotional video to get a feel on what the Roundabout Simulator game has to offer.</p>
                        <a data-brackets-id='3581' href="UserController?menu=PromoVid"><br>
                            <li data-brackets-id='3582' class="btn hvr-sweep-to-right">Read More</li>
                        </a>
                    </div>
                </div>
                
                <div data-brackets-id='3567' class="box" data-aos="fade-up" data-aos-offset="50" data-aos-delay="500" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                    <i data-brackets-id='3568' class="fas fa-camera fa-2x"></i>
                    <h2 data-brackets-id='3569'>Gallery</h2>
                    <div data-brackets-id='3570' id="hide-box"><br><br>
                        <p data-brackets-id='3572'>Visit our image gallery to see some images of the game and other products we are working on such as an augmented reality application.</p>
                        <a data-brackets-id='3573' href="UserController?menu=Gallery"><br>
                            <li data-brackets-id='3574' class="btn hvr-sweep-to-right">View Gallery</li>
                        </a>

                    </div>
                </div>
                
                <div data-brackets-id='3583' class="box" data-aos="fade-up" data-aos-offset="50" data-aos-delay="500" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                    <i data-brackets-id='3584' class="far fa-question-circle fa-2x"></i>
                    <h2 data-brackets-id='3585'>Background</h2>
                    <div data-brackets-id='3586' id="hide-box"><br>
                        <p data-brackets-id='3588'>Click below to find out some background information about this project and how it was developed.</p><br>
                        <a data-brackets-id='3589' href="UserController?menu=Background"><br>
                            <li data-brackets-id='3590' class="btn hvr-sweep-to-right">Read More</li>
                        </a>
                    </div>
                </div>

                
                <div data-brackets-id='3575' class="box" data-aos="fade-up" data-aos-offset="50" data-aos-delay="500" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                    <i data-brackets-id='3576' class="fa fa-user icon fa-2x"></i>
                    <h2 data-brackets-id='3577'>Profile</h2>
                    <div data-brackets-id='3578' id="hide-box"><br><br>
                        <p data-brackets-id='3580'>Check out your profile page and edit your details. You can also delete your profile here.</p>
                        <a data-brackets-id='3581' href="UserController?menu=Profile"><br>
                            <li data-brackets-id='3582' class="btn hvr-sweep-to-right">Read More</li>
                        </a>

                    </div>
                </div>
                <div data-brackets-id='3583' class="box" data-aos="fade-up" data-aos-offset="50" data-aos-delay="500" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
                    <i data-brackets-id='3584' class="fas fa-envelope-open-text fa-2x"></i>
                    <h2 data-brackets-id='3585'>Contact us</h2>
                    <div data-brackets-id='3586' id="hide-box"><br><br>
                        <p data-brackets-id='3588'>Contact us and ask us any questions you would like. This page also has a direct message box, our contact details and location.</p>
                        <a data-brackets-id='3589' href="UserController?menu=Contact"><br>
                            <li data-brackets-id='3590' class="btn hvr-sweep-to-right">Contact Us</li>
                        </a>

                    </div>
                </div>
            </div>
        </div>
        <!--box section end-->
        <div data-brackets-id='3591' class="pusher"></div>
        <div data-brackets-id='3592' class="pusher"></div>

        <!--text section-->
        <div data-brackets-id='3593' class="text-section" data-aos="fade-up" data-aos-offset="10" data-aos-delay="5" data-aos-duration="500" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
            <h1 data-brackets-id='3594'>RoundAbout Simulator</h1>
            <hr data-brackets-id='3595'>
            <h4 data-brackets-id='3596'>Helping to educate road users is our aim</h4>
            <p data-brackets-id='3597'>The aim of this project is to develop an interactive game to educate road users both young and old on how to navigate a roundabout correctly which in return will make roads a safer place. 
                The objective of the game is to use a unity experience to educate new and future drivers on understanding how to use a roundabout correctly. </p>
        </div>

        <div data-brackets-id='3598' class="pusher"></div>
        <div data-brackets-id='3599' class="pusher"></div>

        <!--Testimonials-->
        <!-- Slideshow container -->
        <div data-brackets-id='3600' class="slideshow-container" data-aos="fade-up" data-aos-offset="50" data-aos-delay="500" data-aos-duration="400" data-aos-easing="ease-in-out" data-aos-mirror="true" data-aos-once="true" data-aos-anchor-placement="top">
            <h1 data-brackets-id='3601' class="title">Testimonials</h1>
            <hr data-brackets-id='3602' class="black-line">

            <!-- Full-width slides/quotes -->
            <div data-brackets-id='3603' class="mySlides">
                <q data-brackets-id='3604'>I found the Roundabout Simulator game very easy to use and it provided me with useful knowledge and experience.</q>
                <p data-brackets-id='3605' class="author">- John Doe</p>
            </div>

            <div data-brackets-id='3606' class="mySlides">
                <q data-brackets-id='3607'>A great way for novice road users to gain confidence for navigating on a round-about</q>
                <p data-brackets-id='3608' class="author">- Joe Bloggs</p>
            </div>

            <!-- Next/prev buttons -->
            <a data-brackets-id='3612' class="prev2" onclick="plusSlides(-1)">&#10094;</a>
            <a data-brackets-id='3613' class="next2" onclick="plusSlides(1)">&#10095;</a>


            <!-- Dots/bullets/indicators -->
            <div data-brackets-id='3614' class="dot-container">
                <span data-brackets-id='3615' class="dot" onclick="currentSlide(1)"></span>
                <span data-brackets-id='3616' class="dot" onclick="currentSlide(2)"></span>
            </div>
        </div>
        <!--Testimonial end-->

        <div data-brackets-id='3618' class="pusher"></div>
        <div data-brackets-id='3619' class="pusher"></div>
    </div>
    <!--Main wrap end-->


    <!--Footer-->
    <div data-brackets-id='3620' class="footer">
        <div data-brackets-id='3621' class="footer-wrap">
            <div data-brackets-id='3622' class="social-icon-wrap">
                <a data-brackets-id='3623' href="#"><img data-brackets-id='3624' src="img/iconmonstr-facebook-3-240.png" alt="facebook logo"></a>
                <a data-brackets-id='3625' href="#"><img data-brackets-id='3626' src="img/iconmonstr-instagram-1-240.png" alt="instagram logo"></a>
                <a data-brackets-id='3627' href="#"><img data-brackets-id='3628' src="img/iconmonstr-twitter-3-240.png" alt="twitter logo"></a>
                <a data-brackets-id='3629' href="#"><img data-brackets-id='3630' src="img/iconmonstr-youtube-3-240.png" alt="youtube logo"></a>
            </div>
            <a data-brackets-id='3631' href="mailto:RoundaboutSim@live.com?Subject=Hello%20again">
                <p data-brackets-id='3632'><i data-brackets-id='3633' class="fas fa-envelope-open-text fa-1x"></i>Email: RoundaboutSim@live.com</p>
            </a>
            <a data-brackets-id='3634' href="tel:3530003333">
                <p data-brackets-id='3635'><i data-brackets-id='3636' class="fas fa-phone-volume fa-1x"></i>Phone: +353 (0)00 3333</p>
            </a>
            <a data-brackets-id='3637' href="#">
                <p data-brackets-id='3638' class="footer-company-name">Website built by <br data-brackets-id='3639'>Daniel O' Keeffe &copy; 2019</p>
            </a>
            <ul data-brackets-id='3640' class="foot-nav">
                <a data-brackets-id='3641' class="smaller" href="UserController?menu=Cookies">
                    <li data-brackets-id='3642' class="smaller">Cookie Policy</li>
                </a>
                <a data-brackets-id='3643' class="smaller" href="UserController?menu=Terms">
                    <li data-brackets-id='3644' class="smaller">Terms &#38 Conditons</li>
                </a>
                <a data-brackets-id='3645' class="smaller" href="UserController?menu=Privacy">
                    <li data-brackets-id='3646' class="smaller">Privacy Policy</li>
                </a>
            </ul>
        </div>
        <!--scroll top-->
        <div data-brackets-id='3647' class='scrolltop'>
            <div data-brackets-id='3648' class='scroll icon'><i data-brackets-id='3649' class="fa fa-4x fa-angle-up"></i></div>
        </div>
    </div>

    <!--scripts-->
    <script data-brackets-id='3650' src="js/app.js"></script>
    <script data-brackets-id='3651' src="js/testimonial.js"></script>
    <script data-brackets-id='3652' src="js/scrollToTop.js"></script>
    <!--animate on scroll-->
    <script data-brackets-id='3653' src="https://unpkg.com/aos@next/dist/aos.js"></script>
    <script data-brackets-id='3654'>
        AOS.init();
    </script>

</body></html>

