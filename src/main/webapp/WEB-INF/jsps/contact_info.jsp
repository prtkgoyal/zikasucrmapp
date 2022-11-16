<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Contact details</h2>
	FirstName:${contact.firstName }<br/>
	LastName :${contact.lastName }<br/>
	Mobile	 :${contact.mobile }<br/>
	Email	 :${contact.email }<br/>
	Source	 :${contact.source }<br/>
	
	<form action="convertcontact" method="post">
	<input type="hidden" value="${contact.id }" name="id"/>
	<input type="submit" value="Convert into Lead"/>
	</form>
</body>
</html>