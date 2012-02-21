package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tipodocumento generated by hbm2java
 */
@Entity
@Table(name="tipodocumento"
    ,catalog="sgaundec"
)
public class Tipodocumento  implements java.io.Serializable {


     private Integer tipoDocumentoId;
     private String tipoDocumentoNombre;
     private String tipoDocumentoAbreviado;

    public Tipodocumento() {
    }

    public Tipodocumento(String tipoDocumentoNombre, String tipoDocumentoAbreviado) {
       this.tipoDocumentoNombre = tipoDocumentoNombre;
       this.tipoDocumentoAbreviado = tipoDocumentoAbreviado;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="tipoDocumentoId", unique=true, nullable=false)
    public Integer getTipoDocumentoId() {
        return this.tipoDocumentoId;
    }
    
    public void setTipoDocumentoId(Integer tipoDocumentoId) {
        this.tipoDocumentoId = tipoDocumentoId;
    }

    
    @Column(name="tipoDocumentoNombre", length=50)
    public String getTipoDocumentoNombre() {
        return this.tipoDocumentoNombre;
    }
    
    public void setTipoDocumentoNombre(String tipoDocumentoNombre) {
        this.tipoDocumentoNombre = tipoDocumentoNombre;
    }

    
    @Column(name="tipoDocumentoAbreviado", length=10)
    public String getTipoDocumentoAbreviado() {
        return this.tipoDocumentoAbreviado;
    }
    
    public void setTipoDocumentoAbreviado(String tipoDocumentoAbreviado) {
        this.tipoDocumentoAbreviado = tipoDocumentoAbreviado;
    }




}

