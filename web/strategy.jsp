<%-- 
    Document   : Strategy
    Created on : 16/04/2015, 18:52:51
    Author     : Admin
--%>

<%@page import="controller.ExibeStrategy"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Strategy</title>
    </head>
    <body>
        <h1><%= ExibeStrategy.getFormaDePagamento().getNome()+ " "+
                ExibeStrategy.getFormaDePagamento().getPromocao() %></h1>
        <a href="frontcontroller?action=LerMiniCurso" >Voltar - Listar Minicursos</a>
    </body>
</html>
