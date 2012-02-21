package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tipoinscripcion.
 * @see ar.com.pauen.modelo.Tipoinscripcion
 * @author Hibernate Tools
 */
@Stateless
public class TipoinscripcionHome {

    private static final Log log = LogFactory.getLog(TipoinscripcionHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Tipoinscripcion transientInstance) {
        log.debug("persisting Tipoinscripcion instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Tipoinscripcion persistentInstance) {
        log.debug("removing Tipoinscripcion instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Tipoinscripcion merge(Tipoinscripcion detachedInstance) {
        log.debug("merging Tipoinscripcion instance");
        try {
            Tipoinscripcion result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Tipoinscripcion findById( Integer id) {
        log.debug("getting Tipoinscripcion instance with id: " + id);
        try {
            Tipoinscripcion instance = entityManager.find(Tipoinscripcion.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

