package my_interface;

public class SampleClass implements SampleInterface {
	
	public void add() 
	{
		int p=10; int q=20; int s = p+q;
		System.out.println("sample class method to add numbers"+s);
	}
	
	
public void display() {
	System.out.println("Interface/abstract method 1 display");
	
}
	public void show() 
	{
		System.out.println("Interface/abstract method 2 show");
		
}
	public static void main(String[] args) {
		
		SampleClass obj= new SampleClass();
		obj.show();
		obj.display();
		obj.add();
		System.out.println("variables inside interface a "+obj.a);
		System.out.println("variables inside interface a "+obj.b);
		// TODO Auto-generated method stub
SampleInterface obj2 = new SampleClass();
obj2.show();
obj2.display();
// we cannot give as it is undefined as we have created obj creation using interface obj2.add();
	}

}
