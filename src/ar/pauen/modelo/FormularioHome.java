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
 * Home object for domain model class Formulario.
 * @see ar.pauen.modelo.Formulario
 * @author Hibernate Tools
 */
public class FormularioHome {

    private static final Log log = LogFactory.getLog(FormularioHome.class);

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
    
    public void persist(Formulario transientInstance) {
        log.debug("persisting Formulario instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Formulario instance) {
        log.debug("attaching dirty Formulario instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Formulario instance) {
        log.debug("attaching clean Formulario instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Formulario persistentInstance) {
        log.debug("deleting Formulario instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Formulario merge(Formulario detachedInstance) {
        log.debug("merging Formulario instance");
        try {
            Formulario result = (Formulario) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Formulario findById( java.lang.Integer id) {
        log.debug("getting Formulario instance with id: " + id);
        try {
            Formulario instance = (Formulario) sessionFactory.getCurrentSession()
                    .get("ar.pauen.modelo.Formulario", id);
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
    
    public List<Formulario> findByExample(Formulario instance) {
        log.debug("finding Formulario instance by example");
        try {
            List<Formulario> results = (List<Formulario>) sessionFactory.getCurrentSession()
                    .createCriteria("ar.pauen.modelo.Formulario")
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

