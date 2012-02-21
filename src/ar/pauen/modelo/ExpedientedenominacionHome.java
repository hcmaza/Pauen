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
 * Home object for domain model class Expedientedenominacion.
 * @see ar.pauen.modelo.Expedientedenominacion
 * @author Hibernate Tools
 */
public class ExpedientedenominacionHome {

    private static final Log log = LogFactory.getLog(ExpedientedenominacionHome.class);

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
    
    public void persist(Expedientedenominacion transientInstance) {
        log.debug("persisting Expedientedenominacion instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Expedientedenominacion instance) {
        log.debug("attaching dirty Expedientedenominacion instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Expedientedenominacion instance) {
        log.debug("attaching clean Expedientedenominacion instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Expedientedenominacion persistentInstance) {
        log.debug("deleting Expedientedenominacion instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Expedientedenominacion merge(Expedientedenominacion detachedInstance) {
        log.debug("merging Expedientedenominacion instance");
        try {
            Expedientedenominacion result = (Expedientedenominacion) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Expedientedenominacion findById( java.lang.Integer id) {
        log.debug("getting Expedientedenominacion instance with id: " + id);
        try {
            Expedientedenominacion instance = (Expedientedenominacion) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Expedientedenominacion", id);
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
    
    public List<Expedientedenominacion> findByExample(Expedientedenominacion instance) {
        log.debug("finding Expedientedenominacion instance by example");
        try {
            List<Expedientedenominacion> results = (List<Expedientedenominacion>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Expedientedenominacion")
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

