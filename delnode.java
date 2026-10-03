package han;
class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
		this.next=null;
	}
}

public class delnode {
	static Node delhead(Node h) {
		if(h==null) {
			return null;
		}
		h=h.next;
		return h;
	}
static Node deltail(Node t) {
	if(t==null) {
		return null;
	}
	Node temp=t;
	while(temp.next.next!=null) {
		temp=temp.next;
	}
	temp.next=null;
	return t;
}
 static void printll(Node h){
	Node temp=h;
	 while(temp!=null) {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node h1=new Node(5);
Node h2=new Node(7);
h1.next=h2;
Node h3=new Node(8);
h2.next=h3;
printll(h1);
Node he=delhead(h1);
he=deltail(he);
printll(he);


	}

}
