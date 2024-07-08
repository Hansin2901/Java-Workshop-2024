public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        
        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        
        // Logical Operators
        System.out.println("a > b && b > 0: " + (a > b && b > 0));
        System.out.println("a < b || b > 0: " + (a < b || b > 0));
        
        // Assignment Operators
        a += 5; // a = a + 5
        System.out.println("a after += 5: " + a);
    }
}
