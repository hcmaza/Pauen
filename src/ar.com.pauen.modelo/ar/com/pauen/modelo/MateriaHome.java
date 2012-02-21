package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Materia.
 * @see ar.com.pauen.modelo.Materia
 * @author Hibernate Tools
 */
@Stateless
public class MateriaHome {

    private static final Log log = LogFactory.getLog(MateriaHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Materia transientInstance) {
        log.debug("persisting Materia instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Materia persistentInstance) {
        log.debug("removing Materia instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Materia merge(Materia detachedInstance) {
        log.debug("merging Materia instance");
        try {
            Materia result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Materia findById( Integer id) {
        log.debug("getting Materia instance with id: " + id);
        try {
            Materia instance = entityManager.find(Materia.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

