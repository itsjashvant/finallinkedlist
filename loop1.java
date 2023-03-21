import java.io.*;
import java.util.*;

class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}
public class main
{
    node head;
    public void insert(int p)
    {
        node n=new node(p);
        if(head==null)
        {
            head=n;
        }
        else
        {
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void print()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        main obj=new main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            obj.insert(p);
        }
        obj.print();
    }
}