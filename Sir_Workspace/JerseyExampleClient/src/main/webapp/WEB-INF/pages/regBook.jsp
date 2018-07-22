<%@page isELIgnored="false" %>
<html>

<body>
${responseDTO.msg}
<form action="registerBook" method="post">
Enter Isbn <input type="text" name="isbn"/><br/>
Enter title <input type="text" name="title"/><br/>
Enter author <input type="text" name="author"/><br/>
Enter price <input type="text" name="price"/><br/>
Enter publication <input type="text" name="publication"/><br/>
<input  type="submit" value="register"/>
</form>
</body>
</html>