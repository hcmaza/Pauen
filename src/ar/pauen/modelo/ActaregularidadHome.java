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
 * Home object for domain model class Actaregularidad.
 * @see ar.pauen.modelo.Actaregularidad
 * @author Hibernate Tools
 */
public class ActaregularidadHome {

    private static final Log log = LogFactory.getLog(ActaregularidadHome.class);

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
    
    public void persist(Actaregularidad transientInstance) {
        log.debug("persisting Actaregularidad instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Actaregularidad instance) {
        log.debug("attaching dirty Actaregularidad instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Actaregularidad instance) {
        log.debug("attaching clean Actaregularidad instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Actaregularidad persistentInstance) {
        log.debug("deleting Actaregularidad instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Actaregularidad merge(Actaregularidad detachedInstance) {
        log.debug("merging Actaregularidad instance");
        try {
            Actaregularidad result = (Actaregularidad) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Actaregularidad findById( java.lang.Integer id) {
        log.debug("getting Actaregularidad instance with id: " + id);
        try {
            Actaregularidad instance = (Actaregularidad) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Actaregularidad", id);
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
    
    public List<Actaregularidad> findByExample(Actaregularidad instance) {
        log.debug("finding Actaregularidad instance by example");
        try {
            List<Actaregularidad> results = (List<Actaregularidad>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Actaregularidad")
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

