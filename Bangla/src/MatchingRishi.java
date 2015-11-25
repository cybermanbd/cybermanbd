import java.util.Scanner;

public class MatchingRishi {

	public static void main(String[] args) {
		
		
				
				String text;
				Scanner input = new Scanner(System.in);
				System.out.println("Insert Bangla Text : ");
				
				text=input.nextLine();
				
				System.out.println(text);

				char [] token = text.toCharArray();
				int i;	
				for(i=0;i<token.length;i++)
				{
					System.out.println("position" + i + ": " +token[i]);
					
				}
				
				if(token[2]=='ি')
						{
							System.out.println("matched");
								
						}

	}	

}
