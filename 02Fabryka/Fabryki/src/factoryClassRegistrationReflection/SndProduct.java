package factoryClassRegistrationReflection;

public class SndProduct extends Product {
	static {
		// TU: powinien by� Singleton pf !!!!
		ProductFactory pf = new ProductFactory();
				
		pf.registerProduct("ID2",SndProduct.class);
	}
}
