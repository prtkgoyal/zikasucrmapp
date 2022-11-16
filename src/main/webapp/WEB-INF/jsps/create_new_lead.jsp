<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
	<h2>Create Lead</h2>
	<form action="save" method="post">
	<pre>
	FirstName<input type="text" name="firstName"/>
	 <p if="${fields.hasErrors('firstName')}"
               errors="${model.firstName }"></p>
	LastName<input type="text" name="lastName"/>
	Email<input type="text" name="email"/>
	Mobile<input type="text" name="mobile"/>
	Source:<select name="source">
		<option value="radio">Radio</option>
		<option value="newspaper">Newspaper</option>
		<option value="ads">Ads</option>
		<option value="television">Television</option>
		   </select>
	<input type="submit" value="save"/>
	</pre>		
	</form>
			
		
</body>
</html>