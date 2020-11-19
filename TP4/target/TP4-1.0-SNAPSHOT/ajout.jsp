<%--
  Created by IntelliJ IDEA.
  User: hazem
  Date: 19/11/2020
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter</title>
</head>
<body>

<form method="post" action="ajout">
    <label>ID : <input  name="id" type="number"></label>
    <br>
    <label>email : <input name="email" type="text"></label>
    <br>
    <label>Ville : <input name="ville" type="text"></label>
    <br>
    <label>Login : <input name="login" type="text"></label>
    <br>
    <label>pass : <input name="pass" type="text"></label>
    <br>
    <input type="submit" value="Envoyer">
</form>
</body>
</html>
