import java.util.Scanner;
//���������� ������ ����ϴ� ���α׷�
public class Hw06 {

	public static void main(String[] args) {
		
		String chul;
		String yong;
	
		
		System.out.println("���������� �����Դϴ�, ����, ���� , �� �߿��� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ö�� >> ");
		chul = scanner.next();
		System.out.print("���� >> ");
		yong = scanner.next();
		
		if(chul == yong)
		System.out.print("���"); //�����
		
		if(chul.equals("����")){
		if(yong.equals("����"))
		System.out.print("���� �̰���ϴ�."); //���� �̱���
		}
		
		if(chul.equals("����")) {
		if(yong.equals("��")) 
		System.out.print("ö���� �̰���ϴ�."); //ö���� �̱���
		}
		
		if(chul.equals("����")){
		if(yong.equals("��"))
		System.out.print("���� �̰���ϴ�."); //���� �̱���
			}
		
		if(chul.equals("����")){
		if(yong.equals("����"))
		System.out.print("ö���� �̰���ϴ�."); //ö���� �̱���
			}
		
		if(chul.equals("��")){
		if(yong.equals("����"))
		System.out.print("ö���� �̰���ϴ�."); //ö���� �̱���
			}
	
		if(chul.equals("��")){
		if(yong.equals("����"))
		System.out.print("���� �̰���ϴ�."); //���� �̱���
			}
	}
}
		