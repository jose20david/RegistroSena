
package Modeldao;

import interfas.MeAprendiz;
import java.util.List;
import model.aprendiz;

public class AprendizDao  implements MeAprendiz{

    @Override
    public aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadoA() {
        String sql="insert into Aprendiz(Docu,NombreA,ApellidoA,EmailA,TelefonoA)values('"+ap.getDocuape()+"','"+ap.getNombreA()+"','"+ap.getApellidoA()+"','"+ap.getCorreoA()+"','"+ap.getTeleapre()+"')";
        try{
            
        }catch{}
        {
        }
        return false;
    }

    @Override
    public boolean registrarap(aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarap(aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarap(aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
