<!doctype html>
<html lang="en">
<#include "assets/head.ftl">
<body>
<div class="wrapper">
    <#include "assets/sidebar.ftl">
    <div class="main-panel">
        <#include "assets/navbar.ftl">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-6 col-sm-8 ml-auto mr-auto">
                    <form class="form" method="/login/process" action="">
                        <div class="card card-login card-hidden">
                            <div class="card-header card-header-info text-center">
                                <h4 class="card-title">Log In</h4>
                            </div>
                            <div class="card-body ">
                                    <span class="bmd-form-group">
                                        <div class="input-group">
                                            <div class="input-group-prepend">
                                                <span class="input-group-text">
                                                    <i class="material-icons">email</i>
                                                </span>
                                            </div>
                                            <input type="email" name="username" class="form-control"
                                                   placeholder="Email">
                                        </div>
                                    </span>
                                <span class="bmd-form-group">
                                        <div class="input-group">
                                            <div class="input-group-prepend">
                                                <span class="input-group-text">
                                                    <i class="material-icons">lock_outline</i>
                                                </span>
                                            </div>
                                            <input type="password" name="password" class="form-control"
                                                   placeholder="Password">
                                        </div>
                                    </span>
                            </div>
                            <div class="card-footer justify-content-center">
                                <input type="submit" class="btn btn-outline-info btn-link" value="Log In">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <#include "assets/footer.ftl">
    </div>
</div>
<#include "assets/scripts.ftl">
</body>
</html>
