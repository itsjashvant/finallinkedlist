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
    public void search(int p)
    {
        node temp=head;
        int c=1;
        while(temp!=null)
        {
            if(temp.data==p)
            {
                c=0;
                break;
            }
            temp=temp.next;
            
           
        }
        if(c==0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
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
        int v=sc.nextInt();
        obj.search(v);
    }
}