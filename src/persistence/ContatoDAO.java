package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import state.Minicurso;

/**
 *
 * @author Gilson
 */
public class ContatoDAO {
   private static ContatoDAO instance = new ContatoDAO();
   
   private ContatoDAO() {}    
   
    public static ContatoDAO getInstance(){
        return instance;
    }
     
    public void save (Minicurso minicurso) throws SQLException,
            ClassNotFoundException
    {
        Connection conn = null;
        Statement st = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into Minicurso (titulo, datainicio, duracao, valor, status, vagasdisp)" +
                        " values ('" + minicurso.getTitulo() + "', '" + minicurso.getDataInicio()+ "', '" + minicurso.getDuracao()+ "', '" + minicurso.getValor()+ "', '" + minicurso.getMinicursoEstado()+ "', '" + minicurso.getVagasDisp()+ "')");
         } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn,st);
        }
        
    }
    
    public void closeResources(Connection conn, Statement st){
    try{
        if(st!=null) st.close();
        if(conn!=null) conn.close();
    } catch(SQLException e) {
        
    }
  }
}
