
public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		
		int [] a={5,6,7};
		int b=5;
		char [] c = {'h','e','l','l','o','n','j'};
		char d='a';
		int hash;
		String test = "hello";
		String convert = new String(c);
		
		
		hash = a.hashCode();
		System.out.println(hash);
		
		hash = test.hashCode();
		System.out.println(hash);
		
		hash = c.hashCode();
		System.out.println(hash);
		
		hash = convert.hashCode();
		System.out.println(hash);
	

	}

}
