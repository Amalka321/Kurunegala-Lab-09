import java.util.Scanner;
public class IT26101774Lab9Q1
{
	public static void main(String[] args){
		
		double a,b,c,x,r1,r2,r3;
		
	    Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter value a:");
	    a = input.nextDouble();
		
		System.out.print("Enter value b:");
	    b = input.nextDouble();
		
		System.out.print("Enter value c:");
	    c = input.nextDouble();
		
		x = Math.pow(b,2) - (4*a*c);
		System.out.println("/n");
		
		if (x>0){
        
		r1 = (-b + Math.sqrt(x))/(2*a);
		r2 = (-b - Math.sqrt(x))/(2*a);
		
		
		System.out.println("Root are real and different :");
		System.out.println("Root 1 :"+String.format("%.2f", r1));
		System.out.println("Root 2 :"+String.format("%.2f", r2));
		}
		else if (x==0)
		{
		   r3=(-b/2*a);
		   System.out.println("Root are real and equal :");
           System.out.println("Root  :"+r3);
		
		}
		
	}
