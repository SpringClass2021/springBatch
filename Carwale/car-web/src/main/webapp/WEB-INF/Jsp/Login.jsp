<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<form:form method="POST" modelAttribute="userObject" action="userSignIn.do">
<table>
	<tr>
		<td>
			<div>
				<p>Username</p><form:input path="email" />
			</div>
		</td>
	</tr>
	
	<tr>
		<td>
			<div>
				<p>Password</p><form:password path="password" />
			</div>
		</td>
	</tr>
	
	<tr>
        <td colspan="2"><input type="submit" value="Submit" /></td>
    </tr>
	
</table>
</form:form>
</body>
</html>