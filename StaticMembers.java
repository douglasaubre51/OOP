import java.util.Scanner;

class MathOperator{
	static int x,y;
	static int sum;
	static int difference;
	static int product;
	static int quotient;
	static int remainder;

	static void Add(){
		sum=x+y;
	}

	static void Subtract(){
		difference=x-y;
	}

	static void Multiply(){
		product=x*y;
	}

	static void Divide(){
		quotient=x/y;
	}

	static void Remainder(){
		remainder=x%y;
	}


	static void getResults(){
		System.out.println("x: "+x+" y: "+y);

		System.out.println("results:-");

		System.out.println("sum: "+sum);
		System.out.println("difference: "+difference);
		System.out.println("product: "+product);
		System.out.println("quotient: "+quotient);
		System.out.println("remainder: "+remainder);
	}
}

public class StaticMembers{
	public static void main(String[] args){

		System.out.println("enter 2 nos:");
		Scanner scanner=new Scanner(System.in);
		MathOperator.x=scanner.nextInt();
		MathOperator.y=scanner.nextInt();

		scanner.close();

		MathOperator.Add();
		MathOperator.Subtract();
		MathOperator.Multiply();
		MathOperator.Divide();
		MathOperator.Remainder();

		MathOperator.getResults(); 
	}
}
