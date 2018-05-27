package hw08;
//문자열의 자음과 모음의 개수를 출력하는 프로그램
import java.util.Scanner;

public class moja {

   public static void main(String[] args) {
      String input;
      int ja =0, mo=0;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("문자열 입력>>");
      input = sc.nextLine();
      input = input.toLowerCase();
      for(int i=0;i<input.length();i++) {  // 모음의 갯수 판별
         if(input.charAt(i) == 'a' ||input.charAt(i) == 'e' ||input.charAt(i) == 'i' ||input.charAt(i) == 'o' ||input.charAt(i) == 'u') {
            mo++;
         }
         else if((97 <=	input.charAt(i) && input.charAt(i) <= 122)) //자음의 갯수 판별
        	ja++;
      }
      System.out.println("자음의 갯수 : "+ja+"\n모음의 갯수 : "+ mo);
   }
}