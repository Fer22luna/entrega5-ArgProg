
package entregaarg5.entidades;

import java.util.List;


public class Administrador {
    
    
    
    public Servicio altaServicio(String nombre, String descripcion, List<String> tareas){
        
        Servicio servicio = new Servicio();
        
        servicio.setNombre(nombre);
        servicio.setDescripcion(descripcion);
        servicio.setTareas(tareas);
        
        return servicio;
    }    
    
    
}
