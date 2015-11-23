import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String [] test = new String[20];
String data;
int i;
Scanner input = new Scanner(System.in);

for(i=0;i<=5;i++)
{
	data=input.nextLine();
	test[i]= data;
}


for(i=0;i<=5;i++)
{
	System.out.println(test[i]);
}
	}

}
