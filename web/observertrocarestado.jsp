<%-- 
    Document   : observertrocarestado
    Created on : 16/04/2015, 17:17:28
    Author     : Admin
--%>

<%@page import="controller.ExibeMensagemObserver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro ao Trocar Estado</title>
    </head>
    <body>
        <h1><%= ExibeMensagemObserver.getMensagem()%></h1>
        
        
        <a href="frontcontroller?action=LerMiniCurso" >Voltar - Listar Minicursos</a>
    </body>
</html>
