<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Details</title>
</head>
<body>
	<h2>Lead Details </h2>
	
	FirstName:${lead.firstName}<br/>
	LastName :${lead.lastName }<br/>
	Email	 :${lead.email }<br/>
	Mobile	 :${lead.mobile }<br/>
	Source	 :${lead.source }<br/>
	
	
	<form action="sendEmail" method="post">
	<input type="hidden" value="${lead.email }" name="email"/>
	<input type="submit" value="SendEmail"/>
	</form>
	
	<form action="convertLead" method="post">
	<input type="hidden" value="${lead.id}" name="id"/>
	<input type="submit" value="Convert into Contacts"/></form>
</body>
</html>