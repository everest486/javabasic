public class LongExample{
	public static void main(String[] args){
		long num1 = 100l;
		long num2 = 20L;
		long num3 = 1000000000000l;
		
		System.out.println("num1: "+num1+"num2: "+num2+"num3: "+num3);
		
		int num4 = Integer.MAX_VALUE;
		int num5 = 1;
		num4 = 21473;
		if (num4 <= Integer.MAX_VALUE -num5){	
		int result = num4 + num5;
		System.out.println(result);
		}else{
			System.out.println("overflow maxvalue");
		}
		
		int num6 = 562545;
		int num7 = 654545;
		
		if (num6 <= Integer.MAX_VALUE/num7) {
			int result = num6 * num7;
			System.out.println(result);
	} else {
			System.out.println("overflow maxvalue");
		}
	}
}
		
		