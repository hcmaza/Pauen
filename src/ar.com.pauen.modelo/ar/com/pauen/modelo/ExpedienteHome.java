package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Expediente.
 * @see ar.com.pauen.modelo.Expediente
 * @author Hibernate Tools
 */
@Stateless
public class ExpedienteHome {

    private static final Log log = LogFactory.getLog(ExpedienteHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Expediente transientInstance) {
        log.debug("persisting Expediente instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Expediente persistentInstance) {
        log.debug("removing Expediente instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Expediente merge(Expediente detachedInstance) {
        log.debug("merging Expediente instance");
        try {
            Expediente result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Expediente findById( Integer id) {
        log.debug("getting Expediente instance with id: " + id);
        try {
            Expediente instance = entityManager.find(Expediente.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

