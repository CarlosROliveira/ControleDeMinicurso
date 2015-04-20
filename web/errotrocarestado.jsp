<%-- 
    Document   : errotrocarestador
    Created on : 16/04/2015, 17:17:28
    Author     : Admin
--%>
<%@page import="controller.ExibeTemplate"%>
<%@page import="controller.ExibeMensagemObserver"%>
<%@page import="controller.ExibeMensagem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro ao Trocar Estado</title>
    </head>
    <body>
        <h1><%= ExibeMensagem.getMensagem()%></h1><br>
        <h1><%= ExibeTemplate.getOrganizador().getFuncionario()%></h1><br>
        <h1><%= ExibeMensagemObserver.getMensagem()%></h1><br>

       
        
        <a href="frontcontroller?action=LerMiniCurso" >Voltar - Listar Minicursos</a>
    </body>
</html>
