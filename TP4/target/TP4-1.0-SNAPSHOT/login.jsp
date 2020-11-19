<%--
  Created by IntelliJ IDEA.
  User: hazem
  Date: 19/11/2020
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String msg = (String) request.getAttribute("msg");
    if (msg!=null)
    {
%>
<h1 style="color: red"><%=msg%></h1>
<%
    }
%>
<P> Please fill out this form with your name. Thanks! </P>
<FORM METHOD="post" action="login">
    <P> Please enter your login and password: </P>
    <P> login: <INPUT NAME="login" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20"></P>
    <P> password: <INPUT NAME="password" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20"></P>
    <P> Thank you! <INPUT TYPE="SUBMIT"> </P>
</FORM>