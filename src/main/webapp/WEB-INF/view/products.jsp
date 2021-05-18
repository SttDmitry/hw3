<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
</head>

<body>
<h1>Welcome page</h1>


<c:forEach var="product" items="${products}">
    <tr>
        <td><c:out value="${product['id']}"/>
        <td><c:out value="${product['title']}"/>
        <td><c:out value="${product['cost']}"/>
    </tr>
</c:forEach>

<%--, ${name}.--%>

</body>
</html>