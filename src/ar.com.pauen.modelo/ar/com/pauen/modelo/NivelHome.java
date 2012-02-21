package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Nivel.
 * @see ar.com.pauen.modelo.Nivel
 * @author Hibernate Tools
 */
@Stateless
public class NivelHome {

    private static final Log log = LogFactory.getLog(NivelHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Nivel transientInstance) {
        log.debug("persisting Nivel instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Nivel persistentInstance) {
        log.debug("removing Nivel instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Nivel merge(Nivel detachedInstance) {
        log.debug("merging Nivel instance");
        try {
            Nivel result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Nivel findById( Integer id) {
        log.debug("getting Nivel instance with id: " + id);
        try {
            Nivel instance = entityManager.find(Nivel.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

