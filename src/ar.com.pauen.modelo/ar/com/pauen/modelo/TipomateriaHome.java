package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tipomateria.
 * @see ar.com.pauen.modelo.Tipomateria
 * @author Hibernate Tools
 */
@Stateless
public class TipomateriaHome {

    private static final Log log = LogFactory.getLog(TipomateriaHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Tipomateria transientInstance) {
        log.debug("persisting Tipomateria instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Tipomateria persistentInstance) {
        log.debug("removing Tipomateria instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Tipomateria merge(Tipomateria detachedInstance) {
        log.debug("merging Tipomateria instance");
        try {
            Tipomateria result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Tipomateria findById( Integer id) {
        log.debug("getting Tipomateria instance with id: " + id);
        try {
            Tipomateria instance = entityManager.find(Tipomateria.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

