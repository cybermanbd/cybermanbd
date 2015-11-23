import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int [] Array = new int [4];
		
			int i;
			
			Scanner input = new Scanner(System.in);
			
			for (i=1;i<=3;i++)
			{
				Array[i]=input.nextInt();
			}
			
			for (i=1;i<=3;i++)
			{
				System.out.println(Array[i]);
			}
			
			
	}

}
