package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tipodocumento.
 * @see ar.com.pauen.modelo.Tipodocumento
 * @author Hibernate Tools
 */
@Stateless
public class TipodocumentoHome {

    private static final Log log = LogFactory.getLog(TipodocumentoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Tipodocumento transientInstance) {
        log.debug("persisting Tipodocumento instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Tipodocumento persistentInstance) {
        log.debug("removing Tipodocumento instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Tipodocumento merge(Tipodocumento detachedInstance) {
        log.debug("merging Tipodocumento instance");
        try {
            Tipodocumento result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Tipodocumento findById( Integer id) {
        log.debug("getting Tipodocumento instance with id: " + id);
        try {
            Tipodocumento instance = entityManager.find(Tipodocumento.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

