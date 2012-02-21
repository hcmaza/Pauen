package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Encuesta.
 * @see ar.com.pauen.modelo.Encuesta
 * @author Hibernate Tools
 */
@Stateless
public class EncuestaHome {

    private static final Log log = LogFactory.getLog(EncuestaHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Encuesta transientInstance) {
        log.debug("persisting Encuesta instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Encuesta persistentInstance) {
        log.debug("removing Encuesta instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Encuesta merge(Encuesta detachedInstance) {
        log.debug("merging Encuesta instance");
        try {
            Encuesta result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Encuesta findById( EncuestaId id) {
        log.debug("getting Encuesta instance with id: " + id);
        try {
            Encuesta instance = entityManager.find(Encuesta.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

