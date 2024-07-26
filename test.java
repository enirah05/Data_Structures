import java.util.Scanner;
import java.lang.Math;
class Nodes{
int data;
Nodes next;
Nodes(int val){
data=val;
next=null;
}
}
class lst{
static Nodes head=null;
static Nodes tail=null;

public void Append(int val){
    Nodes newnode = new Nodes(val);
    if(head==null){
        head=newnode;
        tail=newnode;
    }
    Nodes temp = tail;
    temp.next=newnode;
    tail=newnode;
}
public static String Convert(Nodes temp){
    String res="";
    while(temp!=null){
        res=res+String.valueOf(temp.data);
        temp=temp.next;
    }
    return res;
}
public static int Decimal(String bin){
    int d=0;
    for(int i=bin.length()-1;i>=0;i--){
        int digit = Character.getNumericValue(bin.charAt(i));
        int power = bin.length()-1-i;
        int dval = digit * (int) Math.pow(2,power); 
        d+=dval;
    }
    return d;
}
}
public class test{
    public static void main(String[] args){
        lst list = new lst();
        Scanner sc = new Scanner(System.in);
        int data;
        while((data=sc.nextInt())!=-1){
            list.Append(data);
        }
        sc.close();
        String x=lst.Convert(lst.head);
        System.out.println(lst.Decimal(x));
    }
}