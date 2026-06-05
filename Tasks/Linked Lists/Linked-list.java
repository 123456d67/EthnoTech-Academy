import java.util.LinkedList;
class Linked_list{
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("i am");
        list.add("Dileep");
        list.add("Kumar");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add(1,"Reddy");
        System.out.println(list);
        list.set(2,"143");
        System.out.println(list);
    }

} 
class Node{
    int  data;
    Node next;
    public Node(int new_data){
        this.data=new_data;
        this.next=null;
    }
}
class Linkedlist{
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.next=n3;
        System.out.print(n1.data+" ");
        System.out.print(n2.data+" ");
        System.out.print(n3.data+" ");
    }
}
