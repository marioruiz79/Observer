
package mainobserver;
 
import java.util.Observable;
import java.util.Observer;
 

public class Observador implements Observer{
 
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Nueva Actualizacion: "+o+" -> "+arg);
    }
    
}

