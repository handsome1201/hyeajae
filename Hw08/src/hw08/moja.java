package hw08;
//���ڿ��� ������ ������ ������ ����ϴ� ���α׷�
import java.util.Scanner;

public class moja {

   public static void main(String[] args) {
      String input;
      int ja =0, mo=0;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("���ڿ� �Է�>>");
      input = sc.nextLine();
      input = input.toLowerCase();
      for(int i=0;i<input.length();i++) {  // ������ ���� �Ǻ�
         if(input.charAt(i) == 'a' ||input.charAt(i) == 'e' ||input.charAt(i) == 'i' ||input.charAt(i) == 'o' ||input.charAt(i) == 'u') {
            mo++;
         }
         else if((97 <=	input.charAt(i) && input.charAt(i) <= 122)) //������ ���� �Ǻ�
        	ja++;
      }
      System.out.println("������ ���� : "+ja+"\n������ ���� : "+ mo);
   }
}