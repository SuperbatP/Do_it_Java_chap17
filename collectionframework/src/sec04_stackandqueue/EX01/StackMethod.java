package sec04_stackandqueue.EX01;

import java.util.Stack;

public class StackMethod {
public static void main(String[] args) {
	Stack<Integer> stack = new Stack<Integer>();
	//push
	stack.push(2);
	stack.push(5);
	stack.push(3);
	stack.push(7);
	//peek
	System.out.println(stack.peek());//보기만 하고 데이터 꺼내기 x
	System.out.println(stack.size());
	System.out.println();
	//search
	System.out.println(stack.search(7));
	System.out.println(stack.search(3));
	System.out.println(stack.search(5));
	System.out.println(stack.search(2));
	System.out.println(stack.search(9));//없으면 -1출력
	System.out.println();
	//pop
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println();
	//boolean empty
	System.out.println(stack.empty());
}
}
