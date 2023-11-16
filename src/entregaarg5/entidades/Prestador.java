
package entregaarg5.entidades;

import java.util.Date;
import java.util.List;


public class Prestador {

    private String id;
    private String nombreCompleto;
    private Date fechaNacimiento;
    private String numeroDocumento;
    private String cuit;
    private Contacto contacto;
    private Disponibilidad disponibilidad;
    private String zonaCobertura;
    private List<String> experiencias;
    private List<String> fotosURL;

    public Prestador() {
    }

    public Prestador(String id, String nombreCompleto, Date fechaNacimiento, String numeroDocumento, String cuit, Contacto contacto, Disponibilidad disponibilidad, String zonaCobertura, List<String> experiencias, List<String> fotosURL) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroDocumento = numeroDocumento;
        this.cuit = cuit;
        this.contacto = contacto;
        this.disponibilidad = disponibilidad;
        this.zonaCobertura = zonaCobertura;
        this.experiencias = experiencias;
        this.fotosURL = fotosURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public List<String> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<String> experiencias) {
        this.experiencias = experiencias;
    }

    public List<String> getFotosURL() {
        return fotosURL;
    }

    public void setFotosURL(List<String> fotosURL) {
        this.fotosURL = fotosURL;
    }
    
    
    
    

}
