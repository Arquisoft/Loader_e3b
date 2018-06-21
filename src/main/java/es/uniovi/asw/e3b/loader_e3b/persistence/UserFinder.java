package es.uniovi.asw.e3b.loader_e3b.persistence;

import java.util.List;

import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.Operario;
import es.uniovi.asw.e3b.loader_e3b.persistence.util.Jpa;

public class UserFinder {

	public static List<Agent> findByIdentificador(String identificador) {
		return Jpa.getManager().createNamedQuery("User.findByIdentificador", Agent.class).
				setParameter(1, identificador).getResultList();
	}

	public static List<Agent> findByEmail(String email) {
		return Jpa.getManager().createNamedQuery("User.findByEmail", Agent.class).
				setParameter(1, email).getResultList();
	}
	
	public static List<Operario> operarioFindByEmail(String email) {
		return Jpa.getManager().createNamedQuery("Operario.findByEmail", Operario.class).
				setParameter(1, email).getResultList();
	}
}
