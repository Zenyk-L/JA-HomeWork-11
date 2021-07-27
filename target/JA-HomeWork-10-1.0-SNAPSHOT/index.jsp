<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <link rel="stylesheet" href="css/login.css">
    <title>Index</title>
</head>
<body>



<div class="login-page">
    <div class="form">
        <form class="register-form">
            <input class="firstName" type="text" placeholder="firstName"/>
            <input class="lastName" type="text" placeholder="lastName"/>
            <input class="email" type="text" placeholder="email address"/>
            <input class="password" type="password" placeholder="password"/>
            <input class="cpassword" type="password" placeholder="confirm password"/>

            <button class="register">Register</button>
            <p class="message">Already registered? <a href="#">Sign In</a></p>
        </form>
        <form class="login-form">
            <input class="email" type="text" placeholder="email address" value="q"/>
            <input class="password" type="password" placeholder="password" value="q"/>
            <button class="login">Login</button>
            <p class="message">Not registered? <a href="#">Create an account</a></p>
        </form>
    </div>
    <div class="alert alert-success alert-dismissible fade show"
         role="alert">
        <b>Success</b> You are registered.
        <button type="button" class="btn-close" data-bs-dismiss="alert"
                aria-label="Close"></button>
    </div>
</div>



<jsp:include page="footer.jsp"></jsp:include>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

<script
        src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="js/login.js"></script>


</body>
</html>