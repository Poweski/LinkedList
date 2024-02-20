public class OneWayLinkedList<E> implements IList<E> {
    private class Node {
        private E value;
        private Node next;

        Node(E value) {
            this.value = value;
        }

        public E getValue() {
            return value;
        }
        public void setValue(E value) {
            this.value = value;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }

    Node sentinel;
    Node wantedNode = null;

    public OneWayLinkedList() {
        sentinel = new Node(null);
        sentinel.setNext(null);
    }

    public E getFromEnd(int n) throws IndexOutOfBoundsException {
        getIndex(sentinel, n);
        if (wantedNode == null) {
            throw new IndexOutOfBoundsException();
        }
        return wantedNode.getValue();
    }

    private int getIndex(Node node, int n) {
        if (node.getNext() == null) {
            if (n == 0) {
                wantedNode = node;
            }
            return 1;
        }
        else {
            int index = getIndex(node.getNext(), n);
            if (index == n) {
              wantedNode = node;
            }
            return index + 1;
        }
    }

    private Node getNode(int index) {
        if (index < -1) {
            return null;
        }
        Node elem = sentinel;
        while (elem != null && index >= 0) {
            index--;
            elem = elem.getNext();
        }
        return elem;
    }

    @Override
    public boolean isEmpty() {
        return sentinel.getNext() == null;
    }

    @Override
    public void clear() {
        sentinel.setNext(null);
    }

    @Override
    public int size() {
        Node elem = sentinel.getNext();
        int counter = 0;
        while (elem != null) {
            counter++;
            elem = elem.getNext();
        }
        return counter;
    }

    @Override
    public boolean add(E value) {
        Node newElem = new Node(value);
        Node elem = sentinel;
        while (elem.getNext() != null) {
            elem = elem.getNext();
        }
        elem.setNext(newElem);
        return true;
    }

    @Override
    public boolean add(int index, E value) {
        if (index < 0) {
            return false;
        }
        Node newElem = new Node(value);
        Node elem = getNode(index-1);
        if (elem == null) {
            return false;
        }
        newElem.setNext(elem.getNext());
        elem.setNext(newElem);
        return true;
    }

    @Override
    public int indexOf(E value) {
        Node elem = sentinel.getNext();
        int counter = 0;
        while (elem != null && !elem.getValue().equals(value)){
            counter++;
            elem = elem.getNext();
        }
        if (elem == null) {
            return -1;
        }
        return counter;
    }

    @Override
    public boolean contains(E value) {
        return indexOf(value) != -1;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        Node elem = getNode(index-1);
        if (elem == null || elem.getNext() == null) {
            throw new IndexOutOfBoundsException("The element with the given index does not exist.");
        }
        return elem.getNext().getValue();
    }

    @Override
    public E set(int index, E value) throws IndexOutOfBoundsException {
        Node elem = getNode(index-1);
        if (elem == null || elem.getNext() == null) {
            throw new IndexOutOfBoundsException("An index outside the acceptable range was specified.");
        }
        E prevValue = elem.getNext().getValue();
        elem.getNext().setValue(value);
        return prevValue;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        Node elem = getNode(index-1);
        if (elem == null || elem.getNext() == null) {
            throw new IndexOutOfBoundsException("The element with the given index does not exist.");
        }
        E prevValue = elem.getNext().getValue();
        elem.setNext(elem.getNext().getNext());
        return prevValue;
    }

    @Override
    public boolean remove(E value) {
        Node elem = sentinel;
        while (elem.getNext() != null && !elem.getNext().getValue().equals(value)) {
            elem = elem.getNext();
        }
        if (elem.getNext() == null) {
            return false;
        }
        elem.setNext(elem.getNext().getNext());
        return true;
    }
}