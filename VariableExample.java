public class VariableExample {
	public static void main(String [] args){
		byte b1, b2;
		byte b3 = 126;
		b3 += 1;
		b1 = 30;
		b2 = 70;
		int result = b1+b2;
	
		
		for ( int i = 0; i < 100; i++){
			b3++;
			System.out.println(b3);
		}
	}
}