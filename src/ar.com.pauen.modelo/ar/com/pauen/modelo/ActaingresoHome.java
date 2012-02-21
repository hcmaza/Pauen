package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Actaingreso.
 * @see ar.com.pauen.modelo.Actaingreso
 * @author Hibernate Tools
 */
@Stateless
public class ActaingresoHome {

    private static final Log log = LogFactory.getLog(ActaingresoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Actaingreso transientInstance) {
        log.debug("persisting Actaingreso instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Actaingreso persistentInstance) {
        log.debug("removing Actaingreso instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Actaingreso merge(Actaingreso detachedInstance) {
        log.debug("merging Actaingreso instance");
        try {
            Actaingreso result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Actaingreso findById( Integer id) {
        log.debug("getting Actaingreso instance with id: " + id);
        try {
            Actaingreso instance = entityManager.find(Actaingreso.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

