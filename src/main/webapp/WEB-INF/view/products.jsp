<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
</head>

<body>
<h1>Welcome page</h1>


<c:forEach var="product" items="${productsList}">
<ul>
    <td>${product.id}</td>
    <td>${product.title}</td>
    <td>${product.cost}</td>
</ul>
</c:forEach>


<%--, ${name}.--%>

</body>
</html>