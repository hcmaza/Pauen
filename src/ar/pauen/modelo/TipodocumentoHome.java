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
 * Home object for domain model class Tipodocumento.
 * @see ar.pauen.modelo.Tipodocumento
 * @author Hibernate Tools
 */
public class TipodocumentoHome {

    private static final Log log = LogFactory.getLog(TipodocumentoHome.class);

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
    
    public void persist(Tipodocumento transientInstance) {
        log.debug("persisting Tipodocumento instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Tipodocumento instance) {
        log.debug("attaching dirty Tipodocumento instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Tipodocumento instance) {
        log.debug("attaching clean Tipodocumento instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Tipodocumento persistentInstance) {
        log.debug("deleting Tipodocumento instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Tipodocumento merge(Tipodocumento detachedInstance) {
        log.debug("merging Tipodocumento instance");
        try {
            Tipodocumento result = (Tipodocumento) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Tipodocumento findById( java.lang.Integer id) {
        log.debug("getting Tipodocumento instance with id: " + id);
        try {
            Tipodocumento instance = (Tipodocumento) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Tipodocumento", id);
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
    
    public List<Tipodocumento> findByExample(Tipodocumento instance) {
        log.debug("finding Tipodocumento instance by example");
        try {
            List<Tipodocumento> results = (List<Tipodocumento>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Tipodocumento")
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

