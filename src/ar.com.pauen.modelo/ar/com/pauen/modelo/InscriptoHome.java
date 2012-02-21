package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Inscripto.
 * @see ar.com.pauen.modelo.Inscripto
 * @author Hibernate Tools
 */
@Stateless
public class InscriptoHome {

    private static final Log log = LogFactory.getLog(InscriptoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Inscripto transientInstance) {
        log.debug("persisting Inscripto instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Inscripto persistentInstance) {
        log.debug("removing Inscripto instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Inscripto merge(Inscripto detachedInstance) {
        log.debug("merging Inscripto instance");
        try {
            Inscripto result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Inscripto findById( Integer id) {
        log.debug("getting Inscripto instance with id: " + id);
        try {
            Inscripto instance = entityManager.find(Inscripto.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

