<html xmlns:th="http://www.thymeleaf.org">

<head>
<title>First Web Application</title>
</head>

<body>
    <font color="red">${errorMessage}</font>
    <form method="post">
        Emailid : <input type="text" name="emailid" />
        Password : <input type="password" name="password" /> 
        <input type="submit" />
    </form>
</body>

</html>