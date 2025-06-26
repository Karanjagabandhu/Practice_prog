

public class HashsetImp {
    Node []a=new Node[5];
    int count=0;
    public boolean add(Object ele)
    {
        int hc=Math.abs(ele.hashCode());
        int index=hc%a.length;
        if(a[index]==null)
        {
            a[index]=new Node(ele);
            count++;
            return true;
        }
         Node temp=null;
        Node curr=a[index];
       
        while(curr!=null)
        {
            if(ele.equals(curr.ele))
            {
                return false;
            }
            temp=curr;
            curr=curr.next;

        }
        temp=new Node(ele);
        count++;
        return true;
    }
    public boolean isEmpty()
    {
        return count==0;

    }
    public int size()
    {
        return count;

    }
    public void display()
    {
        for(int i=0;i<a.length;i++)
        {
            Node curr=a[i];
            while(curr!=null)
            {
                System.out.println(curr.ele);
                curr=curr.next;
            }
        }
    }
    public static void main(String[] args) {
        HashsetImp h=new HashsetImp();
        h.add("Jagabandhu");
         h.add("Jagabandhu");
          h.add("Jagabandhu");
           h.add("Balaram");
            h.add("Jagabandhu");
             h.add("Arjun");
              h.add("Jagabandhu");
               h.add("Raban");
               h.add("prajwal");
               h.add(123);
             System.out.println(h.size());
               h.display();



    }
    
}
