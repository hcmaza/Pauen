package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Requisitoalumno.
 * @see ar.com.pauen.modelo.Requisitoalumno
 * @author Hibernate Tools
 */
@Stateless
public class RequisitoalumnoHome {

    private static final Log log = LogFactory.getLog(RequisitoalumnoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Requisitoalumno transientInstance) {
        log.debug("persisting Requisitoalumno instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Requisitoalumno persistentInstance) {
        log.debug("removing Requisitoalumno instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Requisitoalumno merge(Requisitoalumno detachedInstance) {
        log.debug("merging Requisitoalumno instance");
        try {
            Requisitoalumno result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Requisitoalumno findById( RequisitoalumnoId id) {
        log.debug("getting Requisitoalumno instance with id: " + id);
        try {
            Requisitoalumno instance = entityManager.find(Requisitoalumno.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

