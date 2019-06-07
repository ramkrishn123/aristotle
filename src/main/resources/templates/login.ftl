<!doctype html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head
<#include "assets/head.ftl">
<link rel="stylesheet" href="/css/auth.css"/>
</head>
<body>
<form class="form-signin" action="/login/process/" method="post">
    <div class="text-center mb-4">
        <img class="mb-4" src="/favicon.png" alt="Luscinia Logo" width="72" height="72">
        <h1 class="h3 mb-3 font-weight-normal">Log In</h1>
    </div>
    <div class="form-label-group">
        <input type="email" id="username" class="form-control" placeholder="Email address" name="username" required autofocus>
        <label for="username">Email Address</label>
    </div>if

    <div class="form-label-group">
        <input type="password" id="password" class="form-control" placeholder="Password" name="password" required>
        <label for="password">Password</label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    <div class="text-center">
        <a href="/register/branch.html">Register Now</a>
    </div>
    <p class="mt-5 mb-3 text-muted text-center">
        Copyright &copy;
        <script>
            document.write(new Date().getFullYear())
        </script>
        <br />
        <a href="https://www.luscinia.ca/">
            Luscinia Enterprises Assn.
        </a>
        All Rights Reserved.<br />
        Full Source Available under GPLv3 License
    </p>
</form>
</body>
</html>