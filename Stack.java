import java.util.Scanner;

public class Stack{
	int[] stackArr;
	int top;
	Stack(int capacity){
		this.stackArr = new int[capacity];
		this.top = -1;
	}

	public void push(int data) {
		this.stackArr[++this.top] = data;
	}

	public void pop() {
		if(!isEmpty()) { this.top--;} 
	}

	private boolean isEmpty() {
		return this.top == -1;
	}

	public String peek() {
		return isEmpty() ? "EMPTY" : "" + this.stackArr[this.top];
	}

	public void incrementBottomEl(int e,int k) {
		if(!isEmpty()) {
			for(int i = 0; i < e;++i) {
				this.stackArr[i] = this.stackArr[i] + k;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack stck = new Stack(n);
		while(n-- > 0) {
			String op = sc.next();
			if(op.equals("push")) {
				int data = sc.nextInt();
				stck.push(data);
			}else if(op.equals("pop")) {
				stck.pop();
			}else if(op.equals("inc")){
				int e = sc.nextInt();
				int k = sc.nextInt();
				stck.incrementBottomEl(e, k);
			}
			System.out.println(stck.peek());		
		}
	}
}
