package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Actaregularidad.
 * @see ar.com.pauen.modelo.Actaregularidad
 * @author Hibernate Tools
 */
@Stateless
public class ActaregularidadHome {

    private static final Log log = LogFactory.getLog(ActaregularidadHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Actaregularidad transientInstance) {
        log.debug("persisting Actaregularidad instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Actaregularidad persistentInstance) {
        log.debug("removing Actaregularidad instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Actaregularidad merge(Actaregularidad detachedInstance) {
        log.debug("merging Actaregularidad instance");
        try {
            Actaregularidad result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Actaregularidad findById( Integer id) {
        log.debug("getting Actaregularidad instance with id: " + id);
        try {
            Actaregularidad instance = entityManager.find(Actaregularidad.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

