package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Pais.
 * @see ar.com.pauen.modelo.Pais
 * @author Hibernate Tools
 */
@Stateless
public class PaisHome {

    private static final Log log = LogFactory.getLog(PaisHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Pais transientInstance) {
        log.debug("persisting Pais instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Pais persistentInstance) {
        log.debug("removing Pais instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Pais merge(Pais detachedInstance) {
        log.debug("merging Pais instance");
        try {
            Pais result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Pais findById( Integer id) {
        log.debug("getting Pais instance with id: " + id);
        try {
            Pais instance = entityManager.find(Pais.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

