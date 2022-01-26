public class BST{
    public static Node insert(Node head,int val){
        Node t=new Node(val);
        if(head==null){
            head=t;
        }
        else if(head.val<val){
            head.right=insert(head.right,val);
        }
        else{
            head.left=insert(head.left,val);
        }
        return head;
    }
    public static Node inS(Node temp){
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }
    public static Node delete(Node head,int val){
        if(head==null){
            return head;
        }
        else if(head.val<val){
            head.right=delete(head.right,val);
        }
        else if(head.val>val){
            head.left=delete(head.left,val);
        }
        else{
            if(head.right==null){
                Node t=head.left;
                return t;
            }
            else if(head.left==null){
                Node t=head.right;
                return t;
            }
            Node temp=inS(head.right);
            head.val=temp.val;
            head.right=delete(head.right,temp.val);
        }
        return head;
    }
    public static void display(Node head){
        if(head!=null){
            display(head.left);
            System.out.println(head.val);
            display(head.right);
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head, 50);
        head=insert(head, 30);
        head=insert(head, 20);
        head=insert(head, 40);
        head=insert(head, 70);
        head=insert(head, 60);
        head=insert(head, 80);
        head=delete(head, 70);
        display(head);
    }
}
class Node{
    Node left,right;
    int val;
    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}