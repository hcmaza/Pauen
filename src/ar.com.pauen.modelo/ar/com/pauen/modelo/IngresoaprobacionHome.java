package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Ingresoaprobacion.
 * @see ar.com.pauen.modelo.Ingresoaprobacion
 * @author Hibernate Tools
 */
@Stateless
public class IngresoaprobacionHome {

    private static final Log log = LogFactory.getLog(IngresoaprobacionHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Ingresoaprobacion transientInstance) {
        log.debug("persisting Ingresoaprobacion instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Ingresoaprobacion persistentInstance) {
        log.debug("removing Ingresoaprobacion instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Ingresoaprobacion merge(Ingresoaprobacion detachedInstance) {
        log.debug("merging Ingresoaprobacion instance");
        try {
            Ingresoaprobacion result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Ingresoaprobacion findById( Integer id) {
        log.debug("getting Ingresoaprobacion instance with id: " + id);
        try {
            Ingresoaprobacion instance = entityManager.find(Ingresoaprobacion.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

