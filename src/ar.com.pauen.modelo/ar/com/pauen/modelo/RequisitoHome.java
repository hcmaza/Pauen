package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Requisito.
 * @see ar.com.pauen.modelo.Requisito
 * @author Hibernate Tools
 */
@Stateless
public class RequisitoHome {

    private static final Log log = LogFactory.getLog(RequisitoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Requisito transientInstance) {
        log.debug("persisting Requisito instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Requisito persistentInstance) {
        log.debug("removing Requisito instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Requisito merge(Requisito detachedInstance) {
        log.debug("merging Requisito instance");
        try {
            Requisito result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Requisito findById( Integer id) {
        log.debug("getting Requisito instance with id: " + id);
        try {
            Requisito instance = entityManager.find(Requisito.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

