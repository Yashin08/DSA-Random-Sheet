class Intersect
{
    
	int intersectPoint(Node head1, Node head2)
	{
        if(head1 == null || head2 == null){
            return -1;
        }
        Node temphead1 = head1;
        Node temphead2 = head2;
        
        while(temphead1 != temphead2){
            temphead1 = temphead1 == null ? head2 : temphead1.next;
            temphead2 = temphead2 == null ? head1 : temphead2.next;
        }
        
        if(temphead1 == null){
            return -1;
        }
        return temphead1.data;
	}
}
