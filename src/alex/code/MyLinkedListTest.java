package alex.code;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.addFirst("Hoang Nam");
        linkedList.addFirst("Nguyen Phuong");
        linkedList.addFirst("Oanh Nguyen");
        linkedList.addLast("Hue Nguyen");
        linkedList.addLast("Hang Nguyen");
        linkedList.add(3, "Alex Woo");

        linkedList.print();
    }
}
