/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelDao;


import Config.Conexion;
import Interfaz.MeAprendiz;
import Model.Aprendiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author APRENDIZ
 */
public class AprendizDao implements MeAprendiz{

    Conexion co= new Conexion();
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Aprendiz usu = new Aprendiz();
    
    
    @Override
    public Aprendiz list(int id) {
        String sql = " select * from aprendiz where id="+id;
        try{
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                usu.setId(rs.getInt("id"));
                usu.setDocuApre(rs.getInt("documento"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setCorreo(rs.getString("correo"));
                usu.setTeleApre(rs.getInt("numcontacto"));
            }
            
        }catch(Exception e)
        {
           
        }
        return usu;
    }
    

    @Override
    public List listadoA() {
     ArrayList<Aprendiz> lista = new ArrayList<Aprendiz>();
     String sql = "select * from aprendiz";
        try{
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Aprendiz usu = new Aprendiz();
                usu.setId(rs.getInt("id"));
                usu.setDocuApre(rs.getInt("documento"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setCorreo(rs.getString("correo"));
                usu.setTeleApre(rs.getInt("numcontacto"));
                lista.add(usu);
               

            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public boolean registrarAp(Aprendiz ap) {
        
        String sql="insert into Aprendiz(documento,nombre,apellido,correo,numcontacto)values('"+ap.getDocuApre()+"','"+ap.getNombre()+"','"+ap.getApellido()+"','"+ap.getCorreo()+"','"+ap.getTeleApre()+"')";
        try{
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
           /* while(rs.next()){
                ape.setId(rs.getInt("id"));
                ape.setDocuApre(rs.getInt("Docu"));
                ape.setNombre(rs.getString("NombreA"));
                ape.setApellido(rs.getString("ApellidoA"));
                ape.setCorreo(rs.getString("CorreoA"));
                ape.setTeleApre(rs.getInt("TelefonoA"));
            }*/
           JOptionPane.showMessageDialog(null,"Aprendiz registrado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Aprendiz no registrado");
        }
        return false;
        
    }
    

    @Override
    public boolean actualizarAp(Aprendiz ap) {
        String sql = "update Aprendiz set Documento='"+usu.getDocuApre()+"',nombre='"+usu.getNombre()+"',apellido='"+usu.getApellido()+"',correo='"+usu.getCorreo()+"',numcontacto='"+usu.getTeleApre()+"' where id="+usu.getId(); 
                try {
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminarAp(int id) {
    
        String sql="delete from Aprendiz where id="+id;
        try{
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Aprendiz eliminado");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Aprendiz no se puede eliminar");
        }
        return false;   
    }
    
}
