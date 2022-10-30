import java.util.*;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the First number:");
     int a = sc.nextInt();
     System.out.println("Enter the Second number:");
     int b = sc.nextInt();
     System.out.println("Enter your Choice: 1-> Addition, 2-> Subtraction, 3-> Multipication, 4-> Division, 5-> Remainder:");
     int ch = sc.nextInt();
     switch(ch) {
        case 1 : System.out.println("Addition: " + a + b);
        break;
        case 2 : System.out.println("Subtraction: "); 
        if (ch == 2) {
          int ans = a - b;
            System.out.println(ans);
        }
        break;
        case 3 : System.out.println("Multiplication: " + a * b);
        break;
        case 4 : System.out.println("Division: " + a / b);
        break;
       case 5 : System.out.println("Remainder: " + a % b);
       break; 
       default : System.out.println(" Invalid Choice");
     }
       
    }
}