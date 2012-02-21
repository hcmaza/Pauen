package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Usuarioacceso.
 * @see ar.com.pauen.modelo.Usuarioacceso
 * @author Hibernate Tools
 */
@Stateless
public class UsuarioaccesoHome {

    private static final Log log = LogFactory.getLog(UsuarioaccesoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Usuarioacceso transientInstance) {
        log.debug("persisting Usuarioacceso instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Usuarioacceso persistentInstance) {
        log.debug("removing Usuarioacceso instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Usuarioacceso merge(Usuarioacceso detachedInstance) {
        log.debug("merging Usuarioacceso instance");
        try {
            Usuarioacceso result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Usuarioacceso findById( UsuarioaccesoId id) {
        log.debug("getting Usuarioacceso instance with id: " + id);
        try {
            Usuarioacceso instance = entityManager.find(Usuarioacceso.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

