import java.awt.Menu;
import java.util.Scanner;

public class mainShop {

	public static void main(String[] args) {
		int input;
		//onno ekta class call kroe oi class diye main class er arekta function ke call korchi.
		UseMenu oUseMenu = new UseMenu();
		int extra = oUseMenu.userMain();
		
		//direct main class er function use korchi 
		input = menu();
		System.out.println(input);

	}
	
	
	
	
	public static int menu() {
		int choice=0;
		System.out.println("Welcome to Menu");
		System.out.println("Press 1  for buy");
		System.out.println("Press 2  for add");
		System.out.println("Press 3  for view");
		System.out.println("Press 4  for popular");
		System.out.println("Enter Choice : ");
		Scanner input=new Scanner(System.in);
		 choice = input.nextInt();
		
		return choice;
		

	}
	
	
	public static int Extramenu() {
		int choice=0;
		System.out.println("Welcome to ExtraMenu");
		System.out.println("Press 1  for buy");
		System.out.println("Press 2  for add");
		System.out.println("Press 3  for view");
		System.out.println("Press 4  for popular");
		System.out.println("Enter Choice : ");
		Scanner input=new Scanner(System.in);
		 choice = input.nextInt();
		
		return choice;
		

	}


}
