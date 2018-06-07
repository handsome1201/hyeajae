package hw13;
import java.util.Arrays;

class Person implements Comparable{
   private String name;
   private double height;
 
   public Person(String name,double height) {
      this.name = name;
      this.height = height;
   }
   public String getName() {
      return this.name;
   }
   
   public double getHeight() {
      return this.height;
   }
   @Override
   public int compareTo(Object o) {
      Person other =(Person) o;
      if(this.height<other.height) return -1;
      else if(this.height>other.height) return 1;
      else return 0;
   }
   
   public static int getMaximum(Comparable[] array) {
      
      Arrays.sort(array);
      int index = array.length-1;
      return index;
   }
   public static String getTallest(Person[] people) {
      int index = getMaximum(people);
      
      return String.format("���� Ű�� ū ���: %s", people[index].name);
   }
   
   
   
}
public class ����13_2 {

   public static void main(String[] args) {
      Person[] array = new Person[10];
      
      array[0] = new Person("��α�", 170.0);
      array[1] = new Person("������", 156.3);
      array[2] = new Person("ȫ�α�", 193.2);
      array[3] = new Person("���μ�", 177.3);
      array[4] = new Person("������", 171.4);
      array[5] = new Person("���ֿ�", 172.3);
      array[6] = new Person("��ȣ��", 182.9);
      array[7] = new Person("�̼���", 176.1);
      array[8] = new Person("���ؿ�", 184.8);
      array[9] = new Person("���ϱ�", 188.3);
      
      System.out.println("�迭�� ����� �����");
      for(Person p : array)
         System.out.println(p.getName() +", Ű: " + p.getHeight());
      
      System.out.print("\n���� Ű�� ū ���: " + Person.getTallest(array));

   }

}