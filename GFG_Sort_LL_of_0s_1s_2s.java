class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        ArrayList<Integer>list=new ArrayList();
        Node demo=head;
        while(demo!=null){
            list.add(demo.data);
            demo=demo.next;
        }
        Collections.sort(list);  
        int i=0;
        demo=head;
        while(head!=null){
            head.data=list.get(i);
            i++;
            head=head.next;
        }
        return demo;
    }
}
