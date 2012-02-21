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
 * Home object for domain model class Encuesta.
 * @see ar.pauen.modelo.Encuesta
 * @author Hibernate Tools
 */
public class EncuestaHome {

    private static final Log log = LogFactory.getLog(EncuestaHome.class);

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
    
    public void persist(Encuesta transientInstance) {
        log.debug("persisting Encuesta instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Encuesta instance) {
        log.debug("attaching dirty Encuesta instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Encuesta instance) {
        log.debug("attaching clean Encuesta instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Encuesta persistentInstance) {
        log.debug("deleting Encuesta instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Encuesta merge(Encuesta detachedInstance) {
        log.debug("merging Encuesta instance");
        try {
            Encuesta result = (Encuesta) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Encuesta findById( ar.pauen.modelo.EncuestaId id) {
        log.debug("getting Encuesta instance with id: " + id);
        try {
            Encuesta instance = (Encuesta) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Encuesta", id);
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
    
    public List<Encuesta> findByExample(Encuesta instance) {
        log.debug("finding Encuesta instance by example");
        try {
            List<Encuesta> results = (List<Encuesta>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Encuesta")
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

