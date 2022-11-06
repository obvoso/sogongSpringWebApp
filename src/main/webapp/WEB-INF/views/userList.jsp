<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>User List</title>
</head>
<body>
  <h4>모든 사용자 정보</h4>
  <table border = 2>
    <tr>
      <td>ID</td>
      <td>PASSWORD</td>
    </tr>
    <c:forEach var = "Account" items = "${list}">
      <tr>
        <td>${Account.getId()}</td>
        <td>${Account.getPassword()}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
