package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Inscripcionfinal.
 * @see ar.com.pauen.modelo.Inscripcionfinal
 * @author Hibernate Tools
 */
@Stateless
public class InscripcionfinalHome {

    private static final Log log = LogFactory.getLog(InscripcionfinalHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Inscripcionfinal transientInstance) {
        log.debug("persisting Inscripcionfinal instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Inscripcionfinal persistentInstance) {
        log.debug("removing Inscripcionfinal instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Inscripcionfinal merge(Inscripcionfinal detachedInstance) {
        log.debug("merging Inscripcionfinal instance");
        try {
            Inscripcionfinal result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Inscripcionfinal findById( InscripcionfinalId id) {
        log.debug("getting Inscripcionfinal instance with id: " + id);
        try {
            Inscripcionfinal instance = entityManager.find(Inscripcionfinal.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

