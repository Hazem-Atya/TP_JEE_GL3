<%@ page import="metier.Utilisateur" %>
<%@ page import="java.util.Vector" %><%--
  Created by IntelliJ IDEA.
  User: hazem
  Date: 19/11/2020
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2">
    <tr>
        <th>ID</th>
        <th>email</th>
        <th>Ville</th>
    </tr>
    <%
        Vector <Utilisateur> users = (Vector)request.getAttribute("users");
        for(Utilisateur u :users)
        {
    %>
    <tr>
        <td><%=u.getIdUser()%></td>
        <td><%=u.getEmail()%></td>
        <td><%=u.getVille()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
