package bookJavaFund.list;

public class SimpleIntLinkedList {


    public class Node {
        Integer data;
        Node next;

        Node(Integer d) {
            data = d;
            next = null;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node node) {
            next = node;
        }

        Object getData() {
            return data;
        }
    }

    //appends the specified element to the end of this list
    public void add(Integer element) {
        //create a new node
        Node newNode = new Node(element);
        //if head node is empty, create a new node and assign it to Head
        //increment index and retrun
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        //set the new node as next node of current
        currentNode.setNext(newNode);
    }

    public String toString() {
        String delim = ",";
        StringBuffer stringBuffer = new StringBuffer();
        if (head == null)
            return "LINKED LIST is empty";
        Node currentNode = head;
        while (currentNode != null) {
            stringBuffer.append(currentNode.getData());
            currentNode = currentNode.getNext();
            if (currentNode != null) {
                stringBuffer.append(delim);
            }

        }
        return stringBuffer.toString();


    }

    Node head;

    public static void main(String[] args) {
        SimpleIntLinkedList list = new SimpleIntLinkedList();
        list.add(13);
        list.add(39);
        list.add(41);
        list.add(93);
        list.add(98);
        System.out.println(list);
    }
}
