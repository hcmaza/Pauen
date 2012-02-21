package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Escuela.
 * @see ar.com.pauen.modelo.Escuela
 * @author Hibernate Tools
 */
@Stateless
public class EscuelaHome {

    private static final Log log = LogFactory.getLog(EscuelaHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Escuela transientInstance) {
        log.debug("persisting Escuela instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Escuela persistentInstance) {
        log.debug("removing Escuela instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Escuela merge(Escuela detachedInstance) {
        log.debug("merging Escuela instance");
        try {
            Escuela result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Escuela findById( Integer id) {
        log.debug("getting Escuela instance with id: " + id);
        try {
            Escuela instance = entityManager.find(Escuela.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

