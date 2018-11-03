package hw7;

public class ArrayList<E> implements List<E> {
	   private static final int DEFAULT_CAPACITY = 10;
	   private Object[] elementData;
	   private int size = 0;
	   
	   public ArrayList() {
	      this.elementData = new Object[DEFAULT_CAPACITY];
	   }
	   public ArrayList(int size) {
	      this.elementData = new Object[size];
	   }
	   

	   @Override
	   public boolean add(int index, E element) {
	      if(size == this.elementData.length)
	         this.resize();      
	      if(index <= size) {
	         for(int i = size -1; i>= index;i--) {
	         elementData[i+1] = elementData[i];
	         }
	         elementData[index] = element;
	         size++;
	         return true;
	      }
	      return false;
	   }

	   @Override
	   public boolean addFirst(E element) {
	      // TODO Auto-generated method stub
	      return add(0, element);
	   }

	   @Override
	   public boolean addLast(E element) {
	      // TODO Auto-generated method stub
	      if(size == this.elementData.length)
	         this.resize();         
	      this.elementData[size++] = element;
	      return true;
	   }

	   @Override
	   public E remove(int index) {
	      // TODO Auto-generated method stub
	      if(this.isEmpty()){
	         return null;
	      }
	      Object obj = this.elementData[index];
	      for(int i = index + 1; i<=size - 1;i++) {
	         this.elementData[i-1] = this.elementData[i];
	      }
	      size--;
	      elementData[size] = null;
	      return (E)obj;
	   }

	   @Override
	   public E removeFirst() {
	      // TODO Auto-generated method stub
	      return this.remove(0);
	   }

	   @Override
	   public E removeLast() {
	      // TODO Auto-generated method stub
	      return this.remove(size-1);
	   }

	   @Override
	   public E set(int index, E element) {
	      // TODO Auto-generated method stub
	      Object obj2 = this.elementData[index];
	      this.elementData[index] = element;
	      return (E)obj2;
	   }

	   @Override
	   public E get(int index) {
	      // TODO Auto-generated method stub
	      return (E)this.elementData[index];
	   }

	   @Override
	   public int indexOf(E element) {
	      // TODO Auto-generated method stub
	      for(int i=0; i<size;i++) {
	         if(element.equals(elementData[i]))
	            return i;
	      }
	      return -1;
	   }

	   @Override
	   public int size() {
	      // TODO Auto-generated method stub
	      return this.size;
	   }

	   @Override
	   public boolean isEmpty() {
	      // TODO Auto-generated method stub
	      if(size == 0)
	         return true;
	      return false;
	   }
	   public String toString() {
	      StringBuilder str = new StringBuilder("["); 
	      for (int i = 0; i<size; i++) {
	         str.append(elementData[i]);
	         if(i<size -1 )
	            str.append(", ");
	      }
	      str.append("]");
	      return new String(str);
	      
	   }
	   private void resize() {
	      Object[] temp = new Object[elementData.length*2];
	      for(int i=0;i<elementData.length;i++)
	         temp[i] = elementData[i];
	      elementData = temp;   
	      
	   }

	}