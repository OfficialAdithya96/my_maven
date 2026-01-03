package ExceptionExample;

public class Maths 
{
	int a;
	int b=20;
	public void div()
	{
		try {
		System.out.println("output is"+ (b/a));
		}
       
		/* catch(Exception e1)
	{
		System.out.println("the exception error is" +e1);
	}
		}*/
		finally {
			System.out.println("Finally block");
		}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths obj=new Maths();
		System.out.println("Before exception code executed");
		obj.div();
		System.out.println("After exception working as of now");

	}

}
