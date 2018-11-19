<html xmlns:th="http://www.thymeleaf.org">

<head>
<title>First Web Application</title>
</head>

<body bgcolor="#FFF8DC" >
    <font color="red">${errorMessage}</font>
    <form method="post">
        Mobile NO  : <input type="text" name="mobileno" />
        Password    : <input type="password" name="passcode" /> 
        <input type="submit" />
    </form>
</body>

</html>