package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Provincia.
 * @see ar.com.pauen.modelo.Provincia
 * @author Hibernate Tools
 */
@Stateless
public class ProvinciaHome {

    private static final Log log = LogFactory.getLog(ProvinciaHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Provincia transientInstance) {
        log.debug("persisting Provincia instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Provincia persistentInstance) {
        log.debug("removing Provincia instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Provincia merge(Provincia detachedInstance) {
        log.debug("merging Provincia instance");
        try {
            Provincia result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Provincia findById( Integer id) {
        log.debug("getting Provincia instance with id: " + id);
        try {
            Provincia instance = entityManager.find(Provincia.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

