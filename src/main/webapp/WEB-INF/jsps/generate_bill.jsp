<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Create Bill</h2>
	<form action="saveBill" method="post">
	<pre>
	FirstName<input type="text" name="firstName" value="${contact.firstName }"/>
	LastName<input type="text" name="lastName" value="${contact.lastName }"/>
	Email<input type="text" name="email" value ="${contact.email }"/>
	Mobile<input type="text" name="mobile" value="${contact.mobile }"/>
	Product<input type="text" name="product" />
	Amount<input type="text" name="amount"/>
	model<input type="text" name="model"/>
	<input type="submit" value="save"/>
	</pre>
	</form>
</body>
</html>