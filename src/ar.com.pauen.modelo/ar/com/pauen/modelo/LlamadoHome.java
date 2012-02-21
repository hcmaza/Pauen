package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Llamado.
 * @see ar.com.pauen.modelo.Llamado
 * @author Hibernate Tools
 */
@Stateless
public class LlamadoHome {

    private static final Log log = LogFactory.getLog(LlamadoHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Llamado transientInstance) {
        log.debug("persisting Llamado instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Llamado persistentInstance) {
        log.debug("removing Llamado instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Llamado merge(Llamado detachedInstance) {
        log.debug("merging Llamado instance");
        try {
            Llamado result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Llamado findById( Integer id) {
        log.debug("getting Llamado instance with id: " + id);
        try {
            Llamado instance = entityManager.find(Llamado.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
