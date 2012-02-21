package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="sgaundec"
)
public class Usuario  implements java.io.Serializable {


     private Integer usuarioId;
     private String usuarioNombre;
     private String usuarioPassword;
     private String usuarioDescripcion;
     private byte[] usuarioObservaciones;
     private Integer usuarioAdministrador;

    public Usuario() {
    }

	
    public Usuario(byte[] usuarioObservaciones) {
        this.usuarioObservaciones = usuarioObservaciones;
    }
    public Usuario(String usuarioNombre, String usuarioPassword, String usuarioDescripcion, byte[] usuarioObservaciones, Integer usuarioAdministrador) {
       this.usuarioNombre = usuarioNombre;
       this.usuarioPassword = usuarioPassword;
       this.usuarioDescripcion = usuarioDescripcion;
       this.usuarioObservaciones = usuarioObservaciones;
       this.usuarioAdministrador = usuarioAdministrador;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="usuarioId", unique=true, nullable=false)
    public Integer getUsuarioId() {
        return this.usuarioId;
    }
    
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    
    @Column(name="usuarioNombre", length=200)
    public String getUsuarioNombre() {
        return this.usuarioNombre;
    }
    
    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    
    @Column(name="usuarioPassword", length=200)
    public String getUsuarioPassword() {
        return this.usuarioPassword;
    }
    
    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }

    
    @Column(name="usuarioDescripcion", length=200)
    public String getUsuarioDescripcion() {
        return this.usuarioDescripcion;
    }
    
    public void setUsuarioDescripcion(String usuarioDescripcion) {
        this.usuarioDescripcion = usuarioDescripcion;
    }

    
    @Column(name="usuarioObservaciones", nullable=false)
    public byte[] getUsuarioObservaciones() {
        return this.usuarioObservaciones;
    }
    
    public void setUsuarioObservaciones(byte[] usuarioObservaciones) {
        this.usuarioObservaciones = usuarioObservaciones;
    }

    
    @Column(name="usuarioAdministrador")
    public Integer getUsuarioAdministrador() {
        return this.usuarioAdministrador;
    }
    
    public void setUsuarioAdministrador(Integer usuarioAdministrador) {
        this.usuarioAdministrador = usuarioAdministrador;
    }




}

