package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Requisitociclo.
 * @see ar.com.pauen.modelo.Requisitociclo
 * @author Hibernate Tools
 */
@Stateless
public class RequisitocicloHome {

    private static final Log log = LogFactory.getLog(RequisitocicloHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Requisitociclo transientInstance) {
        log.debug("persisting Requisitociclo instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Requisitociclo persistentInstance) {
        log.debug("removing Requisitociclo instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Requisitociclo merge(Requisitociclo detachedInstance) {
        log.debug("merging Requisitociclo instance");
        try {
            Requisitociclo result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Requisitociclo findById( RequisitocicloId id) {
        log.debug("getting Requisitociclo instance with id: " + id);
        try {
            Requisitociclo instance = entityManager.find(Requisitociclo.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

