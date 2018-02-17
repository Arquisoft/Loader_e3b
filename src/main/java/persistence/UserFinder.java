package persistence;

import java.util.List;
import model.Agent;
import persistence.util.Jpa;

public class UserFinder {

	public static List<Agent> findByIdentificador(String dni) {
		return Jpa.getManager().createNamedQuery("User.findByIdentificador", Agent.class).
				setParameter(1, dni).getResultList();
	}

	public static List<Agent> findByEmail(String email) {
		return Jpa.getManager().createNamedQuery("User.findByEmail", Agent.class).
				setParameter(1, email).getResultList();
	}
}
