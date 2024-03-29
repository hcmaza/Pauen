package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1


import java.util.Date;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private Integer personaId;
     private int nivelId;
     private int distritoId;
     private String personaApellido;
     private String personaNombres;
     private String personaSexo;
     private Date personaFechaNacimiento;
     private int tipoDocumentoId;
     private int personaDocumento;
     private String personaEmail;

    public Persona() {
    }

	
    public Persona(int nivelId, int distritoId, String personaApellido, String personaNombres, String personaSexo, int tipoDocumentoId, int personaDocumento) {
        this.nivelId = nivelId;
        this.distritoId = distritoId;
        this.personaApellido = personaApellido;
        this.personaNombres = personaNombres;
        this.personaSexo = personaSexo;
        this.tipoDocumentoId = tipoDocumentoId;
        this.personaDocumento = personaDocumento;
    }
    public Persona(int nivelId, int distritoId, String personaApellido, String personaNombres, String personaSexo, Date personaFechaNacimiento, int tipoDocumentoId, int personaDocumento, String personaEmail) {
       this.nivelId = nivelId;
       this.distritoId = distritoId;
       this.personaApellido = personaApellido;
       this.personaNombres = personaNombres;
       this.personaSexo = personaSexo;
       this.personaFechaNacimiento = personaFechaNacimiento;
       this.tipoDocumentoId = tipoDocumentoId;
       this.personaDocumento = personaDocumento;
       this.personaEmail = personaEmail;
    }
   
    public Integer getPersonaId() {
        return this.personaId;
    }
    
    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }
    public int getNivelId() {
        return this.nivelId;
    }
    
    public void setNivelId(int nivelId) {
        this.nivelId = nivelId;
    }
    public int getDistritoId() {
        return this.distritoId;
    }
    
    public void setDistritoId(int distritoId) {
        this.distritoId = distritoId;
    }
    public String getPersonaApellido() {
        return this.personaApellido;
    }
    
    public void setPersonaApellido(String personaApellido) {
        this.personaApellido = personaApellido;
    }
    public String getPersonaNombres() {
        return this.personaNombres;
    }
    
    public void setPersonaNombres(String personaNombres) {
        this.personaNombres = personaNombres;
    }
    public String getPersonaSexo() {
        return this.personaSexo;
    }
    
    public void setPersonaSexo(String personaSexo) {
        this.personaSexo = personaSexo;
    }
    public Date getPersonaFechaNacimiento() {
        return this.personaFechaNacimiento;
    }
    
    public void setPersonaFechaNacimiento(Date personaFechaNacimiento) {
        this.personaFechaNacimiento = personaFechaNacimiento;
    }
    public int getTipoDocumentoId() {
        return this.tipoDocumentoId;
    }
    
    public void setTipoDocumentoId(int tipoDocumentoId) {
        this.tipoDocumentoId = tipoDocumentoId;
    }
    public int getPersonaDocumento() {
        return this.personaDocumento;
    }
    
    public void setPersonaDocumento(int personaDocumento) {
        this.personaDocumento = personaDocumento;
    }
    public String getPersonaEmail() {
        return this.personaEmail;
    }
    
    public void setPersonaEmail(String personaEmail) {
        this.personaEmail = personaEmail;
    }




}


