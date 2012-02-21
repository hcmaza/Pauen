package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MateriaingresoId generated by hbm2java
 */
@Embeddable
public class MateriaingresoId  implements java.io.Serializable {


     private int materiaIngresoId;
     private int materiaId;
     private int cicloAno;

    public MateriaingresoId() {
    }

    public MateriaingresoId(int materiaIngresoId, int materiaId, int cicloAno) {
       this.materiaIngresoId = materiaIngresoId;
       this.materiaId = materiaId;
       this.cicloAno = cicloAno;
    }
   


    @Column(name="materiaIngresoId", nullable=false)
    public int getMateriaIngresoId() {
        return this.materiaIngresoId;
    }
    
    public void setMateriaIngresoId(int materiaIngresoId) {
        this.materiaIngresoId = materiaIngresoId;
    }


    @Column(name="materiaId", nullable=false)
    public int getMateriaId() {
        return this.materiaId;
    }
    
    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }


    @Column(name="cicloAno", nullable=false)
    public int getCicloAno() {
        return this.cicloAno;
    }
    
    public void setCicloAno(int cicloAno) {
        this.cicloAno = cicloAno;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MateriaingresoId) ) return false;
		 MateriaingresoId castOther = ( MateriaingresoId ) other; 
         
		 return (this.getMateriaIngresoId()==castOther.getMateriaIngresoId())
 && (this.getMateriaId()==castOther.getMateriaId())
 && (this.getCicloAno()==castOther.getCicloAno());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMateriaIngresoId();
         result = 37 * result + this.getMateriaId();
         result = 37 * result + this.getCicloAno();
         return result;
   }   


}


