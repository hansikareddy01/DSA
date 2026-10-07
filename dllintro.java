package newage;
class Node{
	int data;
	Node next;
	Node back;
	Node(int data,Node next,Node back){
		this.data=data;
		this.next=next;
		this.back=back;
	}
	Node(int data){
		this.data=data;
		this.next=next;
		this.back=back;
	}
}

public class dllintro {
static Node convertarr2dll(int[] arr, int n) {
	Node head=new Node(arr[0]);
	Node prev=head;
	for(int i=1;i<n;i++) {
		Node temp=new Node(arr[i],null,prev);
		prev.next=temp;
		prev=temp;
	}
	return head;
}
static void printnode(Node h) {
	while(h!=null) {
		System.out.print(h.data+" ");
		h=h.next;
	}
	System.out.println(" ");
}
static Node delhead(Node h) {
	Node temp=h;
	temp=temp.next;
	h.next=null;
	return temp;
}
static Node deltail(Node h) {
	Node temp=h;
	while(temp.next!=null) {
		temp=temp.next;
	}
	Node prev=temp.back;
	temp.back=null;
    prev.next=null;
    return h;
}
static Node delatk(Node h,int k) {
	int cnt = 0;
	Node temp=h;
	while(temp!=null) {
		cnt++;
		if(cnt==k) {break;}
		temp=temp.next;
		}
	Node prev=temp.back;
	Node front=temp.next;
	if(front==null&&prev==null) {
		return null;
	}
	if(prev==null) {
		return delhead(h);
	}
	else if(front==null) {
		return deltail(h);
	}
	prev.next=front;
	front.back=prev;
	temp.back=null;
	temp.next=null;
	return h;
	
}
	public static void main(String[] args) {
	int[]	arr= {12,1,3,4,5,6,7};
	Node h=convertarr2dll(arr,7);
printnode(h);
Node h1=delhead(h);
printnode(h1);
Node h2=deltail(h1);
printnode(h2);
Node h3=delatk(h2,3);
printnode(h3);

	}

}
