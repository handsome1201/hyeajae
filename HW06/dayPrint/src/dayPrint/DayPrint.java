package dayPrint;
//요일을 출력하는 프로그램
import java.util.Scanner;

public class DayPrint {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
       
      System.out.println("요일 계산 프로그램입니다.");
      System.out.println("1900년 3월 1일 부터 2100년 1월 31일 까지 입력하실 수 있습니다!");
      System.out.print("연도를 입력하세요 : ");      //연, 월, 일 입력받음
      int year = sc.nextInt();
      System.out.print("월을 입력하세요 : ");
      int month = sc.nextInt();
      System.out.print("일을 입력하세요 : ");
      int date = sc.nextInt();
      
      boolean isLeapYear = (year%4==0 && year%100!=0) || year%400==0 ? true : false;
          // 범위 밖의 연도, 달, 날짜에 대한 예외처리      
          if (year<1||month<1||month>12||date<1||
           (month==1&&date>31)||(month==2 && isLeapYear==true && date>29) || (month==2 && isLeapYear==false && date>28)||
            (month==3&&date>31)||(month==4&&date>30)||
           (month==5&&date>31)||(month==6&&date>30)||
            (month==7&&date>31)||(month==8&&date>31)||
           (month==9&&date>30)||(month==10&&date>31)||
             (month==11&&date>30)||(month==12&&date>31)) {
            System.out.print("잘못된 입력입니다.");      
         }
        else if (year<1900||(year==1900&&month<3)||
           year>2100||(year==2100&&month>1)) {
             System.out.print("이 알고리즘으로 계산가능한 범위 밖의 날짜입니다.");
        }

          // total_days 변수에 연도와 윤년에 대한 날짜 수 더함.
          // 윤년에 대한 조정에 대해선 해당 조건이 적용된 가장 최근의 연도를 적어주어 논리오류를 피함.  +) 해당 알고리즘은 적절한 수정을 통해 기원 후 모든 날짜에 대한 요일을 구하는것이 가능함.
          int total_days = (year-1900)*365 + (year-1896)/4 - (year-1800)/100 + (year-1600)/400;
          // 3월 이전은 윤년에 대한 영향이 없으므로 윤년인 해에 1,2월에는 하루를 빼줌.
          if(month<=2 && isLeapYear==true)
             total_days--;

          // total_days 변수에 월에 대한 날짜 수 더함.
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
       
          total_days+=date;      //total_days 변수에 일에 대한 날짜 수 더함.

          // 1900년 1월 1일은 월요일 이므로 이를 이용하여 총 날짜수/7로 요일을 알 수 있음.
          switch (total_days%7) {
          case 0:
             System.out.println("일요일");
             break;
          case 1:
             System.out.println("월요일");
             break;
          case 2:
             System.out.println("화요일");
             break;
          case 3:
             System.out.println("수요일");
             break;
          case 4:
             System.out.println("목요일");
             break;
          case 5:
             System.out.println("금요일");
             break;
          case 6:
             System.out.println("토요일");
          }
   }
}