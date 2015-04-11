<%-- 
    Document   : mudar
    Created on : 09/04/2015, 19:07:43
    Author     : Junior
--%>

<%@page import="persistence.MinicursoDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Minicurso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle Minicurso</title>
        <style type="text/css">
            form fieldset{
                width: 400px;
                height:280px;
                margin: 0 auto;
            }    
            form label{
                display: block;
            }
            form input[type=text]{
                width: 350px;
                margin: 5px 0;
                display: block;
                padding: 5px;
            }
            #btn{
                width: 150px;
            }
        </style>
    </head>
    <body>
        
        <%
            int id=Integer.valueOf(request.getParameter("minicurso"));
            
            List<Minicurso> minicursos = MinicursoDAO.getInstance().getAll();
            
        %>           

        <form name="frm-cad-minicurso" method="post" id="frm-cadastro" action="frontcontroller?action=GravarMiniCurso" >
            <fieldset>
                <legend>Mundado estado do Minicurso</legend>
                <label>Título</label>
                <input type="text" name="titulo" value="<%=minicursos.get(id).getTitulo()%>"/>
                <label>Estado atual:</label>
                <input type="text" name="status" value="<%=minicursos.get(id).getMinicursoEstado().getEstado()%>"/>
                <label>Opções</label>
                <input type="radio" name="estado" value="adiar">Adiar  <br>
                <input type="radio" name="estado" value="cancelar">Cancelar  <br>
                <input type="radio" name="estado" value="disponibilizar">Disponibilizar  <br>
                <input type="radio" name="estado" value="iniciar">Iniciar  <br>
                <input type="radio" name="estado" value="fechar">Fechar  <br>
                <input type="submit" value="Mudar Estado" id="btn"/>
            </fieldset> 
        </form>
                
        <%
                    
                
            
        %>
    </body>
</html>
