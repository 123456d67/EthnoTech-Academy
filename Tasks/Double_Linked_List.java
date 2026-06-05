

/* Create a java program for social media feed navigation.Implement a free scrolling for next post,previous post,delete post,insert sponsor post.  */

class Node{
    String data;
    Node next,prev;
    public Node(String data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Double_Linked_List{
    Node head;
    public void insert(String data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
            new_node.prev=temp;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void delete(String data){
        Node temp=head;
        if(head==null){
            return;
        }
        while(temp!=null){
            if(temp.data.equals(data)){
                if(temp.prev!=null){
                    temp.prev.next=temp.next;
                }
                else{
                    head=temp.next;
                }
                if(temp.next!=null){
                    temp.next.prev=temp.prev;
                }
                return ;
            }
            temp=temp.next;
        }
    }
    public void insert_sponsor(String data){
        Node new_node=new Node(data);
        new_node.next=head;
        head.prev=new_node;
        head=new_node;
    }
    public static void main(String[] args) {
        Double_Linked_List dll=new Double_Linked_List();
        dll.insert("Dileep");
        dll.insert("Killer Post");
        dll.insert("Bharat post");
        dll.display();
        dll.delete("Dileep");
        dll.display();
        dll.insert_sponsor("Killer Post");
        dll.display();
    }
}