package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Turno.
 * @see ar.com.pauen.modelo.Turno
 * @author Hibernate Tools
 */
@Stateless
public class TurnoHome {

    private static final Log log = LogFactory.getLog(TurnoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Turno transientInstance) {
        log.debug("persisting Turno instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Turno persistentInstance) {
        log.debug("removing Turno instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Turno merge(Turno detachedInstance) {
        log.debug("merging Turno instance");
        try {
            Turno result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Turno findById( Integer id) {
        log.debug("getting Turno instance with id: " + id);
        try {
            Turno instance = entityManager.find(Turno.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

