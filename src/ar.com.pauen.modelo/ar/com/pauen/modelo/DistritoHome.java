package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Distrito.
 * @see ar.com.pauen.modelo.Distrito
 * @author Hibernate Tools
 */
@Stateless
public class DistritoHome {

    private static final Log log = LogFactory.getLog(DistritoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Distrito transientInstance) {
        log.debug("persisting Distrito instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Distrito persistentInstance) {
        log.debug("removing Distrito instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Distrito merge(Distrito detachedInstance) {
        log.debug("merging Distrito instance");
        try {
            Distrito result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Distrito findById( Integer id) {
        log.debug("getting Distrito instance with id: " + id);
        try {
            Distrito instance = entityManager.find(Distrito.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

