
public class Parameters {

    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(4, 8)); //arguments
        System.out.println(sumTwoNumbers(23, 6));//arguments
        System.out.println(sumTwoNumbers(34, 23));//arguments
        System.out.println(sumTwoNumbers(45, 9));//arguments
    }

    public static int sumTwoNumbers(int first, int second) //paramters  
     {
        System.out.println("First number recevied: " + first);
        System.out.println("Second number recevied: " + second);
        int sum = first + second;
        return sum;

    }
}
