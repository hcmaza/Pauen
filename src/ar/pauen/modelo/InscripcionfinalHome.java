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
 * Home object for domain model class Inscripcionfinal.
 * @see ar.pauen.modelo.Inscripcionfinal
 * @author Hibernate Tools
 */
public class InscripcionfinalHome {

    private static final Log log = LogFactory.getLog(InscripcionfinalHome.class);

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
    
    public void persist(Inscripcionfinal transientInstance) {
        log.debug("persisting Inscripcionfinal instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Inscripcionfinal instance) {
        log.debug("attaching dirty Inscripcionfinal instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Inscripcionfinal instance) {
        log.debug("attaching clean Inscripcionfinal instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Inscripcionfinal persistentInstance) {
        log.debug("deleting Inscripcionfinal instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Inscripcionfinal merge(Inscripcionfinal detachedInstance) {
        log.debug("merging Inscripcionfinal instance");
        try {
            Inscripcionfinal result = (Inscripcionfinal) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Inscripcionfinal findById( ar.pauen.modelo.InscripcionfinalId id) {
        log.debug("getting Inscripcionfinal instance with id: " + id);
        try {
            Inscripcionfinal instance = (Inscripcionfinal) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Inscripcionfinal", id);
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
    
    public List<Inscripcionfinal> findByExample(Inscripcionfinal instance) {
        log.debug("finding Inscripcionfinal instance by example");
        try {
            List<Inscripcionfinal> results = (List<Inscripcionfinal>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Inscripcionfinal")
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

