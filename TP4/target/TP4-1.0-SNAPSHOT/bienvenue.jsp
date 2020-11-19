<%@ page import="metier.Utilisateur" %><%--
  Created by IntelliJ IDEA.
  User: hazem
  Date: 19/11/2020
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bienvenue</title>
</head>
<body>
<%
    HttpSession maSession = request.getSession(false);
    Utilisateur u = (Utilisateur) maSession.getAttribute("user");

%>
<ul>
    <li>Id du user : <%=u.getIdUser()%></li>
    <li>Login : <%=u.getLogin()%></li>
    <li>Pass : <%=u.getPass()%></li>
    <li>Email : <%=u.getEmail()%></li>
    <li>Ville : <%=u.getVille()%></li>
</ul>
</body>
</html>
