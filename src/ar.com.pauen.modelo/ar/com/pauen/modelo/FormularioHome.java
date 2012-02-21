package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Formulario.
 * @see ar.com.pauen.modelo.Formulario
 * @author Hibernate Tools
 */
@Stateless
public class FormularioHome {

    private static final Log log = LogFactory.getLog(FormularioHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Formulario transientInstance) {
        log.debug("persisting Formulario instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Formulario persistentInstance) {
        log.debug("removing Formulario instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Formulario merge(Formulario detachedInstance) {
        log.debug("merging Formulario instance");
        try {
            Formulario result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Formulario findById( Integer id) {
        log.debug("getting Formulario instance with id: " + id);
        try {
            Formulario instance = entityManager.find(Formulario.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

