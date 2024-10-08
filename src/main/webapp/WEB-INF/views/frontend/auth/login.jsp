<%--
  Created by IntelliJ IDEA.
  User: umami
  Date: 8/29/2023
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Greenelec</title>
    <link rel="icon" href="${BASE_URL}assets/images/G_logo.png"/>
    <link rel="stylesheet" href="${BASE_URL}assets/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" href="${BASE_URL}assets/css/style.css"/>
</head>
<body style="background-color: #74EBD5; background-image: linear-gradient(90deg,  #74EBD5 0%, #9FACE6 100%);">

<div class="container-fluid ">
    <div class="row">
        <!--header-->
        <div class="col-12 mt-3">
            <div class="row">
                <div class="col-12 text-center">
                    <h1 class="logot fw-bold ">Greenelec</h1>
                </div>
                <div class="col-12 text-center">
                    <span class="text-center title">Hi,Welcome to Greenelec</span>
                </div>
            </div>
        </div>
        <!--header-->
        <!--content-->
        <div class="col-12 px-5">
            <div class="row">
                <div class="col-12 col-sm-10 offset-sm-1 col-md-8 offset-md-2 col-lg-6 offset-lg-3 col-xl-4 offset-xl-4 d-none back p-5 rounded shadow-lg fw-bold mt-1" id="signUpBox">
                    <div class="row g-3">
                        <div class="col-12">
                            <p class="title2 fs-3">Create New Account</p>
                            <p id="msg" class="text-danger"></p>
                        </div>

                        <div class="col-6">
                            <label class="form-label">First Name</label>
                            <input class="form-control" type="text" id="fname" />
                        </div>

                        <div class="col-6">
                            <label class="form-label">Last Name</label>
                            <input class="form-control" type="text" id="lname" />
                        </div>

                        <div class="col-12">
                            <label class="form-label">Email</label>
                            <input class="form-control" type="email" id="email" />
                        </div>

                        <div class="col-12">
                            <label class="form-label">Password</label>
                            <input class="form-control" type="password" id="password" />
                        </div>

                        <div class="col-12">
                            <label class="form-label">Mobile</label>
                            <input class="form-control" type="number" id="mobile" />
                        </div>


                        <div class="col-12 d-grid">
                            <button class="btn btn-primary fw-bold SignUp">Sign Up</button>
                        </div>

                        <div class="col-12 d-grid">
                            <button class="btn btn-warning fw-bold" onclick="changeView();">Already have an account? Sign In</button>
                        </div>

                    </div>
                </div>
                <div class="col-12 col-sm-10 offset-sm-1 col-md-8 offset-md-2 col-lg-6 offset-lg-3 col-xl-4 offset-xl-4 back p-5 rounded shadow-lg fw-bold mt-2" id="signInBox">
                    <div class="row g-3">
                        <div class="col-12">
                            <p class="title2 fs-3">Sign In To Your Account</p>
                            <p id="msg2" class="text-danger"></p>
                        </div>

                        <div class="col-12">

                            <label class="form-label">Email</label>
                            <input class="form-control" type="email" id="email2" />
                        </div>

                        <div class="col-12">
                            <label class="form-label">Password</label>
                            <input class="form-control" type="password" id="password2" />
                        </div>

                        <div class="col-6">
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" id="remember" />
                                <label class="form-check-label">Remember Me</label>
                            </div>
                        </div>
                        <div class="col-6">
                            <a href="#" class="link-primary" onclick="forgotPassword();">Forgot Password?</a>
                        </div>


                        <div class="col-12 d-grid">
                            <button class="btn btn-primary fw-bold" onclick="signIn();">Sign In</button>
                        </div>

                        <div class="col-12 d-grid">
                            <button class="btn btn-warning fw-bold" onclick="changeView();">New to Greenelec? Join Now</button>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <!-- content -->

        <!-- footer -->
        <div class="col-12 d-none d-lg-block fixed-bottom">
            <p class="text-center ">&copy; 2021 Greenelec.lk All Rights Reserved</p>
        </div>
        <!-- footer -->
        <!--modal-->
        <div class="modal fade" tabindex="-1" id="forgetPasswordModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title text-success fw-bold">Greenelec Password Change.</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="row g-3">
                            <div class="col-6">
                                <label class="form-label">New Password</label>
                                <div class="input-group mb-3">
                                    <input class="form-control" type="password" id="np" />
                                    <button class="btn btn-outline-primary" type="button" id="npb" onclick="showPassword1();">Show</button>
                                </div>

                            </div>
                            <div class="col-6">
                                <label class="form-label">Re-type Password</label>
                                <div class="input-group mb-3">
                                    <input class="form-control" type="password" id="rnp" />
                                    <button class="btn btn-outline-primary" type="button" id="rnpb" onclick="showPassword2();">Show</button>
                                </div>
                            </div>
                            <div class="col-12">
                                <label class="form-label">Verification Code</label>
                                <input class="form-control" type="text" id="vc" />
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-success" onclick="resetPassword();">Reset</button>
                    </div>
                </div>
            </div>
        </div>
        <!--modal-->
    </div>

</div>

<script src="${BASE_URL}assets/js/script.js"></script>
<script src="${BASE_URL}assets/bootstrap/js/bootstrap.js"></script>

<script type="text/javascript">
    document.querySelector(".SignUp").addEventListener('click', function () {
        let firstname = document.getElementById('fname').value;
        let lastname = document.getElementById('lname').value;
        let email = document.getElementById('email').value;
        let password = document.getElementById('password').value;
        let mobile = document.getElementById('mobile').value;

        fetch('${BASE_URL}register', {
            method: 'post',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                firstname: firstname,
                lastname: lastname,
                email: email,
                password: password,
                mobile: mobile
            })
        }).then(async response => {
            if (response.ok) {
                window.location.href = "${BASE_URL}login"
            }else {
                return await response.text();
            }
            return await response.text();
        }).then(text => alert(text)).catch(error =>{})
    });
</script>

</body>
</html>
