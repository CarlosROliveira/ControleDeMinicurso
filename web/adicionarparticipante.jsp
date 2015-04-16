<%-- 
    Document   : adicionar
    Created on : 09/04/2015, 16:12:41
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="persistence.MinicursoDAO"%>
<%@page import="model.Minicurso"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            form fieldset{
                width: 360px;
                height:260px;
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
            int id=Integer.valueOf(request.getParameter("minicurso"))-1;
            
            List<Minicurso> minicursos = MinicursoDAO.getInstance().getAll();
            
        %>
        
        <form name="frm-cad-minicurso" method="post" id="frm-cadastro" action="frontcontroller?action=CadastrarParticipante" >
            <fieldset>
            <legend>Adicionar Participante</legend>
            <label>ID:</label>
                <input type="text" name="id" value="<%=minicursos.get(id).getId()%>" readonly/>
            <label>Nome</label>
            <input type="text" name="nome" value=""/><br>
            <label>Forma de pagamento:</label>
            <input type="radio" name="forma" value="Cartao">Cartão  <br>
            <input type="radio" name="forma" value="Boleto">Boleto  <br><br>
            <input type="submit" value="Salvar" id="btn" onClick="getEstadoSelecionado()"/>
            </fieldset> 
        </form>
            
        <script>
            function getEstadoSelecionado(){
                var listaMarcados = document.getElementsByName("estado");
                for(loop = 0 ; loop < listaMarcados.length; loop++){
                    var item = listaMarcados[loop];
                    if(item.checked){
                        var estado = item.value;
                        return estado;
                    }
                }
            }
        </script>
           
    </body>
</html>
