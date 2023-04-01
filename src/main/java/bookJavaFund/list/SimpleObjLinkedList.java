package bookJavaFund.list;

public class SimpleObjLinkedList {
    static class Node{
        Object data;
        Node next;
        Node (Object d){
            data = d;
            next = null;
        }
        Node getNext(){
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }
        Object getData(){
            return data;
        }
    }
    public String toString(){
        String delim = ",";
        StringBuffer stringBuffer = new StringBuffer();
        if (head == null)
            return "LINKED LIST is empty";
        Node currentNode = head;
        while (currentNode != null){
            stringBuffer.append(currentNode.getData());
            currentNode = currentNode.getNext();
            if (currentNode != null)
                stringBuffer.append(delim);
        }
        return stringBuffer.toString();
    }
    public void add(Object element){
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }
    public Object get(int index){
        //Implement the logic returns the element at the specified position in this list
        if (head == null || index < 0)
            return null;
        if (index == 0){
            return head.getData();
        }
        Node currentNode = head.getNext();
        for (int pos = 0; pos < index; pos++){
            currentNode = currentNode.getNext();
            if (currentNode == null)
                return null;
        }
        return currentNode.getData();
    }
    public boolean remove(int index){
        if (index < 0)
            return false;
        if (index == 0){
            head = null;
            return true;
        }
        Node currentNode = head;
        for (int pos = 0; pos < index-1; pos++){
            if(currentNode.getNext() == null)
                return false;
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(currentNode.getNext().getNext());
        return true;
    }
    Node head;

    public static void main(String[] args) {
        SimpleObjLinkedList list = new SimpleObjLinkedList();
        list.add("INPUT-1");
        list.add("INPUT-2");
        list.add("INPUT-3");
        list.add("INPUT-4");
        list.add("INPUT-5");
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(3);
        System.out.println(list);
    }
}
