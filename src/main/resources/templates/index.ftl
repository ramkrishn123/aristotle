<!doctype html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head
<#include "assets/head.ftl">
<link rel="stylesheet" href="/css/cover.css"/>
</head>
<body class="text-center">

<div class="cover-container d-flex h-100 p-3 mx-auto flex-column">
    <header class="masthead mb-auto">
        <div class="inner">
            <h3 class="masthead-brand">Aristotle Education Platform</h3>
            <nav class="nav nav-masthead justify-content-center">
                <a class="nav-link active" href="/">Home</a>
                <a class="nav-link" href="/methodology.html">Methodology</a>
                <a class="nav-link" href="/teachers.html">Teachers</a>
                <a class="nav-link" href="/students.html">Students</a>
                <a class="nav-link" href="/parents.html">Parents</a>
                <a class="nav-link" href="/about.html">About</a>
            </nav>
        </div>
    </header>
    <main role="main" class="inner cover">
        <h1 class="cover-heading">Aristotle</h1>
        <p class="lead">
            Aristotle is an online education platform currently in development by Varun Patel and Milan Bumbulovic
        </p>
        <p class="lead">
            <#include "assets/debug.ftl">
        </p>
    </main>
    <#include "assets/footer.ftl">
</div>
</body>
</html>


