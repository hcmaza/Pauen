package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Ciclo.
 * @see ar.com.pauen.modelo.Ciclo
 * @author Hibernate Tools
 */
@Stateless
public class CicloHome {

    private static final Log log = LogFactory.getLog(CicloHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Ciclo transientInstance) {
        log.debug("persisting Ciclo instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Ciclo persistentInstance) {
        log.debug("removing Ciclo instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Ciclo merge(Ciclo detachedInstance) {
        log.debug("merging Ciclo instance");
        try {
            Ciclo result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Ciclo findById( Integer id) {
        log.debug("getting Ciclo instance with id: " + id);
        try {
            Ciclo instance = entityManager.find(Ciclo.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

