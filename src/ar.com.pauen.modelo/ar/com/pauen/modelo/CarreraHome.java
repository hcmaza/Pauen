package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Carrera.
 * @see ar.com.pauen.modelo.Carrera
 * @author Hibernate Tools
 */
@Stateless
public class CarreraHome {

    private static final Log log = LogFactory.getLog(CarreraHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Carrera transientInstance) {
        log.debug("persisting Carrera instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Carrera persistentInstance) {
        log.debug("removing Carrera instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Carrera merge(Carrera detachedInstance) {
        log.debug("merging Carrera instance");
        try {
            Carrera result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Carrera findById( Integer id) {
        log.debug("getting Carrera instance with id: " + id);
        try {
            Carrera instance = entityManager.find(Carrera.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

