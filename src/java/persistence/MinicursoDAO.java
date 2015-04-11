package persistence;

import controller.MEstadoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Minicurso;
import state.MinicursoAdiado;
import state.MinicursoCancelado;
import state.MinicursoDisponivel;
import state.MinicursoEmExecucao;
import state.MinicursoEstado;
import state.MinicursoFechado;

/**
 *
 * @author Gilson
 */
public class MinicursoDAO {
   private static MinicursoDAO instance = new MinicursoDAO();
   
   private MinicursoDAO() {}    
   
    public static MinicursoDAO getInstance(){
        return instance;
    }
    
    public List<Minicurso> getAll(){
        List<Minicurso> minicursos = new ArrayList<>();
        Connection conn = null;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
       try {
           conn = DatabaseLocator.getInstance().getConnection();
           String sql = "Select * from minicurso";
           ps = conn.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Minicurso minicurso = new Minicurso();
               minicurso.setId(rs.getInt(1));
               minicurso.setTitulo(rs.getString(2));
               minicurso.setDataInicio(rs.getString(3));
               minicurso.setDuracao(rs.getString(4));
               minicurso.setValor(rs.getFloat(5));
               
               minicurso.setMinicursoEstado(MEstadoFactory.obtemEstado(rs.getString(6)));
               
               minicurso.setVagasDisp(rs.getInt(7));
               
               minicursos.add(minicurso);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(MinicursoDAO.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(MinicursoDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        return minicursos;
    }
     
    public void save (Minicurso minicurso) throws SQLException,ClassNotFoundException{
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            String sql = "insert into minicurso(titulo, dataInicio, duracao, valor, status, vagasDisp) values (?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, minicurso.getTitulo());
            ps.setString(2, minicurso.getDataInicio());
            ps.setString(3, minicurso.getDuracao());
            ps.setFloat(4, minicurso.getValor());
            ps.setString(5, minicurso.getMinicursoEstado().getEstado());
            ps.setInt(6, minicurso.getVagasDisp());
            ps.execute();
          

         } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn,ps);
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
