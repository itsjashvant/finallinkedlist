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
            temp.next=n;
            n=head;
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
    public void prime()
    {
        node temp=head;
        int c=1;
        while(temp.next!=head)
        {
           int k=0;
            for(int i=1;i<c;i++)
            {
                if(c%i==0)
                {
                    k++;
                }
            }
            if(k==1)
            {
                temp.next=temp.next.next;
            }
            c++;
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
            int p=sc.nextInt();
            
            obj.insert(p);
           
        
        }
        obj.prime();
        obj.print();
    }
}