package hw7;

public class MainClass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(3);
		list.add(2, 30);
		System.out.println("List: " + list + "\n" + "size: " + list.size());
		list.addFirst(15);
		System.out.println(list.remove(0));
	}
}