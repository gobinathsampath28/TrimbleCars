<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>Trimble Cars - Home</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        nav {
            background-color: #333;
            padding: 12px;
        }
        nav a {
            color: white; 
            margin-right: 20px;
            text-decoration: none;
            font-weight: bold;
        }
        nav a:hover {
            text-decoration: underline;
        }
        .container {
            padding: 40px;
            text-align: center;
        }
    </style>
</head>
<body>
    <nav>
        <a href="/">Home</a>
        <a href="/about">About</a>
        <a href="/contact">Contact</a>
        <a href="register.jsp">Register</a>
        <a href="/admin">Admin</a>
    </nav>

    <div class="container">
        <h1>Welcome to Trimble Cars!</h1>
        <p>Your reliable car leasing and service partner.</p>
    </div>
</body>
</html>