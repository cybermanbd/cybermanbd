import java.util.Scanner;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text;
		Scanner input = new Scanner(System.in);
		System.out.println("Insert Bangla Text : ");
		
		text=input.nextLine();
		
		System.out.println(text);
			if(text.equals("আমর"))
			{
				System.out.println("আমরা");
				
			}
		char [] token = text.toCharArray();
			//System.out.println(token[0]);
			//System.out.println(token[1]);
			//System.out.println(token[2]);
			//System.out.println(token[3]);
		int i;	
		for(i=0;i<=token.length;i++)
		{
			System.out.println(token[i]);
			
		}
		
		//main(new String[] {"a","b","c"});

	}

}
