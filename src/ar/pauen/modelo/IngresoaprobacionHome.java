package ar.pauen.modelo;
// Generated 21/02/2012 14:25:44 by Hibernate Tools 3.4.0.CR1


import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Ingresoaprobacion.
 * @see ar.pauen.modelo.Ingresoaprobacion
 * @author Hibernate Tools
 */
public class IngresoaprobacionHome {

    private static final Log log = LogFactory.getLog(IngresoaprobacionHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(Ingresoaprobacion transientInstance) {
        log.debug("persisting Ingresoaprobacion instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Ingresoaprobacion instance) {
        log.debug("attaching dirty Ingresoaprobacion instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Ingresoaprobacion instance) {
        log.debug("attaching clean Ingresoaprobacion instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Ingresoaprobacion persistentInstance) {
        log.debug("deleting Ingresoaprobacion instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Ingresoaprobacion merge(Ingresoaprobacion detachedInstance) {
        log.debug("merging Ingresoaprobacion instance");
        try {
            Ingresoaprobacion result = (Ingresoaprobacion) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Ingresoaprobacion findById( java.lang.Integer id) {
        log.debug("getting Ingresoaprobacion instance with id: " + id);
        try {
            Ingresoaprobacion instance = (Ingresoaprobacion) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Ingresoaprobacion", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List<Ingresoaprobacion> findByExample(Ingresoaprobacion instance) {
        log.debug("finding Ingresoaprobacion instance by example");
        try {
            List<Ingresoaprobacion> results = (List<Ingresoaprobacion>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Ingresoaprobacion")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

