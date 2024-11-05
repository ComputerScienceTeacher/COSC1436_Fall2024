public class Ternary
{
    // condition ? expression1 : expression2;
    public static void main (String [] args)
    {
        int age = 20;
        boolean isStudent = true;

        String discount = (age < 18 || isStudent) ? "Eligible for discount" : "Not eligible for discount";

        System.out.println(discount);

        System.out.println("4 is " + checkEvenOrOdd(4));
        System.out.println("13 is " + checkEvenOrOdd(13));
    }

    public static String checkEvenOrOdd(int num)
    {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

}