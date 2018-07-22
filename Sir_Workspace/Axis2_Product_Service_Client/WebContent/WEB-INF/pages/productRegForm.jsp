<%@page isELIgnored="false" %>
<html>
<body>
${status}
	<h2 align="center">Product Reg Form</h2>
	<form action="registerProduct" method="post">
		Product Id :<input type="text" name="productId" /> 
		<br/>Product Name :<input
			type="text" name="productName" /> 
			<br/>Product Price :<input type="text"
			name="productPrice" /> <br/><input type="submit" value="register" />
	</form>
</body>
</html>