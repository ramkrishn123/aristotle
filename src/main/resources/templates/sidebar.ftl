<!-- SIDEBAR -->
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