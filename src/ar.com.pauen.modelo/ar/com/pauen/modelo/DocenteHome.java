package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Docente.
 * @see ar.com.pauen.modelo.Docente
 * @author Hibernate Tools
 */
@Stateless
public class DocenteHome {

    private static final Log log = LogFactory.getLog(DocenteHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Docente transientInstance) {
        log.debug("persisting Docente instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Docente persistentInstance) {
        log.debug("removing Docente instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Docente merge(Docente detachedInstance) {
        log.debug("merging Docente instance");
        try {
            Docente result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Docente findById( Integer id) {
        log.debug("getting Docente instance with id: " + id);
        try {
            Docente instance = entityManager.find(Docente.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

