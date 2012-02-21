package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Expedientetipo.
 * @see ar.com.pauen.modelo.Expedientetipo
 * @author Hibernate Tools
 */
@Stateless
public class ExpedientetipoHome {

    private static final Log log = LogFactory.getLog(ExpedientetipoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Expedientetipo transientInstance) {
        log.debug("persisting Expedientetipo instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Expedientetipo persistentInstance) {
        log.debug("removing Expedientetipo instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Expedientetipo merge(Expedientetipo detachedInstance) {
        log.debug("merging Expedientetipo instance");
        try {
            Expedientetipo result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Expedientetipo findById( Integer id) {
        log.debug("getting Expedientetipo instance with id: " + id);
        try {
            Expedientetipo instance = entityManager.find(Expedientetipo.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

