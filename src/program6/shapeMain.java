package program6;

import java.util.Scanner;

public class shapeMain  {
	
	
	

	public static void main(String[] args) {
		
		double radious =0;
		String shapeName="";
		double side =0;
		double area=0;
		double volume =0;
		double length =0;
		double width =0;
		double height =0;
		double base = 0;
		
		
		int choice =0;
		Scanner input = new Scanner(System.in);
		
		menu();
		choice = input.nextInt();
		
		while(choice != 5) {
		if(choice <= 0 || choice > 4) {
			System.out.println("invalid input try agian");
			choice = input.nextInt();
		}
		
		switch(choice)
		{
		case 1:{
			
			System.out.println("Enter radious of circle");
			radious = input.nextDouble();
			if(radious < 0) {
				System.out.println("must be a postive value pls try agian ");
				width = input.nextDouble();
			}
			
			Circle myCircle = new Circle(radious, shapeName, area, volume);
			System.out.printf("the area of the circle is %,.2f" , myCircle.getArea(radious));
			System.out.printf("the area of the circle is %,.2f" , myCircle.getVolume(radious));
			System.out.println(" ");
			break;
			
			
		}//end case 1
		
		case 2:
		{

			System.out.println("Enter side value");
			Square mySquare = new Square(volume, area, side, shapeName);
			side = input.nextDouble();
			
			if(side < 0) {
				System.out.println("must be a postive value pls try agian ");
				width = input.nextDouble();
			}
			
			System.out.printf(" the area is " +mySquare.getArea(side));
			System.out.printf(" the volume of the square is %,.2f" ,mySquare.getVolume(side));
			break;
		}//end case 2
		
		case 3:{
			
			
			Rectangle myRec = new Rectangle(volume, length, height, width, volume, shapeName);
		
			System.out.println("Enter rectangle width");
			width = input.nextDouble();
			if(width > 0) {
				System.out.println("must be a postive value pls try agian ");
				width = input.nextDouble();
			}
			
			System.out.println("Enter rectangle height");
			height = input.nextDouble();
			
			if(height < 0) {
				System.out.println("must be a postive value pls try agian ");
				height = input.nextDouble();
			}
			
			System.out.println("Enter rectnagle length");
			length = input.nextDouble();
			
			if(length < 0) {
				System.out.println("must be a postive value pls try agian ");
				width = input.nextDouble();
			}
			
			System.out.printf("The area of your rectangle is %,.2f" , myRec.getArea(length,width,height));
			System.out.printf("The volume of your rectangle is %,.2f " , myRec.getVolume(length,width,height));
			System.out.println(" ");
			break;
		}
		case 4:{
			
			Triangle myT = new Triangle(base, length, height, volume, shapeName, area);
			System.out.println("Enter triangle length");
			length = input.nextDouble();
			if(length < 0) {
				System.out.println("must be a postive value pls try agian ");
				length = input.nextDouble();
			}
			System.out.println("Enter triangle base");
			base = input.nextDouble();
			
			if(base < 0) {
				System.out.println("must be a postive value pls try agian ");
				base = input.nextDouble();
			}
			
			System.out.println("Enter triangle height");
			height = input.nextDouble();
			if(height < 0) {
				System.out.println("must be a postive value pls try agian ");
				height = input.nextDouble();
			}
			
			System.out.printf("The area of your triangle is %,.2f" , myT.getArea(length,height,base));
			System.out.printf("The volume of your triangle is %,.2f" , myT.getVolume(length,height,base));
			System.out.println(" ");
			break;
		}
		
		
		}
		menu();
		choice = input.nextInt();
		if(choice <= 0 || choice > 4) {
			System.out.println("invalid input try agian");
			choice = input.nextInt();
			
		}
		}
		
		
			
	
		}
	public static void menu() {
		System.out.println("Enter 1 for circle");
		System.out.println("Enter 2 for Square");
		System.out.println("Enter 3 for Rectangle");
		System.out.println("Enter 4 for Triangle");
		System.out.println("Enter 5 to exit");
	}
}
	


	
