<%-- 
    Document   : adicionar
    Created on : 09/04/2015, 16:12:41
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
        <style type="text/css">
            form fieldset{
                width: 400px;
                height:340px;
                margin: 0 auto;
            }    
            form label{
                display: block;
            }
            form input{
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
        
        
        <form name="frm-cad-minicurso" method="post" id="frm-cadastro" action="frontcontroller?action=GravarMiniCurso" >
            <fieldset>
            <legend>Adicionar Minicurso</legend>
            <label>T�tulo</label>
            <input type="text" name="titulo" value=""/>
            <label>Data de Inicio</label>
            <input type="text" name="dataInicio" value=""/>
            <label>Dura��o</label>
            <input type="text" name="duracao" value=""/>
            <label>Valor</label>
            <input type="text" name="valor" value=""/>
            <label>Vagas dispon�veis</label>
            <input type="text" name="vagasDisp" value=""/>
            <input type="submit" value="Salvar" id="btn"/>
            </fieldset> 
        </form>
           
    </body>
</html>
