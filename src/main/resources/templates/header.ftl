<body>
<div class="wrapper ">
    <div class="sidebar" data-color="azure" data-background-color="white">
        <div class="logo">
            <a href="/" class="simple-text logo-normal">
                Aristotle
            </a>
        </div>
        <#if login??>
        <div class="sidebar-wrapper">
            <ul class="nav">
                <li class="nav-item active  ">
                    <a class="nav-link" href="/">
                        <i class="material-icons">home</i>
                        <p>Home</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="/locker/">
                        <i class="material-icons">dashboard</i>
                        <p>E-Locker</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">view_list</i>
                        <p>Class</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">assignment</i>
                        <p>Resources</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">assessment</i>
                        <p>Assessment</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">apps</i>
                        <p>More</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">help</i>
                        <p>support</p>
                    </a>
                </li>
            </ul>
        </div>
        <#else>
        <div class="sidebar-wrapper">
            <ul class="nav">
                <li class="nav-item active  ">
                    <a class="nav-link" href="/">
                        <i class="material-icons">home</i>
                        <p>Home</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="/locker/">
                        <i class="material-icons">class</i>
                        <p>method</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">view_list</i>
                        <p>Class</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">assignment</i>
                        <p>Resources</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">assessment</i>
                        <p>Assessment</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">apps</i>
                        <p>More</p>
                    </a>
                </li>
                <li class="nav-item active  ">
                    <a class="nav-link" href="#0">
                        <i class="material-icons">help</i>
                        <p>support</p>
                    </a>
                </li>
            </ul>
        </div>
        </#if>
    </div>
    <div class="main-panel">
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
            <div class="container-fluid">
                <div class="navbar-wrapper">
                    <#if page??>
                        ${page}
                    </#if>
                </div>
                <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navigation-index"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="navbar-toggler-icon icon-bar"></span>
                    <span class="navbar-toggler-icon icon-bar"></span>
                    <span class="navbar-toggler-icon icon-bar"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end">
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link" href="/" id="navbarDropdownMenuLink" data-toggle="dropdown"
                               aria-haspopup="true" aria-expanded="false">
                                <i class="material-icons">notifications</i>
                                <#if notificationsQuantity??>
                                    <span class="notification">
                                            ${notificationsQuantity}
                                     </span>
                                </#if>
                                <p class="d-lg-none d-md-block">
                                    Some Actions
                                </p>
                            </a>
                            <#if notifications??>
                                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                    <#list notifications as n>
                                        <a class="dropdown-item" href="#">${n}</a>
                                    </#list>
                                </div>
                            </#if>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link" href="#pablo" id="navbarDropdownProfile" data-toggle="dropdown"
                               aria-haspopup="true" aria-expanded="false">
                                <i class="material-icons">person</i>
                                <p class="d-lg-none d-md-block">
                                    Account
                                </p>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownProfile">
                                <#if user??>
                                    <a class="dropdown-item" href="/profile/">Profile</a>
                                    <a class="dropdown-item" href="/settings/">Settings</a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="/logout/">Log out</a>
                                <#else>
                                    <a class="dropdown-item" href="/login/">Log In</a>
                                    <a class="dropdown-item" href="/register/">Register</a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="/support/">Support</a>
                                </#if>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
