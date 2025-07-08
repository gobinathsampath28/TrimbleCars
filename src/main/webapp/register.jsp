<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register - Select User Type</title>
    <style>
        body {
            background-color: #f2f2f2;  /* same gray as home.jsp */
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 100px;
        }

        .card {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            display: inline-block;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        .button {
            display: block;
            margin: 20px auto;
            padding: 12px 25px;
            font-size: 16px;
            background-color: #3b3b3b ;
            color: white;
            text-decoration: none;
            border: none;
            border-radius: 5px;
        }

        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="card">
    <h2>Select Registration Type</h2>
    <form action="ownerForm.jsp">
        <button class="button">Register as Car Owner</button>
    </form>
    <form action="registerCustomer.jsp">
        <button class="button">Register as End User</button>
    </form>
</div>
</body>
</html>
