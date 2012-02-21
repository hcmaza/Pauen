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
 * Home object for domain model class Requisitoalumno.
 * @see ar.pauen.modelo.Requisitoalumno
 * @author Hibernate Tools
 */
public class RequisitoalumnoHome {

    private static final Log log = LogFactory.getLog(RequisitoalumnoHome.class);

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
    
    public void persist(Requisitoalumno transientInstance) {
        log.debug("persisting Requisitoalumno instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Requisitoalumno instance) {
        log.debug("attaching dirty Requisitoalumno instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Requisitoalumno instance) {
        log.debug("attaching clean Requisitoalumno instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Requisitoalumno persistentInstance) {
        log.debug("deleting Requisitoalumno instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Requisitoalumno merge(Requisitoalumno detachedInstance) {
        log.debug("merging Requisitoalumno instance");
        try {
            Requisitoalumno result = (Requisitoalumno) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Requisitoalumno findById( ar.pauen.modelo.RequisitoalumnoId id) {
        log.debug("getting Requisitoalumno instance with id: " + id);
        try {
            Requisitoalumno instance = (Requisitoalumno) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Requisitoalumno", id);
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
    
    public List<Requisitoalumno> findByExample(Requisitoalumno instance) {
        log.debug("finding Requisitoalumno instance by example");
        try {
            List<Requisitoalumno> results = (List<Requisitoalumno>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Requisitoalumno")
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

