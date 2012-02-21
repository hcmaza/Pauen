package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Cursada.
 * @see ar.com.pauen.modelo.Cursada
 * @author Hibernate Tools
 */
@Stateless
public class CursadaHome {

    private static final Log log = LogFactory.getLog(CursadaHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Cursada transientInstance) {
        log.debug("persisting Cursada instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Cursada persistentInstance) {
        log.debug("removing Cursada instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Cursada merge(Cursada detachedInstance) {
        log.debug("merging Cursada instance");
        try {
            Cursada result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Cursada findById( CursadaId id) {
        log.debug("getting Cursada instance with id: " + id);
        try {
            Cursada instance = entityManager.find(Cursada.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

