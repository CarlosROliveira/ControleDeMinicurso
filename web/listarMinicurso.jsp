<%-- 
    Document   : editar
    Created on : 09/04/2015, 16:13:18
    Author     : Admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Minicurso"%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Controle de Minicurso</title>
    </head>
    <body>
        <h1>Lista de Minicurso</h1>
        <%
            List<Minicurso> minicursos = new ArrayList<Minicurso>();
            minicursos = (ArrayList<Minicurso>) request.getAttribute("minicursos");
        %>
        
        <table border="1">
            <tr>
                <td>ID</td>
                <td>Titulo</td>
                <td>Data de Inicio</td>
                <td>Dura��o</td>
                <td>Valor</td>
                <td>Status</td>
                <td>Vagas disponiveis</td>
                <td>Op��o</td>
            </tr>
            <%
                if (minicursos.size() > 0) {
                    for (Minicurso minicurso : minicursos) {
            %>
            <tr>
                <td><%= minicurso.getId()%></td>
                <td><%= minicurso.getTitulo()%></td>
                <td><%= minicurso.getDataInicio()%></td>
                <td><%= minicurso.getDuracao()%></td>
                <td><%= minicurso.getValor()%></td>
                <td><%= minicurso.getMinicursoEstado()%></td>
                <td><%= minicurso.getVagasDisp()%></td>
                <td>
                    <a href="alterarEstado.jsp?minicurso=<%= minicurso.getId() %>">Mudar Estado</a>
                </td>
                <td>
                    <a href="adicionarparticipante.jsp?minicurso=<%= minicurso.getId() %>">Participar</a>
                </td>
            </tr>
            <%
                    }
                }
            %>

        </table>
            <a href="frontcontroller?action=FormularioMiniCurso" >Cadastrar novo Minicurso</a><br>
    </body>
</html>
