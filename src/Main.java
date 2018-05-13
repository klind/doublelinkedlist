public class Main {

    public static void main(String[] args) {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        doubleLinkedList.add(4);
        doubleLinkedList.add(5);

        // 5 <-> 4 <-> 3 <-> 2 <-> 1
        System.out.println(doubleLinkedList);

        doubleLinkedList.reverse();
        // 1 <-> 2 <-> 3 <-> 4 <-> 5
        System.out.println(doubleLinkedList);

        doubleLinkedList.remove(3);
        // 1 <-> 2 <-> 4 <-> 5
        System.out.println(doubleLinkedList);
    }
}
