package es.uniovi.asw.e3b.loader_e3b.executer;

public class ActionSingleton {
	private ActionFacade aF;
	private static ActionSingleton instance;

	private ActionSingleton() {
		this.aF = new ActionFacadeClass();
	}

	public static ActionSingleton getInstance() {
		if (instance == null)
			instance = new ActionSingleton();
		return instance;
	}

	public ActionFacade getAF() {
		return aF;
	}
}
