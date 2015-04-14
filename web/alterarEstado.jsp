<%-- 
    Document   : mudar
    Created on : 09/04/2015, 19:07:43
    Author     : Admin
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
                height:340px;
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

        <form name="frm-cad-minicurso" method="post" id="frm-cadastro" action="frontcontroller?action=AlterarMiniCurso" >
            <fieldset>
                <legend>Mundando estado do Minicurso</legend>
                <label>ID:</label>
                <input type="text" name="id" value="<%=minicursos.get(id).getId()%>" readonly/>
                <label>Título</label>
                <input type="text" name="titulo" value="<%=minicursos.get(id).getTitulo()%>" readonly/>
                <label>Estado atual:</label>
                <input type="text" name="status" value="<%=minicursos.get(id).getMinicursoEstado().getEstado()%>" readonly/>
                <label>Opções</label>
                <input type="radio" name="estado" value="Minicurso Adiado">Adiar  <br>
                <input type="radio" name="estado" value="Minicurso Cancelado">Cancelar  <br>
                <input type="radio" name="estado" value="Minicurso Disponivel">Disponibilizar  <br>
                <input type="radio" name="estado" value="Minicurso em Execucao">Iniciar  <br>
                <input type="radio" name="estado" value="Minicurso Fechado">Fechar  <br>
                <input type="submit" value="Mudar Estado" id="btn" onClick="getEstadoSelecionado()"/>
            </fieldset> 
        </form>
                <script>
                    function getEstadoSelecionado(){
                        var listaMarcados = document.getElementsByName("estado");
                        for(loop = 0 ; loop < listaMarcados.length; loop++){
                            var item = listaMarcados[loop];
                            if(item.checked){
                                var estado = item.value;
                                alert(estado);
                                return estado;
                            }
                        }
                    }
                </script>
                
        <%
                    
                
            
        %>
    </body>
</html>
