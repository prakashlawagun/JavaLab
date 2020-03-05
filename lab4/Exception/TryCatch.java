public class TryCatch
{
	public static void main(String[] args) {
		try
		{
		int a =5/0;
		}

		catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		
		System.out.println("Normal Try-Catch example");
	}
}