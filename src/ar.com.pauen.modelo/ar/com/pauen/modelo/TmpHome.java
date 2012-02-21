package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tmp.
 * @see ar.com.pauen.modelo.Tmp
 * @author Hibernate Tools
 */
@Stateless
public class TmpHome {

    private static final Log log = LogFactory.getLog(TmpHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Tmp transientInstance) {
        log.debug("persisting Tmp instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Tmp persistentInstance) {
        log.debug("removing Tmp instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Tmp merge(Tmp detachedInstance) {
        log.debug("merging Tmp instance");
        try {
            Tmp result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Tmp findById( Integer id) {
        log.debug("getting Tmp instance with id: " + id);
        try {
            Tmp instance = entityManager.find(Tmp.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

