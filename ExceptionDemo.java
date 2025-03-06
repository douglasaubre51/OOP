import java.util.Scanner;
import java.lang.Exception;

class ValidityException extends Exception{
	String message;

	public ValidityException(String message){
		this.message=message;
	}
}

public class ExceptionDemo{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter no of students:");
		int size=scanner.nextInt();

		int[] mark1=new int[size];
		int[] mark2=new int[size];

		System.out.println("enter mark1 of students:");
		
		for(int i=0;i<size;i++){
			try{
				int temp=scanner.nextInt();

				if(temp>100 | temp<0){
					throw new ValidityException("error:invalid range!mark is either greater than 100 or less than 0!");
				}	
				else
					mark1[i]=temp;

			}catch(ValidityException ex){
				System.out.println(ex.message);
				i--;
			}
		}
			
		System.out.println("enter mark2 of students:");
		
		for(int i=0;i<size;i++){
			try{
				int temp=scanner.nextInt();

				if(temp>100 | temp<0){
					throw new ValidityException("error:invalid range!mark is either greater than 100 or less than 0!");
				}	
				else
					mark2[i]=temp;

			}catch(ValidityException ex){
				System.out.println(ex.message);
				i--;
			}
		}
		
		int result[]=new int[size];
		
		for(int i=0;i<size;i++){
			try{
				result[i]=mark1[i]/mark2[i];
			}catch(ArithmeticException ex){
				System.out.println("error: "+ex.getMessage());
			}
		}

		System.out.println("result list:");

		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}

		System.out.println("bye");
	}	
}
