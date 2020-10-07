package presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Formation;
import metier.FormationInter;
import metier.FormationIntra;

public class Lanceur {

	public static void main(String[] args) {
		
		// 1. Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-mappingheritage");
		EntityManager em = emf.createEntityManager();
		
		// 2. Ouverture de la transaction		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//	3. Instanciation Objet méiter
		Formation formationIntra = new FormationIntra("Hibernate", "niveau Personnalisation 2");
		Formation formationInter = new FormationInter("JPA", 8);
		Formation formation = new Formation("JAVASE");
		
		//	4. Persistence Objet Relationnel : création d'un enregistrement en base
		em.persist(formationIntra);
		em.persist(formationInter);
		em.persist(formation);
		
		// 5. Fermeture transaction
		tx.commit();
		
		//	6. Fermeture unité de travail
		em.close();
		emf.close();
		
		
	}

}
