package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Cursada generated by hbm2java
 */
@Entity
@Table(name="cursada"
    ,catalog="sgaundec"
)
public class Cursada  implements java.io.Serializable {


     private CursadaId id;
     private int actaRegularidadId;
     private Integer cursadaRecursa;

    public Cursada() {
    }

	
    public Cursada(CursadaId id, int actaRegularidadId) {
        this.id = id;
        this.actaRegularidadId = actaRegularidadId;
    }
    public Cursada(CursadaId id, int actaRegularidadId, Integer cursadaRecursa) {
       this.id = id;
       this.actaRegularidadId = actaRegularidadId;
       this.cursadaRecursa = cursadaRecursa;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="materiaId", column=@Column(name="materiaId", nullable=false) ), 
        @AttributeOverride(name="inscripcionId", column=@Column(name="inscripcionId", nullable=false) ) } )
    public CursadaId getId() {
        return this.id;
    }
    
    public void setId(CursadaId id) {
        this.id = id;
    }

    
    @Column(name="actaRegularidadId", nullable=false)
    public int getActaRegularidadId() {
        return this.actaRegularidadId;
    }
    
    public void setActaRegularidadId(int actaRegularidadId) {
        this.actaRegularidadId = actaRegularidadId;
    }

    
    @Column(name="cursadaRecursa")
    public Integer getCursadaRecursa() {
        return this.cursadaRecursa;
    }
    
    public void setCursadaRecursa(Integer cursadaRecursa) {
        this.cursadaRecursa = cursadaRecursa;
    }




}

