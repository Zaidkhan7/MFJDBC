<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> LOGIN PAGE</h1>
<form:form action="login" method="post" modelAttribute="modeldemo">

Enter Email 
<form:input path="email"/>
Enter Password
<form:password path="password"/>
Enter First Name
<form:input path="fname"/>
Enter Last Name
<form:input path="lname"/>
Enter Roll Number
<form:input path="rollnumber"/>


<form:button>Submit</form:button>

</form:form>
<h3> ${message}</h3>
</body>
</html>