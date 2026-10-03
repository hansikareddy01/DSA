package han;
class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
		this.next=null;
	}
}


public class delkth {
	 static Node delkelem(Node h,int k) {
		if(h==null)return h;
		if(k==1) {
			h=h.next;
			return h;
		}
		int cnt=0;
		Node temp=h;
		Node prev=null;
		while(temp!=null) {
			cnt++;
			if(cnt==k) {
				prev.next=prev.next.next;
			}
			prev=temp;
			temp=temp.next;
		}
		return h;
	}
	 static Node delelem(Node h,int el) {
			if(h==null)return h;
			if(h.data==el) {
				h=h.next;
				return h;
			}
			
			Node temp=h;
			Node prev=null;
			while(temp!=null) {
				
				if(temp.data==el) {
					prev.next=prev.next.next;
				}
				prev=temp;
				temp=temp.next;
			}
			return h;
		}
	static void printll(Node h){
		 Node temp=h;
		 while(temp!=null) {
			 System.out.print(temp.data);
			 temp=temp.next;
		 }
	 }

	public static void main(String[] args) {
		Node h1=new Node(5);
		Node h2=new Node(7);
		h1.next=h2;
		Node h3=new Node(8);
		h2.next=h3;
		Node h4=new Node(9);
		h3.next=h4;
		
printll(h1);
Node h5=delelem(h1,7);
printll(h5);
	}

}
