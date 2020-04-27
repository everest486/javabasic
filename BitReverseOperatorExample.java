public class BitReverseOperatorExample{
	public static void main(String[] args){
		int num1 = 10;
		//java
		int num2 = -num1;
		String returnValue = toBinaryString(num1);
		System.out.println(returnValue);
	
		System.out.println(num2);
		returnValue = toBinaryString(num2);
		System.out.println(returnValue);
	}
	public static String toBinaryString(int value){
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0"+str;
		}
		return str;
	}
}