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
 * Home object for domain model class Correlatividad.
 * @see ar.pauen.modelo.Correlatividad
 * @author Hibernate Tools
 */
public class CorrelatividadHome {

    private static final Log log = LogFactory.getLog(CorrelatividadHome.class);

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
    
    public void persist(Correlatividad transientInstance) {
        log.debug("persisting Correlatividad instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Correlatividad instance) {
        log.debug("attaching dirty Correlatividad instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Correlatividad instance) {
        log.debug("attaching clean Correlatividad instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Correlatividad persistentInstance) {
        log.debug("deleting Correlatividad instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Correlatividad merge(Correlatividad detachedInstance) {
        log.debug("merging Correlatividad instance");
        try {
            Correlatividad result = (Correlatividad) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Correlatividad findById( ar.pauen.modelo.CorrelatividadId id) {
        log.debug("getting Correlatividad instance with id: " + id);
        try {
            Correlatividad instance = (Correlatividad) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Correlatividad", id);
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
    
    public List<Correlatividad> findByExample(Correlatividad instance) {
        log.debug("finding Correlatividad instance by example");
        try {
            List<Correlatividad> results = (List<Correlatividad>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Correlatividad")
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

