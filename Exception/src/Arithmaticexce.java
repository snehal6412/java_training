//class Arithmaticexce {
//	public static void main(String args[]) {
//		int num1 = 10;
//		int num2 = 0;
//		// divide both numbers and print the result
//		int result = num1 / num2;
//		System.out.println(result);
//	}
//}


class Arithmaticexce { 
public static void main(String args[]) 
    { 
        try { 
            //define two numbers 
            int num1 = 100, num2 = 0; 
            int result = num1 / num2; // divide by zero 
            //print the result
            System.out.println("Result = " + result); 
        } 
        catch (ArithmeticException e) { 
            System.out.println("ArithmeticException:Division by Zero"); 
        } 
    } 
}