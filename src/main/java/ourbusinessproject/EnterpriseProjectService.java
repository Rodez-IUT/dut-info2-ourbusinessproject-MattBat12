package ourbusinessproject;



import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service // notifie à Spring que c'est une classe de service
public class EnterpriseProjectService {

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * Sauvegarde un projet
     * @param projet
     */
    public void save (Project projet) {
        entityManager.persist(projet);
        entityManager.flush();
    }

    /**
     * Sauvegarde une entreprise
     * @param entreprise
     */
    public void save (Enterprise entreprise) {
        entityManager.persist(entreprise);
        entityManager.flush();
    }

    /**
     * Trouve un projet grâce à son identifiant
     * @param id
     */
    public Project findProjectById(long id) {
        Project projetTrouve = entityManager.find(Project.class,id);
        return projetTrouve;
    }

    /**
     * Trouve une entreprise grâce à son identifiant
     * @param id
     */
    public Enterprise findEnterpriseById(long id) {
        Enterprise entrepriseTrouvee = entityManager.find(Enterprise.class,id);
        return entrepriseTrouvee;
    }
}
