
public class CharOperationExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result = v1 / v2;
        double result1 = (double) v1 /v2;
        System.out.println(result1);

        result = sum(10, 15);
        System.out.println("두수의 합은 : " + result); //안녕하세용

        System.out.println("두수의 차이는: " + minus(v1, v2));
        System.out.println("나눈 몫 : " + divide(v1, v2));
    }
    public static double divide (int num1, int num2){
        return (double)num1/num2;    
    }
    public static int sum (int num1, int num2){
        int result = num1 + num2;
        return result;


    }

    public static int minus (int num1, int num2){
        int result = num1 - num2;
        return result;
    }

}