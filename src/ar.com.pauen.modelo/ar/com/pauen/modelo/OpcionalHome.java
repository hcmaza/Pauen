package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Opcional.
 * @see ar.com.pauen.modelo.Opcional
 * @author Hibernate Tools
 */
@Stateless
public class OpcionalHome {

    private static final Log log = LogFactory.getLog(OpcionalHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Opcional transientInstance) {
        log.debug("persisting Opcional instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Opcional persistentInstance) {
        log.debug("removing Opcional instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Opcional merge(Opcional detachedInstance) {
        log.debug("merging Opcional instance");
        try {
            Opcional result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Opcional findById( OpcionalId id) {
        log.debug("getting Opcional instance with id: " + id);
        try {
            Opcional instance = entityManager.find(Opcional.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

