package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Titulo.
 * @see ar.com.pauen.modelo.Titulo
 * @author Hibernate Tools
 */
@Stateless
public class TituloHome {

    private static final Log log = LogFactory.getLog(TituloHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Titulo transientInstance) {
        log.debug("persisting Titulo instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Titulo persistentInstance) {
        log.debug("removing Titulo instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Titulo merge(Titulo detachedInstance) {
        log.debug("merging Titulo instance");
        try {
            Titulo result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Titulo findById( Integer id) {
        log.debug("getting Titulo instance with id: " + id);
        try {
            Titulo instance = entityManager.find(Titulo.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

