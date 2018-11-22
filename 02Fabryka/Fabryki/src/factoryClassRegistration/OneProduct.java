package factoryClassRegistration;

class OneProduct extends Product{
	static
	{
		// TU: powinien by� Singleton pf !!!!
		ProductFactory pf = new ProductFactory();

		pf.registerProduct("ID1", new OneProduct());
	}
	public OneProduct createProduct()
	{
		return new OneProduct();
	}
	//...
}