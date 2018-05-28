package HW_09;
//circle이라는 이름이 붙여진 클래스 설계 프로그램
class circle {
   private double radius;
   private double x;
   private double y;
   private double area; //모든 필드 private 선언

   public double area() {
      area = radius * radius * Math.PI;
      return area;
   }

   public void setradius(double r) {

      if (r < 0) {
         r = 0.0;
         radius = r;
      } else {
         radius = r;
      }
   }

   public double getradius() {
      return radius;

   }

   public void setx(double xx) {
      x = xx;

   }

   public double getx() {
      return x;
   }

   public void sety(double yy) {
      y = yy;

   }

   public double gety() {
      return y;
   }

}

public class second {

   public static void main(String[] args) {
//임의의 circle  객체 생성
      circle c1 = new circle();
//각 필드값 지정
      c1.setradius(3.6);
      c1.setx(0.0);
      c1.sety(1.5);

      System.out.println("반지름: " + c1.getradius());
      System.out.println("중심 좌표 : " + "(" + c1.getx() + "," + c1.gety() + ")");
      System.out.printf("넓이: %.2f\n", c1.area());

      circle c2 = new circle();

      c2.setradius(-5.0);
      c2.setx(1.0);
      c2.sety(2.2);

      System.out.println("반지름: " + c2.getradius());
      System.out.println("중심 좌표 : " + "(" + c2.getx() + "," + c2.gety() + ")");
      System.out.printf("넓이: %.2f\n", c2.area());

   }

}