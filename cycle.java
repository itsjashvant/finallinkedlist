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
    public void insert(int d)
    {
        node n=new node(d);
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
    public void delete()
    {
        int sum=0;
        node temp=head;
        while(temp!=null)
        {
            sum=sum+temp.data;
            temp=temp.next;
        }
        if(sum==0)
        {
            head=null;
        }
        else{
            System.out.println("Sum is not zero");
        }
        
    }
    public void middle()
    {   node slow =head;
        node fast=head;
        while(fast!=null && fast.next!=null)
        {
          fast=fast.next.next;
          slow=slow.next;
        }
        System.out.println(slow.data);
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
        obj.middle();
        //obj.print();
        
        
    }
}