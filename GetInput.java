import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInput {
    //to use this method, you should pass a (example.class)/example:int,string,...
    public static <T> Object GetInput(T c) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (c == int.class || c == Integer.class)
                return scanner.nextInt();
            if (c == String.class)
                return scanner.nextLine();
            if (c == double.class || c == Double.class)
                return scanner.nextDouble();
            if (c == float.class || c == Float.class)
                return scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Not valid");
            return GetInput(c);
        }

        return null;
    }
}
