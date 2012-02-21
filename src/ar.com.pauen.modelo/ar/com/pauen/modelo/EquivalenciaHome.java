package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Equivalencia.
 * @see ar.com.pauen.modelo.Equivalencia
 * @author Hibernate Tools
 */
@Stateless
public class EquivalenciaHome {

    private static final Log log = LogFactory.getLog(EquivalenciaHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Equivalencia transientInstance) {
        log.debug("persisting Equivalencia instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Equivalencia persistentInstance) {
        log.debug("removing Equivalencia instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Equivalencia merge(Equivalencia detachedInstance) {
        log.debug("merging Equivalencia instance");
        try {
            Equivalencia result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Equivalencia findById( Integer id) {
        log.debug("getting Equivalencia instance with id: " + id);
        try {
            Equivalencia instance = entityManager.find(Equivalencia.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

