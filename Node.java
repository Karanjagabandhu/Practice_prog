public class Node{
    Node next;
    Object ele;
    Node(Object ele,Node next)
    {
        this.ele=ele;
        this.next=next;
    }
    Node(Object ele)
    {
        this.ele=ele;
    }
}