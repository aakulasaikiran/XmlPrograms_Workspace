<%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%>
<%@page isELIgnored="false" %>
<%@include file="searchBooks.jsp" %>
<table border="1">
<tr>
<th>isbn</th><th>title</th><th>author</th>
<th>publication</th><th>price</th>
</tr>
<c:choose>
<c:when test="${searchResultsList.size()>0}">
<c:forEach items="${searchResultsList}"
 var="searchResults">
<tr>
<td>${searchResults.isbn}</td>
<td>${searchResults.title}</td>
<td>${searchResults.author}</td>
<td>${searchResults.publication}</td>
<td>${searchResults.price}</td>
</tr>
</c:forEach>
</c:when>
<c:otherwise>
<tr>
<td colspan="5" align="center">
<c:out value="No Records Are Found"/>
</td></tr>
</c:otherwise>
</c:choose>
</table>