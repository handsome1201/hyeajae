package hw13;
abstract class Book {
   private int number;
   private String title;
   private String author;

   static int noOfBooks = 0;

   public Book(String title, String author) {
      this.title = title;
      this.author = author;
      this.number = noOfBooks+1;
      noOfBooks++;
   }

   void settitle(String title) {
      this.title = title;
   }

   void setauthor(String author) {
      this.author = author;
   }

   String gettitle() {
      return this.title;
   }

   String getauthor() {
      return this.author;
   }

   int getNumber() {
      return this.number;
   }

   @Override
   public boolean equals(Object o) {
      Book other = (Book) o;
      if ((this.title == other.title) && (this.author == this.author)) {
         return true;
      } else
         return false;
   }
   
   abstract int getLateFee(int lateDays);
   public String toString() {
      return String.format("%s, %s",this.title,this.author);
   }
}

class Novel extends Book{
   public Novel(String title, String author) {
      super(title, author);
   }

   @Override
   int getLateFee(int lateDays) {
   return lateDays*300;
   }
}

class Poet extends Book{
   public Poet(String title,String author) {
      super(title,author);
   }
   @Override
   int getLateFee(int lateDays) {
   return lateDays*200;
   }
}

class ScienceFiction extends Book{
   
   public ScienceFiction(String title, String author) {
      super(title, author);
   }

   @Override
   int getLateFee(int lateDays) {
   return lateDays*600;
   }
}

public class ����13_1 {

   public static void main(String[] args) {
      Book[] books = new Book[6];
      
      books[0] = new Novel("Į�� �뷡", "����");
      books[1] = new Novel("Į�� �뷡", "����");
      books[2] = new Poet("�̻��� ��������", "�̻�");
      books[3] = new Poet("�ϴð� �ٶ��� ���� ��", "������");
      books[4] = new ScienceFiction("������� ��", "�Ƽ� C.Ŭ��ũ");
      books[5] = new ScienceFiction("�����̽� ������","�Ƽ� C.Ŭ��ũ");
      
      System.out.println("å���� ���\n");
      
      for(int i = 0; i < books.length; i++) {
         System.out.println("������ȣ  "+ books[i].getNumber()+"��, " + books[i]
               + ", ������ ��ü�� ��ü��: " + books[i].getLateFee(7) + "��");
      }
      System.out.println("\n������ȣ  1�� å�� 2�� å�� ���� å�ΰ�?: " + books[0].equals(books[1]));

   }

}