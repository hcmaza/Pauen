package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CorrelatividadId generated by hbm2java
 */
@Embeddable
public class CorrelatividadId  implements java.io.Serializable {


     private int materiaId;
     private int esCorrelativaDe;

    public CorrelatividadId() {
    }

    public CorrelatividadId(int materiaId, int esCorrelativaDe) {
       this.materiaId = materiaId;
       this.esCorrelativaDe = esCorrelativaDe;
    }
   


    @Column(name="materiaId", nullable=false)
    public int getMateriaId() {
        return this.materiaId;
    }
    
    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }


    @Column(name="esCorrelativaDe", nullable=false)
    public int getEsCorrelativaDe() {
        return this.esCorrelativaDe;
    }
    
    public void setEsCorrelativaDe(int esCorrelativaDe) {
        this.esCorrelativaDe = esCorrelativaDe;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CorrelatividadId) ) return false;
		 CorrelatividadId castOther = ( CorrelatividadId ) other; 
         
		 return (this.getMateriaId()==castOther.getMateriaId())
 && (this.getEsCorrelativaDe()==castOther.getEsCorrelativaDe());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMateriaId();
         result = 37 * result + this.getEsCorrelativaDe();
         return result;
   }   


}


