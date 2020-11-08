<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.ListIterator" %>
<%@ page import="myclasses.Etudiant" %>
<%@ page import="myclasses.GestionEtudiant" %>
<%--
  Created by IntelliJ IDEA.
  User: hazem
  Date: 05/11/2020
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Etudiants</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="fontawesome/css/all.min.css">
    <link rel="stylesheet" href="fontawesome/css/fontawesome.min.css">
</head>
<body>
<div class="container">
    <table class="table ">
        <tr>
            <th>Prénom</th>
            <th>Nom</th>
            <th>Age</th>
            <th>CIN</th>
            <th>Email</th>
            <th>Delete</th>
        </tr>
        <%
            List l = GestionEtudiant.getEtudiants();
            ListIterator li = l.listIterator();
            while (li.hasNext()) {
                Etudiant e = (Etudiant) li.next();
        %>
        <tr>

            <td><%=e.getPrenom()%>
            </td>
            <td><%=e.getNom()%>
            </td>
            <td><%=e.getAge()%>
            </td>
            <td><%=e.getEmail()%>
            </td>
            <td><%=e.getCin()%>
            </td>
            <td>
                <form action="supprimer" >
                    <input type="hidden" name="cin" value="<%=e.getCin()%>">
                    <button type="submit">Supprimer</button>
                </form>
            </td>
        </tr>

        <%
            }
        %>
    </table>
</div>
</body>
</html>
