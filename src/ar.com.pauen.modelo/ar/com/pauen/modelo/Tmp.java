package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tmp generated by hbm2java
 */
@Entity
@Table(name="tmp"
    ,catalog="sgaundec"
)
public class Tmp  implements java.io.Serializable {


     private Integer tmp;

    public Tmp() {
    }

    public Tmp(Integer tmp) {
       this.tmp = tmp;
    }
   
     @Id 

    
    @Column(name="tmp")
    public Integer getTmp() {
        return this.tmp;
    }
    
    public void setTmp(Integer tmp) {
        this.tmp = tmp;
    }




}


