class Solution
{
    
    int getNthFromLast(Node head, int n)
    {
        Node temp =head;
        ArrayList<Integer> a = new ArrayList<>();
        while(temp!=null){
            a.add(temp.data);
            temp=temp.next;
        }
     int index = a.size() - n;
        
      
        if (index < 0 || index >= a.size()) {
            return -1; 
        }
        return a.get(index);
    }
}
