import java.util.Scanner;

public class IT26101774Lab9Q2{
	

	public static void main(String[]args){
		Scanner input= new Scanner(System.in);

		System.out.println("Enter the radius of the cricle:");
		double radius = input.nextDouble();
		
		
		double area = cricleArea(radius);
		System.out.println("The Area of the cricle ="+area);
	}
	public static double cricleArea(double radius){
		return 22/7*radius*radius;
	}
}
	
	