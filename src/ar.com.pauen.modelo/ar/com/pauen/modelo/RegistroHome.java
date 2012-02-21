package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Registro.
 * @see ar.com.pauen.modelo.Registro
 * @author Hibernate Tools
 */
@Stateless
public class RegistroHome {

    private static final Log log = LogFactory.getLog(RegistroHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Registro transientInstance) {
        log.debug("persisting Registro instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Registro persistentInstance) {
        log.debug("removing Registro instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Registro merge(Registro detachedInstance) {
        log.debug("merging Registro instance");
        try {
            Registro result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Registro findById( Integer id) {
        log.debug("getting Registro instance with id: " + id);
        try {
            Registro instance = entityManager.find(Registro.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

