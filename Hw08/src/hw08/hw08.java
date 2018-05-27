package hw08;

class Complex{
   double real;
   double imag;
   
   Complex add(Complex num) {
      Complex cp = new Complex();
      cp.real= real+ num.real;
      cp.imag=imag+num.imag;
      return cp;
   }
   Complex minus(Complex num) {
      Complex cp = new Complex();
      cp.real= real-num.real;
      cp.imag= imag-num.imag;
      return cp;
   }
   Complex multiply(Complex num) {
      Complex cp = new Complex();
      cp.real= real*num.real+(-imag*num.imag);
      cp.imag= real*num.imag+num.real*imag;
      return cp;
   }
   Complex divide(Complex num) {
      double x = num.real*num.real+num.imag*num.imag;
      Complex cp = new Complex();
      Complex cp1 = new Complex();//num의 복소수 부분 부호 반대
      cp1.real = num.real;
      cp1.imag = -num.imag;
      Complex cp2 = new Complex();
      cp2.real = real/x;
      cp2.imag = imag/x;
      
      cp = cp2.multiply(cp1);
      
      return cp;
   }
   
   
   void printComplex() {
      if(imag<0) {
      System.out.println(real+""+imag+"i");
      }
      else 
         System.out.println(real+"+"+imag+"i");
   }
   
}





public class hw08 {

   public static void main(String[] args) {
      System.out.println();
      Complex num1 = new Complex();
      num1.real = 1.0;
      num1.imag = 1.0;
      System.out.print("num1: ");
      num1.printComplex();
      
      
      Complex num2 = new Complex();
      num2.real = 2.5;
      num2.imag = -2.0;
      System.out.print("num2: ");
      num2.printComplex();
      
      System.out.print("num1 + num2= ");
      Complex num3 = num1.add(num2);
      num3.printComplex();
      
      System.out.print("num1 - num2= ");
      Complex num4 = num1.minus(num2);
      num4.printComplex();
      
      System.out.print("num1 * num2= ");
      Complex num5 = num1.multiply(num2);
      num5.printComplex();
      
      System.out.print("num2 / num1= ");
      Complex num6 = num2.divide(num1);
      num6.printComplex();
   }

}