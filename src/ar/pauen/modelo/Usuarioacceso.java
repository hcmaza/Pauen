package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1



/**
 * Usuarioacceso generated by hbm2java
 */
public class Usuarioacceso  implements java.io.Serializable {


     private UsuarioaccesoId id;
     private int usuarioAccesoConsulta;
     private int usuarioAccesoAgregar;
     private int usuarioAccesoModificar;
     private int usuarioAccesoEliminar;

    public Usuarioacceso() {
    }

    public Usuarioacceso(UsuarioaccesoId id, int usuarioAccesoConsulta, int usuarioAccesoAgregar, int usuarioAccesoModificar, int usuarioAccesoEliminar) {
       this.id = id;
       this.usuarioAccesoConsulta = usuarioAccesoConsulta;
       this.usuarioAccesoAgregar = usuarioAccesoAgregar;
       this.usuarioAccesoModificar = usuarioAccesoModificar;
       this.usuarioAccesoEliminar = usuarioAccesoEliminar;
    }
   
    public UsuarioaccesoId getId() {
        return this.id;
    }
    
    public void setId(UsuarioaccesoId id) {
        this.id = id;
    }
    public int getUsuarioAccesoConsulta() {
        return this.usuarioAccesoConsulta;
    }
    
    public void setUsuarioAccesoConsulta(int usuarioAccesoConsulta) {
        this.usuarioAccesoConsulta = usuarioAccesoConsulta;
    }
    public int getUsuarioAccesoAgregar() {
        return this.usuarioAccesoAgregar;
    }
    
    public void setUsuarioAccesoAgregar(int usuarioAccesoAgregar) {
        this.usuarioAccesoAgregar = usuarioAccesoAgregar;
    }
    public int getUsuarioAccesoModificar() {
        return this.usuarioAccesoModificar;
    }
    
    public void setUsuarioAccesoModificar(int usuarioAccesoModificar) {
        this.usuarioAccesoModificar = usuarioAccesoModificar;
    }
    public int getUsuarioAccesoEliminar() {
        return this.usuarioAccesoEliminar;
    }
    
    public void setUsuarioAccesoEliminar(int usuarioAccesoEliminar) {
        this.usuarioAccesoEliminar = usuarioAccesoEliminar;
    }




}

