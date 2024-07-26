import java.util.Scanner;
class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data=val;
            left=null;
            right=null;
        }
    }
class Bst{
    Node root=null;
    public void Append(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }
        else{
            Node temp=root;
            while(true){
                if(data < temp.data)
                {
                    if(temp.left != null) temp = temp.left;
                    else
                    {
                        temp.left = newNode;
                        break;
                    }
                }
                else{
                
                    if(temp.right != null) temp = temp.right;
                    else
                    {
                        temp.right = newNode;
                        break;
                    }
                }
            }
        }
    }
    public void display(Node temp){
        if(temp!=null){
            display(temp.left);
            System.out.print(temp.data+" ");
            display(temp.right);
        }
    }
    public  Node  invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
public class TreeReversal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Bst obj=new Bst();
        int data;
        while ((data = sc.nextInt()) != -1) {
            obj.Append(data);
        }
        System.out.println("Inorder Traversal before reversing:");
        obj.display(obj.root);
        obj.invertTree(obj.root);
        System.out.println("\nInorder Traversal after reversing:");
        obj.display(obj.root);
    }
}