import java.util.*;
class node 
{
    int data;
    int data1;
    node next;
    node(int data,int data1)
    {
        this.data=data;
        this.data1=data1;
    }
}
public class Main
{
    node head;
    public void insert(int k,int j)
    {
        node n=new node(k,j);
        if(head==null)
        {
            head=n;
        }
        else{
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void insert1(int s,int t)
    {
        node n1=new node(s,t);
        if(head==null)
        {
            head=n1;
        }
        else{
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n1;
        }
    }
    
            
           
    
    
    public void print()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"x pow"+temp.data1);
            temp=temp.next;
        }
        //System.out.println(temp.data);
    }
    public static void main(String args[])
    {
        Main obj=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            int k=sc.nextInt();
            int s=sc.nextInt();
            int t=sc.nextInt();
            obj.insert(p,k);
            obj.insert1(s,t);
        }
        obj.print();
    }
}