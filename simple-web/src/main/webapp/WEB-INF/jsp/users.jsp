<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<table>
    <th>
        <td>id</td>
        <td>username</td>
        <td>sex</td>
        <td>birthday</td>
    </th>
    <c:forEach items="${users}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.sex}</td>
        <td>${user.birthday}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>