import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input username :");
        String username = scanner.nextLine();
        System.out.println("Is username valid : "+isValidUsername(username));

    }
    public static boolean isValidUsername(String username){
        String pattern = "[a-zA-Z0-9]{5,12}";
        return username != null && username.matches(pattern);
    }
}