<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to RiyaVerse</title>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }

        body {
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 10px;
            background: linear-gradient(135deg, #71b7e6, #9b59b6);
        }

        .container {
            max-width: 700px;
            width: 100%;
            background-color: #fff;
            padding: 25px 30px;
            border-radius: 5px;
            box-shadow: 0 5px 10px rgba(0, 0, 0, 0.15);
            text-align: center;
        }

        .container .title {
            font-size: 25px;
            font-weight: 500;
            position: relative;
            text-align: center;
            margin-bottom: 20px;
        }

        .container .title::before {
            content: "";
            position: absolute;
            left: 0;
            bottom: 0;
            height: 3px;
            width: 30px;
            border-radius: 5px;
            background: linear-gradient(135deg, #71b7e6, #9b59b6);
        }

        .container .logo {
            width: 200px;
            height: auto;
            margin-bottom: 20px;
        }

        .container .button {
            height: 45px;
            margin: 15px 0;
        }

        .container .button input {
            height: 100%;
            width: 100%;
            border-radius: 5px;
            border: none;
            color: #fff;
            font-size: 18px;
            font-weight: 500;
            letter-spacing: 1px;
            cursor: pointer;
            transition: all 0.3s ease;
            background: linear-gradient(135deg, #71b7e6, #9b59b6);
        }

        .container .button input:hover {
            background: linear-gradient(-135deg, #71b7e6, #9b59b6);
        }

        .button {
            display: inline-block;
            padding: 8px 16px;
            text-decoration: none;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="title">Welcome To RiyaVerse</div>
        <img src="https://www.pngitem.com/pimgs/m/208-2088584_employee-png-transparent-png.png" class="logo">
        <div class="content">
            <div>
                <span class="details">Functions:</span><br> 
                <a href="Add_employee.jsp" class="button">Add Employee</a><br> 
                <a href="Delete.jsp" class="button">Delete Employee</a><br>
                <a href="Update.jsp" class="button">Update Employee Details</a><br>    
                <a href="Singledata.jsp" class="button">Select Employee</a><br>             
                <a href="viewall" class="button">See All Employee Details</a><br>
            </div>
        </div>
    </div>
</body>
</html>
