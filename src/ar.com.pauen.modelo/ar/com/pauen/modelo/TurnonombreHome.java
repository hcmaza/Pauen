package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Turnonombre.
 * @see ar.com.pauen.modelo.Turnonombre
 * @author Hibernate Tools
 */
@Stateless
public class TurnonombreHome {

    private static final Log log = LogFactory.getLog(TurnonombreHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Turnonombre transientInstance) {
        log.debug("persisting Turnonombre instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Turnonombre persistentInstance) {
        log.debug("removing Turnonombre instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Turnonombre merge(Turnonombre detachedInstance) {
        log.debug("merging Turnonombre instance");
        try {
            Turnonombre result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Turnonombre findById( Integer id) {
        log.debug("getting Turnonombre instance with id: " + id);
        try {
            Turnonombre instance = entityManager.find(Turnonombre.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

