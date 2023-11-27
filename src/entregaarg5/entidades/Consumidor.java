
package entregaarg5.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Entity
public class Consumidor {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String nombre;
    @Column
    private String telefono;
    @Column
    private String email;
    
    @OneToOne(mappedBy="consumidor", fetch = FetchType.LAZY)
    private Contrato contrato;
    
    
    public Consumidor() {
    }

    
}
