package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1



/**
 * Correlatividad generated by hbm2java
 */
public class Correlatividad  implements java.io.Serializable {


     private CorrelatividadId id;
     private Integer correlatividadCursada;
     private Integer correlatividadFinales;
     private Integer correlatividadAprobada;

    public Correlatividad() {
    }

	
    public Correlatividad(CorrelatividadId id) {
        this.id = id;
    }
    public Correlatividad(CorrelatividadId id, Integer correlatividadCursada, Integer correlatividadFinales, Integer correlatividadAprobada) {
       this.id = id;
       this.correlatividadCursada = correlatividadCursada;
       this.correlatividadFinales = correlatividadFinales;
       this.correlatividadAprobada = correlatividadAprobada;
    }
   
    public CorrelatividadId getId() {
        return this.id;
    }
    
    public void setId(CorrelatividadId id) {
        this.id = id;
    }
    public Integer getCorrelatividadCursada() {
        return this.correlatividadCursada;
    }
    
    public void setCorrelatividadCursada(Integer correlatividadCursada) {
        this.correlatividadCursada = correlatividadCursada;
    }
    public Integer getCorrelatividadFinales() {
        return this.correlatividadFinales;
    }
    
    public void setCorrelatividadFinales(Integer correlatividadFinales) {
        this.correlatividadFinales = correlatividadFinales;
    }
    public Integer getCorrelatividadAprobada() {
        return this.correlatividadAprobada;
    }
    
    public void setCorrelatividadAprobada(Integer correlatividadAprobada) {
        this.correlatividadAprobada = correlatividadAprobada;
    }




}


