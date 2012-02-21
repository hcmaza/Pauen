package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1


import java.util.Date;

/**
 * Requisitoalumno generated by hbm2java
 */
public class Requisitoalumno  implements java.io.Serializable {


     private RequisitoalumnoId id;
     private Date requisitoAlumnoFecha;
     private String requisitoAlumnoObservacion;

    public Requisitoalumno() {
    }

	
    public Requisitoalumno(RequisitoalumnoId id) {
        this.id = id;
    }
    public Requisitoalumno(RequisitoalumnoId id, Date requisitoAlumnoFecha, String requisitoAlumnoObservacion) {
       this.id = id;
       this.requisitoAlumnoFecha = requisitoAlumnoFecha;
       this.requisitoAlumnoObservacion = requisitoAlumnoObservacion;
    }
   
    public RequisitoalumnoId getId() {
        return this.id;
    }
    
    public void setId(RequisitoalumnoId id) {
        this.id = id;
    }
    public Date getRequisitoAlumnoFecha() {
        return this.requisitoAlumnoFecha;
    }
    
    public void setRequisitoAlumnoFecha(Date requisitoAlumnoFecha) {
        this.requisitoAlumnoFecha = requisitoAlumnoFecha;
    }
    public String getRequisitoAlumnoObservacion() {
        return this.requisitoAlumnoObservacion;
    }
    
    public void setRequisitoAlumnoObservacion(String requisitoAlumnoObservacion) {
        this.requisitoAlumnoObservacion = requisitoAlumnoObservacion;
    }




}

