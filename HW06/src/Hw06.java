import java.util.Scanner;
//가위바위보 게임을 출력하는 프로그램
public class Hw06 {

	public static void main(String[] args) {
		
		String chul;
		String yong;
	
		
		System.out.println("가위바위보 게임입니다, 가위, 바위 , 보 중에서 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("철수 >> ");
		chul = scanner.next();
		System.out.print("영희 >> ");
		yong = scanner.next();
		
		if(chul == yong)
		System.out.print("비김"); //비긴경우
		
		if(chul.equals("가위")){
		if(yong.equals("바위"))
		System.out.print("영희가 이겼습니다."); //영희가 이긴경우
		}
		
		if(chul.equals("가위")) {
		if(yong.equals("보")) 
		System.out.print("철수가 이겼습니다."); //철수가 이긴경우
		}
		
		if(chul.equals("바위")){
		if(yong.equals("보"))
		System.out.print("영희가 이겼습니다."); //영희가 이긴경우
			}
		
		if(chul.equals("바위")){
		if(yong.equals("가위"))
		System.out.print("철수가 이겼습니다."); //철수가 이긴경우
			}
		
		if(chul.equals("보")){
		if(yong.equals("바위"))
		System.out.print("철수가 이겼습니다."); //철수가 이긴경우
			}
	
		if(chul.equals("보")){
		if(yong.equals("가위"))
		System.out.print("영희가 이겼습니다."); //영희가 이긴경우
			}
	}
}
		