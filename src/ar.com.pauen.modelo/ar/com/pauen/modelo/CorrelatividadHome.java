package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Correlatividad.
 * @see ar.com.pauen.modelo.Correlatividad
 * @author Hibernate Tools
 */
@Stateless
public class CorrelatividadHome {

    private static final Log log = LogFactory.getLog(CorrelatividadHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Correlatividad transientInstance) {
        log.debug("persisting Correlatividad instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Correlatividad persistentInstance) {
        log.debug("removing Correlatividad instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Correlatividad merge(Correlatividad detachedInstance) {
        log.debug("merging Correlatividad instance");
        try {
            Correlatividad result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Correlatividad findById( CorrelatividadId id) {
        log.debug("getting Correlatividad instance with id: " + id);
        try {
            Correlatividad instance = entityManager.find(Correlatividad.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

