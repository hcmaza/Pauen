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
 * Home object for domain model class Materiaingreso.
 * @see ar.pauen.modelo.Materiaingreso
 * @author Hibernate Tools
 */
public class MateriaingresoHome {

    private static final Log log = LogFactory.getLog(MateriaingresoHome.class);

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
    
    public void persist(Materiaingreso transientInstance) {
        log.debug("persisting Materiaingreso instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Materiaingreso instance) {
        log.debug("attaching dirty Materiaingreso instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Materiaingreso instance) {
        log.debug("attaching clean Materiaingreso instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Materiaingreso persistentInstance) {
        log.debug("deleting Materiaingreso instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Materiaingreso merge(Materiaingreso detachedInstance) {
        log.debug("merging Materiaingreso instance");
        try {
            Materiaingreso result = (Materiaingreso) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Materiaingreso findById( ar.pauen.modelo.MateriaingresoId id) {
        log.debug("getting Materiaingreso instance with id: " + id);
        try {
            Materiaingreso instance = (Materiaingreso) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Materiaingreso", id);
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
    
    public List<Materiaingreso> findByExample(Materiaingreso instance) {
        log.debug("finding Materiaingreso instance by example");
        try {
            List<Materiaingreso> results = (List<Materiaingreso>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Materiaingreso")
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

