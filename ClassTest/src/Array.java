
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		int [] IArray = {1,2,1,2};
		char [] CArray = {'1','2'};
		String S = new String(CArray);
		int hash;
		int a=1;
		
		int length;
		length = IArray.hashCode();
		
		System.out.println(length);
		
		length = CArray.length;
		hash=CArray.hashCode();
		System.out.println(hash);
		
		length = S.length();
		System.out.println(length);
		
		
		System.out.println(IArray[0]);
		
		
	}

}
