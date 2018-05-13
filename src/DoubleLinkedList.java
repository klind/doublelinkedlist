public class DoubleLinkedList {

    private Element newestElement;

    public DoubleLinkedList() {
    }

    public DoubleLinkedList(Integer i) {
        Element newElement = new Element(i);
        this.newestElement = newElement;
    }

    public boolean isEmpty() {
        return newestElement == null;
    }

    public void add(Integer i) {

        Element newElement = new Element(i);

        if (isEmpty()) {
            newestElement = newElement;
        } else {
            newestElement.setPrevious(newElement);
            newElement.setNext(newestElement);
            newestElement = newElement;
        }
    }

    public void remove(Integer i) {
        Element c = newestElement;
        Element p = newestElement;
        while (c != null) {
            if (c.getData().equals(i)) {
                if (c.equals(p)) {
                    newestElement = newestElement.getNext();
                } else {
                    p.setNext(c.getNext());
                    if (c.getNext()!=null) {
                        c.getNext().setPrevious(p);
                    }
                }
                return;
            }
            p = c;
            c = c.getNext();
        }
    }

    public void reverse() {
        Element c = newestElement;
        Element p = null;
        Element n;
        while (c != null) {
            n = c.getNext();
            c.setNext(p);
            c.setPrevious(n);
            p = c;
            c = n;
        }
        newestElement = p;
    }

    @Override
    public String toString() {

        if (newestElement != null) {
            StringBuilder stringBuilder = new StringBuilder();
            Element next = newestElement;
            while (next != null) {
                stringBuilder.append((next.getPrevious() != null ? next.getPrevious().getData() : "null") + " <-> " + next.getData() + " <-> " + (next.getNext() != null ? next.getNext()
                        .getData() :
                        "null")).append("\n");
                next = next.getNext();
            }
            return stringBuilder.toString();

        } else {
            return null;
        }

    }
}
