<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Header</title>
</head>
<body>
<header class="header">

    <nav class="container container--70">
        <ul class="nav--actions">
            <li><a href="<c:url value="/login" />" class="btn btn--small btn--without-border">Zaloguj</a></li>
            <li><a href="/register" class="btn btn--small btn--highlighted">Załóż konto</a></li>
        </ul>

        <ul>
            <li><a href="/" class="btn btn--without-border active">Start</a></li>
            <li><a href="#steps" class="btn btn--without-border">O co chodzi?</a></li>
            <li><a href="#about-us" class="btn btn--without-border">O nas</a></li>
            <li><a href="#help" class="btn btn--without-border">Fundacje i organizacje</a></li>
            <li><a href="#contact" class="btn btn--without-border">Kontakt</a></li>
        </ul>
    </nav>

</header>
<script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>
