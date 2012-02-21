package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Planes.
 * @see ar.com.pauen.modelo.Planes
 * @author Hibernate Tools
 */
@Stateless
public class PlanesHome {

    private static final Log log = LogFactory.getLog(PlanesHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Planes transientInstance) {
        log.debug("persisting Planes instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Planes persistentInstance) {
        log.debug("removing Planes instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Planes merge(Planes detachedInstance) {
        log.debug("merging Planes instance");
        try {
            Planes result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Planes findById( Integer id) {
        log.debug("getting Planes instance with id: " + id);
        try {
            Planes instance = entityManager.find(Planes.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

