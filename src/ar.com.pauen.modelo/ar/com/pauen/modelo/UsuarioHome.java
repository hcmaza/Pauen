package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Usuario.
 * @see ar.com.pauen.modelo.Usuario
 * @author Hibernate Tools
 */
@Stateless
public class UsuarioHome {

    private static final Log log = LogFactory.getLog(UsuarioHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Usuario transientInstance) {
        log.debug("persisting Usuario instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Usuario persistentInstance) {
        log.debug("removing Usuario instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Usuario merge(Usuario detachedInstance) {
        log.debug("merging Usuario instance");
        try {
            Usuario result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Usuario findById( Integer id) {
        log.debug("getting Usuario instance with id: " + id);
        try {
            Usuario instance = entityManager.find(Usuario.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

