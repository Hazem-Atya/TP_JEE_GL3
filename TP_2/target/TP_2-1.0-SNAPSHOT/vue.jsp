<%--
  Created by IntelliJ IDEA.
  User: hazem
  Date: 05/11/2020
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int nbCol= Integer.parseInt(request.getParameter("nbCol"));
    int nbLigne= Integer.parseInt(request.getParameter("nbLigne"));
%>
<table border="2">
    <% for (int i=0;i<nbLigne;i++)
{
%>
    <tr>
        <%
            for(int j=0;j<nbCol;j++)
            {

        %>
        <td><%=" "+j+" "%></td>
        <%
            }
        %>
    </tr>
<%
    }
%>

</table>
</body>
</html>
