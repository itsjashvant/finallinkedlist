[5:13 pm, 21/03/2023] jashvant kumar Singh: import java.util.*;
class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}
public class Main
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
    public void search()
    {
        node temp=head;
        int c=1;
        int p=0;
        while(temp!=null)
        {
           if(c%2==1)
           {
               p++;
           }
           c++;
            temp=temp.next;
        }
        System.out.println(p);
    }
    public static void main(String args[])
    {
        Main obj=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            obj.insert(p);
        }
        obj.search();
    }
}
[5:13 pm, 21/03/2023] jashvant kumar Singh: import java.util.*;
class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}
public class Main
{
    node head;
    public void insert(int p)
    {
        
        node n=new node(p);
       n.next=head;
       head=n;
    }
    public void print()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        Main obj=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            obj.insert(k);
        }
        obj.print();
        
    }
}