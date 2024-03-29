package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1



/**
 * InscripcionfinalId generated by hbm2java
 */
public class InscripcionfinalId  implements java.io.Serializable {


     private int inscripcionId;
     private int actaFinalId;
     private Character inscripcionFinalCondicion;
     private Integer inscripcionFinalAnoRegularizacion;

    public InscripcionfinalId() {
    }

	
    public InscripcionfinalId(int inscripcionId, int actaFinalId) {
        this.inscripcionId = inscripcionId;
        this.actaFinalId = actaFinalId;
    }
    public InscripcionfinalId(int inscripcionId, int actaFinalId, Character inscripcionFinalCondicion, Integer inscripcionFinalAnoRegularizacion) {
       this.inscripcionId = inscripcionId;
       this.actaFinalId = actaFinalId;
       this.inscripcionFinalCondicion = inscripcionFinalCondicion;
       this.inscripcionFinalAnoRegularizacion = inscripcionFinalAnoRegularizacion;
    }
   
    public int getInscripcionId() {
        return this.inscripcionId;
    }
    
    public void setInscripcionId(int inscripcionId) {
        this.inscripcionId = inscripcionId;
    }
    public int getActaFinalId() {
        return this.actaFinalId;
    }
    
    public void setActaFinalId(int actaFinalId) {
        this.actaFinalId = actaFinalId;
    }
    public Character getInscripcionFinalCondicion() {
        return this.inscripcionFinalCondicion;
    }
    
    public void setInscripcionFinalCondicion(Character inscripcionFinalCondicion) {
        this.inscripcionFinalCondicion = inscripcionFinalCondicion;
    }
    public Integer getInscripcionFinalAnoRegularizacion() {
        return this.inscripcionFinalAnoRegularizacion;
    }
    
    public void setInscripcionFinalAnoRegularizacion(Integer inscripcionFinalAnoRegularizacion) {
        this.inscripcionFinalAnoRegularizacion = inscripcionFinalAnoRegularizacion;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InscripcionfinalId) ) return false;
		 InscripcionfinalId castOther = ( InscripcionfinalId ) other; 
         
		 return (this.getInscripcionId()==castOther.getInscripcionId())
 && (this.getActaFinalId()==castOther.getActaFinalId())
 && ( (this.getInscripcionFinalCondicion()==castOther.getInscripcionFinalCondicion()) || ( this.getInscripcionFinalCondicion()!=null && castOther.getInscripcionFinalCondicion()!=null && this.getInscripcionFinalCondicion().equals(castOther.getInscripcionFinalCondicion()) ) )
 && ( (this.getInscripcionFinalAnoRegularizacion()==castOther.getInscripcionFinalAnoRegularizacion()) || ( this.getInscripcionFinalAnoRegularizacion()!=null && castOther.getInscripcionFinalAnoRegularizacion()!=null && this.getInscripcionFinalAnoRegularizacion().equals(castOther.getInscripcionFinalAnoRegularizacion()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getInscripcionId();
         result = 37 * result + this.getActaFinalId();
         result = 37 * result + ( getInscripcionFinalCondicion() == null ? 0 : this.getInscripcionFinalCondicion().hashCode() );
         result = 37 * result + ( getInscripcionFinalAnoRegularizacion() == null ? 0 : this.getInscripcionFinalAnoRegularizacion().hashCode() );
         return result;
   }   


}


