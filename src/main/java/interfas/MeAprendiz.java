
package interfas;

import java.util.List;
import model.aprendiz;

public interface MeAprendiz {
    
    public aprendiz list(int id);
    public List listadoA();
    public boolean registrarap(aprendiz ap);
    public boolean actualizarap(aprendiz ap);
    public boolean eliminarap(aprendiz ap);
    
}
