import java.util.Scanner;
public class Z5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input your word : ");
        String str1 = in.nextLine().toLowerCase();
        String str2 = new StringBuffer(str1).reverse().toString();


        if (str1.equals(str2)) System.out.println("The word is a palindrome");
        else System.out.println("The word is not a palindrome");
    }
}
