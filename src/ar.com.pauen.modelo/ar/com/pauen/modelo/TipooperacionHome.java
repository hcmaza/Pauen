package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tipooperacion.
 * @see ar.com.pauen.modelo.Tipooperacion
 * @author Hibernate Tools
 */
@Stateless
public class TipooperacionHome {

    private static final Log log = LogFactory.getLog(TipooperacionHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Tipooperacion transientInstance) {
        log.debug("persisting Tipooperacion instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Tipooperacion persistentInstance) {
        log.debug("removing Tipooperacion instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Tipooperacion merge(Tipooperacion detachedInstance) {
        log.debug("merging Tipooperacion instance");
        try {
            Tipooperacion result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Tipooperacion findById( Integer id) {
        log.debug("getting Tipooperacion instance with id: " + id);
        try {
            Tipooperacion instance = entityManager.find(Tipooperacion.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

