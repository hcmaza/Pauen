package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Expedientedenominacion.
 * @see ar.com.pauen.modelo.Expedientedenominacion
 * @author Hibernate Tools
 */
@Stateless
public class ExpedientedenominacionHome {

    private static final Log log = LogFactory.getLog(ExpedientedenominacionHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Expedientedenominacion transientInstance) {
        log.debug("persisting Expedientedenominacion instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Expedientedenominacion persistentInstance) {
        log.debug("removing Expedientedenominacion instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Expedientedenominacion merge(Expedientedenominacion detachedInstance) {
        log.debug("merging Expedientedenominacion instance");
        try {
            Expedientedenominacion result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Expedientedenominacion findById( Integer id) {
        log.debug("getting Expedientedenominacion instance with id: " + id);
        try {
            Expedientedenominacion instance = entityManager.find(Expedientedenominacion.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

