public class Main {

    public static void main(String[] args) {

        Element<Integer> element1 = new Element(1);
        Element<Integer> element2 = new Element(2);
        Element<Integer> element3 = new Element(3);
        Element<Integer> element4 = new Element(4);
        Element<Integer> element5 = new Element(5);

        element4.setNext(element5);
        element5.setPrevious(element4);

        element3.setNext(element4);
        element3.setPrevious(element2);

        element2.setNext(element3);
        element2.setPrevious(element1);

        element1.setNext(element2);

        // element1 <-> element2 <-> element3 <-> element4 <-> element5
        Element next = element1;
        while (next != null) {
            System.out.println((next.getPrevious() != null ? next.getPrevious().getData() : "null") + " <-> " + next.getData() + " <-> " + (next.getNext() != null ? next.getNext().getData() :
                    "null"));
            next = next.getNext();
        }

        //reverse
        Element c = element1;
        Element p = null;
        Element n;
        while(c != null){
            n = c.getNext();
            c.setNext(p);
            c.setPrevious(n);
            p = c;
            c = n;
        }
        c = p;
        while (c != null) {
            System.out.println((c.getPrevious() != null ? c.getPrevious().getData() : "null") + " <-> " + c.getData() + " <-> " + (c.getNext() != null ? c.getNext().getData() :
                    "null"));
            c = c.getNext();
        }
    }
}
