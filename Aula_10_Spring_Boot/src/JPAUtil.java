public class JPAUtil {
	private static EntityManagerFactory factory;
	//bloco inicializador est�tico
	static {
		factory = Persistence.createEntityManagerFactory("usjtPU");
	}
	public static EntityManager getEntityManager () {
		return factory.createEntityManager();
	}
	public static void close () {
		factory.close();
	}
}