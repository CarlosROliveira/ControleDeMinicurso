<%-- 
    Document   : errotrocarestador
    Created on : 16/04/2015, 17:17:28
    Author     : Admin
--%>

<%@page import="controller.ExibeMensagem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= ExibeMensagem.getMensagem()%></h1>
        <a href="frontcontroller?action=LerMiniCurso" >Voltar - Listar Minicursos</a>
    </body>
</html>
