<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
  </head>
  <body>
<%@include file="header.jsp"%>
<div class="slogan container container--90">
    <section class="login-page">
      <h2>Załóż konto</h2>
      <form:form method="post" modelAttribute="user">
        <div class="form-group">
          <form:input path="name" placeholder="Imię" />
          <p class="errors"><form:errors path="name"/></p>
        </div>
        <div class="form-group">
          <form:input path="surname" placeholder="Nazwisko" />
          <p class="errors"><form:errors path="surname"/></p>
        </div>
        <div class="form-group">
          <form:input type="email" path="email" placeholder="Email" />
          <p class="errors"><form:errors path="email"/></p>
        </div>
        <div class="form-group">
          <form:password path="password" placeholder="Hasło" />
          <p class="errors"><form:errors path="password"/></p>
        </div>
        <div class="form-group">
          <form:input type="password" path="repassword" placeholder="Powtórz hasło"/>
        </div>

          <div class="form-group form-group--buttons">
            <a href="<c:url value="/login" />" class="btn btn--without-border">Zaloguj się</a>
            <button class="btn" type="submit">Załóż konto</button>
        </div>
      </form:form>
    </section>
</div>

    <%@include file="footer.jsp" %>
    <script src="<c:url value="/resources/js/app.js"/>"></script>
  </body>
</html>
