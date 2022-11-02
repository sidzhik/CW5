import java.util.Scanner;
public class Z4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Input the 1st string: ");
        String str1 = in.nextLine();
        System.out.println(str1);
        System.out.print("Input the 2st string: ");
        String str2 = in.nextLine();
        System.out.println(str2);

        String str3 =  str1.concat(str2);
        String str4 =  str2.concat(str1);
        System.out.println("\n" + str3);
        System.out.println(str4);
        System.out.println("\nThe result of comparing two combined strings:\n\t\t " + str3.equals(str4));
    }
}
