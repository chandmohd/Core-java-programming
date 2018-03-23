package src.com.jspider.oece12.Collections;

public class ControllerForLinkList {
	public static void main(String[] args) {
		LinkedListImp link = new LinkedListImp();
		link.add(10);
		link.add(20);
		link.add(30);
		link.add(40);
		System.out.println(link);
		link.remove(30);
		System.out.println(link);
	}

}
