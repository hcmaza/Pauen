package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Regularidad.
 * @see ar.com.pauen.modelo.Regularidad
 * @author Hibernate Tools
 */
@Stateless
public class RegularidadHome {

    private static final Log log = LogFactory.getLog(RegularidadHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Regularidad transientInstance) {
        log.debug("persisting Regularidad instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Regularidad persistentInstance) {
        log.debug("removing Regularidad instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Regularidad merge(Regularidad detachedInstance) {
        log.debug("merging Regularidad instance");
        try {
            Regularidad result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Regularidad findById( Integer id) {
        log.debug("getting Regularidad instance with id: " + id);
        try {
            Regularidad instance = entityManager.find(Regularidad.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

