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
public class Main 
{
    node head;
    public void insert(int k)
    {
        node n=new node(k);
        if(head==null)
        {
            head=n;
            n.next=n;
        }
        else
        {
            node temp=head;
            n.next=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }
    public void print()
    {
        node temp=head;
        while(temp.next!=head)
        {
             System.out.println(temp.data);
        
            temp=temp.next;
        }
        
        System.out.println(temp.data);
        }
        public void delete(int pos)
        {
            if(head==null)
            {
                if(pos!=1)
                return;
            }
            else
            {
            int c=1;
            node temp=head;
            while(temp.next!=head)
            {
               if(c==pos-1)
               {
                   temp.next=temp.next.next;
               }
               c++;
               temp=temp.next;
            }
        }
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
        int pos=sc.nextInt();
        obj.delete(pos);
        obj.print();
    }
    
}