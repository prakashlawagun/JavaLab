public class TryFinally
{
	public static void main(String[] args) {
		
		try
		{
			int a =5/0;
		System.out.println(a);
		}

		finally
		{
			System.out.println("This is power of finally");
		}

		System.out.println("i am not printed");
		
	}
}