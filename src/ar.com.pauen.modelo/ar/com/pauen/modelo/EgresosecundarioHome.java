package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:37 by Hibernate Tools 3.4.0.CR1


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Egresosecundario.
 * @see ar.com.pauen.modelo.Egresosecundario
 * @author Hibernate Tools
 */
@Stateless
public class EgresosecundarioHome {

    private static final Log log = LogFactory.getLog(EgresosecundarioHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Egresosecundario transientInstance) {
        log.debug("persisting Egresosecundario instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Egresosecundario persistentInstance) {
        log.debug("removing Egresosecundario instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Egresosecundario merge(Egresosecundario detachedInstance) {
        log.debug("merging Egresosecundario instance");
        try {
            Egresosecundario result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Egresosecundario findById( int id) {
        log.debug("getting Egresosecundario instance with id: " + id);
        try {
            Egresosecundario instance = entityManager.find(Egresosecundario.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

