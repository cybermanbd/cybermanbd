import java.util.Scanner;

public class ArrayCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String St;
		St=input.nextLine();
		System.out.println(St);
		
		
		char [] parse=St.toCharArray();
	
		System.out.println(parse[0]);
		
		int hash= parse.hashCode();
		System.out.println(hash);

	}

}
