package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Periodo.
 * @see ar.com.pauen.modelo.Periodo
 * @author Hibernate Tools
 */
@Stateless
public class PeriodoHome {

    private static final Log log = LogFactory.getLog(PeriodoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Periodo transientInstance) {
        log.debug("persisting Periodo instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Periodo persistentInstance) {
        log.debug("removing Periodo instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Periodo merge(Periodo detachedInstance) {
        log.debug("merging Periodo instance");
        try {
            Periodo result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Periodo findById( Integer id) {
        log.debug("getting Periodo instance with id: " + id);
        try {
            Periodo instance = entityManager.find(Periodo.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

