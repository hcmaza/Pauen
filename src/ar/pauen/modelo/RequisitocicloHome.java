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
 * Home object for domain model class Requisitociclo.
 * @see ar.pauen.modelo.Requisitociclo
 * @author Hibernate Tools
 */
public class RequisitocicloHome {

    private static final Log log = LogFactory.getLog(RequisitocicloHome.class);

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
    
    public void persist(Requisitociclo transientInstance) {
        log.debug("persisting Requisitociclo instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Requisitociclo instance) {
        log.debug("attaching dirty Requisitociclo instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Requisitociclo instance) {
        log.debug("attaching clean Requisitociclo instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Requisitociclo persistentInstance) {
        log.debug("deleting Requisitociclo instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Requisitociclo merge(Requisitociclo detachedInstance) {
        log.debug("merging Requisitociclo instance");
        try {
            Requisitociclo result = (Requisitociclo) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Requisitociclo findById( ar.pauen.modelo.RequisitocicloId id) {
        log.debug("getting Requisitociclo instance with id: " + id);
        try {
            Requisitociclo instance = (Requisitociclo) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Requisitociclo", id);
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
    
    public List<Requisitociclo> findByExample(Requisitociclo instance) {
        log.debug("finding Requisitociclo instance by example");
        try {
            List<Requisitociclo> results = (List<Requisitociclo>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Requisitociclo")
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

