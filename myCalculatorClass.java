public class myCalculatorClass { 
  
  public myCalculatorClass() {

}

  public int add(int a, int b) {
    return a + b;
}

  public int subtract(int a, int b) {
    return a - b;
}  
  
  public int multiply(int a, int b) {
    return a * b;
}  
  
  public double divide(double c, double d) {
    
    if (d == 0) {
      System.out.println("Error, durch Null teilen geht nicht!");
      return 0;
      
    } 
    else { 
    return c / d;}
       
}  
  
  public int modulo(int a, int b) {
    
    if (b == 0) {
      System.out.println("Error, durch Null teilen geht nicht!");
      return 0;
      
    } 
    else { 
    return a % b;}
       
}     
  public static void main(String[] args){ 
    
    myCalculatorClass myCalculator = new myCalculatorClass();
    System.out.println("Added: " + myCalculator.add(5, 7));  
    System.out.println("Subtracted: " + myCalculator.subtract(5, 7)); 
    System.out.println("Multiplied: " + myCalculator.multiply(5, 7));   
    System.out.println("Divided: " + myCalculator.divide(5, 7)); 
    System.out.println("Modulo: " + myCalculator.modulo(5, 7));     
    } 
}