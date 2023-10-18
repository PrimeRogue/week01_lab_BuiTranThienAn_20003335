<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<c:set var="contextPath" value="${pageContext.request.contextPath}" />--%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet">
    <style>
    </style>
</head>
<body>
<div class="container">
    <form action="processLogin.jsp" method="post">
        <h2>Đăng Nhập</h2>
        <div class="form-group">
            <label for="accountID">Account ID:</label>
            <input type="text" class="form-control" id="accountID" name="accountID" required>
        </div>
        <div class="form-group">
            <label for="password">Mật khẩu:</label>
            <input type="password" class="form-control" id="password" name="password" required>
        </div>
        <button type="submit" class="btn btn-primary">Đăng Nhập</button>
    </form>
</div>
</body>
</html>