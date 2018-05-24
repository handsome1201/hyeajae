package dayPrint;
//������ ����ϴ� ���α׷�
import java.util.Scanner;

public class DayPrint {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
       
      System.out.println("���� ��� ���α׷��Դϴ�.");
      System.out.println("1900�� 3�� 1�� ���� 2100�� 1�� 31�� ���� �Է��Ͻ� �� �ֽ��ϴ�!");
      System.out.print("������ �Է��ϼ��� : ");      //��, ��, �� �Է¹���
      int year = sc.nextInt();
      System.out.print("���� �Է��ϼ��� : ");
      int month = sc.nextInt();
      System.out.print("���� �Է��ϼ��� : ");
      int date = sc.nextInt();
      
      boolean isLeapYear = (year%4==0 && year%100!=0) || year%400==0 ? true : false;
          // ���� ���� ����, ��, ��¥�� ���� ����ó��      
          if (year<1||month<1||month>12||date<1||
           (month==1&&date>31)||(month==2 && isLeapYear==true && date>29) || (month==2 && isLeapYear==false && date>28)||
            (month==3&&date>31)||(month==4&&date>30)||
           (month==5&&date>31)||(month==6&&date>30)||
            (month==7&&date>31)||(month==8&&date>31)||
           (month==9&&date>30)||(month==10&&date>31)||
             (month==11&&date>30)||(month==12&&date>31)) {
            System.out.print("�߸��� �Է��Դϴ�.");      
         }
        else if (year<1900||(year==1900&&month<3)||
           year>2100||(year==2100&&month>1)) {
             System.out.print("�� �˰������� ��갡���� ���� ���� ��¥�Դϴ�.");
        }

          // total_days ������ ������ ���⿡ ���� ��¥ �� ����.
          // ���⿡ ���� ������ ���ؼ� �ش� ������ ����� ���� �ֱ��� ������ �����־� �������� ����.  +) �ش� �˰����� ������ ������ ���� ��� �� ��� ��¥�� ���� ������ ���ϴ°��� ������.
          int total_days = (year-1900)*365 + (year-1896)/4 - (year-1800)/100 + (year-1600)/400;
          // 3�� ������ ���⿡ ���� ������ �����Ƿ� ������ �ؿ� 1,2������ �Ϸ縦 ����.
          if(month<=2 && isLeapYear==true)
             total_days--;

          // total_days ������ ���� ���� ��¥ �� ����.
          switch(month) {
          case 12:
             total_days+=30;
          case 11:
             total_days+=31;
          case 10:
             total_days+=30;
          case 9:
             total_days+=31;
          case 8:
             total_days+=31;
          case 7:
             total_days+=30;
          case 6:
             total_days+=31;
          case 5:
             total_days+=30;
          case 4:
             total_days+=31;
          case 3:
             total_days+=28;
          case 2:
             total_days+=31;
          }
       
          total_days+=date;      //total_days ������ �Ͽ� ���� ��¥ �� ����.

          // 1900�� 1�� 1���� ������ �̹Ƿ� �̸� �̿��Ͽ� �� ��¥��/7�� ������ �� �� ����.
          switch (total_days%7) {
          case 0:
             System.out.println("�Ͽ���");
             break;
          case 1:
             System.out.println("������");
             break;
          case 2:
             System.out.println("ȭ����");
             break;
          case 3:
             System.out.println("������");
             break;
          case 4:
             System.out.println("�����");
             break;
          case 5:
             System.out.println("�ݿ���");
             break;
          case 6:
             System.out.println("�����");
          }
   }
}