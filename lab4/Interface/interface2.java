interface TestInterface
{
	public void Greet();

}
interface TestInterface2
{
	public void Greet2();
}

class Testclass implements TestInterface,TestInterface2
{
	public void Greet()
	{
		System.out.println("Hello World");	
	
	}

	public void Greet2()
	{
		System.out.println("Namaste");	
	
	}


	public static void main(String[] args) {
		Testclass a = new Testclass();
		a.Greet();
		a.Greet2();
	}
}