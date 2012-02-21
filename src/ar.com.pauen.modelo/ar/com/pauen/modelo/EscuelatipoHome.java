package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Escuelatipo.
 * @see ar.com.pauen.modelo.Escuelatipo
 * @author Hibernate Tools
 */
@Stateless
public class EscuelatipoHome {

    private static final Log log = LogFactory.getLog(EscuelatipoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Escuelatipo transientInstance) {
        log.debug("persisting Escuelatipo instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Escuelatipo persistentInstance) {
        log.debug("removing Escuelatipo instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Escuelatipo merge(Escuelatipo detachedInstance) {
        log.debug("merging Escuelatipo instance");
        try {
            Escuelatipo result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Escuelatipo findById( Integer id) {
        log.debug("getting Escuelatipo instance with id: " + id);
        try {
            Escuelatipo instance = entityManager.find(Escuelatipo.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

