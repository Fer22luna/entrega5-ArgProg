
package entregaarg5.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Prestador {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String nombreCompleto;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column
    private String numeroDocumento;
    @Column
    private String zonaCobertura;
    @OneToMany
    private List<String> experiencias;
    @OneToMany
    private List<String> fotosURL;
    
    @OneToOne(mappedBy="prestador", fetch = FetchType.LAZY)
    private Contrato contrato;

    public Prestador() {
    }

    public Prestador(String id, String nombreCompleto, Date fechaNacimiento, String numeroDocumento, String cuit, String zonaCobertura, List<String> experiencias, List<String> fotosURL) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroDocumento = numeroDocumento;
        this.zonaCobertura = zonaCobertura;
        this.experiencias = experiencias;
        this.fotosURL = fotosURL;
    }



}
