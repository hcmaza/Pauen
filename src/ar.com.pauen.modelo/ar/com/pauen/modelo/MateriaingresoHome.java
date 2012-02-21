package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Materiaingreso.
 * @see ar.com.pauen.modelo.Materiaingreso
 * @author Hibernate Tools
 */
@Stateless
public class MateriaingresoHome {

    private static final Log log = LogFactory.getLog(MateriaingresoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Materiaingreso transientInstance) {
        log.debug("persisting Materiaingreso instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Materiaingreso persistentInstance) {
        log.debug("removing Materiaingreso instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Materiaingreso merge(Materiaingreso detachedInstance) {
        log.debug("merging Materiaingreso instance");
        try {
            Materiaingreso result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Materiaingreso findById( MateriaingresoId id) {
        log.debug("getting Materiaingreso instance with id: " + id);
        try {
            Materiaingreso instance = entityManager.find(Materiaingreso.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

