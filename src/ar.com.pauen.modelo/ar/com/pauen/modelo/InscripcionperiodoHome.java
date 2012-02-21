package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Inscripcionperiodo.
 * @see ar.com.pauen.modelo.Inscripcionperiodo
 * @author Hibernate Tools
 */
@Stateless
public class InscripcionperiodoHome {

    private static final Log log = LogFactory.getLog(InscripcionperiodoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Inscripcionperiodo transientInstance) {
        log.debug("persisting Inscripcionperiodo instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Inscripcionperiodo persistentInstance) {
        log.debug("removing Inscripcionperiodo instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Inscripcionperiodo merge(Inscripcionperiodo detachedInstance) {
        log.debug("merging Inscripcionperiodo instance");
        try {
            Inscripcionperiodo result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Inscripcionperiodo findById( Integer id) {
        log.debug("getting Inscripcionperiodo instance with id: " + id);
        try {
            Inscripcionperiodo instance = entityManager.find(Inscripcionperiodo.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

