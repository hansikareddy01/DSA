package han;
class Node{
	int data;
	Node next;
	Node1(int d,Node next){
		this.data=d;
		this.next=null;
	}
}

public class insert {
	static Node inserthead(Node h,int val) {
		if(h==null) {
			h=new Node(val,null);
			return h;
		}
		Node temp=new Node(val,h);
		return temp;
		
	}
	static void printll(Node h){
		 Node temp=h;
		 while(temp!=null) {
			 System.out.print(temp.data);
			 temp=temp.next;
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node h1=new Node(5,null);
		Node h2=new Node(7,null);
		h1.next=h2;
		Node h3=new Node(8,null);
		h2.next=h3;
		Node h4=new Node(9,null);
		h3.next=h4;
		Node h5=inserthead(h1,9);
		printll(h5);
		
	}

}
