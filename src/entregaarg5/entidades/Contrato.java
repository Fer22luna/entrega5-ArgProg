
package entregaarg5.entidades;

import entregaarg5.enums.Estado;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Contrato {

    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private String id;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_PRESTADOR")
    private Prestador prestador;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_CONSUMIDOR")
    private Consumidor consumidor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column
    private String lugar;
    @Column
    private String rangoHorario;
    @ElementCollection
    @CollectionTable(name = "tareas_contrato", joinColumns = @JoinColumn(name = "contrato_id"))
    @Column(name = "tarea")
    private List<String> tareas;
    // Esta relacion la establezco ya que como la lista de tareas no es una relacion entre entidades.
    @Column
    private double precio;
    @Column
    private Estado estado;

    public Contrato() {
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getRangoHorario() {
        return rangoHorario;
    }

    public void setRangoHorario(String rangoHorario) {
        this.rangoHorario = rangoHorario;
    }

    public List<String> getTareas() {
        return tareas;
    }

    public void setTareas(List<String> tareas) {
        this.tareas = tareas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    
    
    
}
