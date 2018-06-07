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

public class 과제13_1 {

   public static void main(String[] args) {
      Book[] books = new Book[6];
      
      books[0] = new Novel("칼의 노래", "김훈");
      books[1] = new Novel("칼의 노래", "김훈");
      books[2] = new Poet("이상한 가역반응", "이상");
      books[3] = new Poet("하늘과 바람과 별과 시", "윤동주");
      books[4] = new ScienceFiction("유년기의 끝", "아서 C.클라크");
      books[5] = new ScienceFiction("스페이스 오디세이","아서 C.클라크");
      
      System.out.println("책들의 목록\n");
      
      for(int i = 0; i < books.length; i++) {
         System.out.println("관리번호  "+ books[i].getNumber()+"번, " + books[i]
               + ", 일주일 연체시 연체료: " + books[i].getLateFee(7) + "원");
      }
      System.out.println("\n관리번호  1번 책과 2번 책은 같은 책인가?: " + books[0].equals(books[1]));

   }

}