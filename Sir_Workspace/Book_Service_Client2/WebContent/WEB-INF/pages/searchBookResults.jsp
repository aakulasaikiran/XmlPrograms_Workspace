<%@page isELIgnored="false" %>
<html>
<body>
<%@include file="searchBooks.jsp" %>
<table border="1">
<tr>
<th>ISBN</th><th>BookName</th>
<th>AUTHOR</th><th>PRICE</th>
</tr>
<tr><td>
${book.isbn}</td><td>
${book.bookName}</td><td>
${book.author}</td><td>
${book.price}</td></tr>
</table>
</body>
</html>