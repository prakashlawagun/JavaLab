interface TestInterface
{
	public void Greet();

}

class Testclass implements TestInterface
{
	public void Greet()
	{
		System.out.println("Hello World");	
	
	}

	public static void main(String[] args) {
		Testclass a = new Testclass();
		a.Greet();
	}
}