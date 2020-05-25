
public class TesteBuscaPorIdComGetReference {
	public class TesteBuscaPorIdComGetReference {
		public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Usuario u = manager.getReference(Usuario.class, 1L);
		System.out.println(u);
		manager.close();
		JPAUtil.close();
		}
	}
}