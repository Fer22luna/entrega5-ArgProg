
package entregaarg5.enums;


public enum Estado {
    
    INICIADO("Iniciado"),
    EN_PROCESO("En Proceso"),
    FINALIZADO("Finalizado");
    
    
    private final String texto;

    private Estado(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
 
    
}
