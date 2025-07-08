<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Owner Registration Form</title>
</head>
<body style="background-color: #f2f2f2;">
<h2>Register Car Owner</h2>

<form action="saveOwner" method="post">
    ID: <input type="text" name="id"/><br/><br/>
    Owner Name: <input type="text" name="name"/><br/><br/>
    <input type="submit" value="Register"/>
</form>

</body>
</html>
