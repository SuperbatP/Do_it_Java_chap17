package sec04_stackandqueue.EX02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {//먼저 들어간게 먼저 나옴-stack와 반대
public static void main(String[] args) {
	//예외 처리 기능 미포함 메서드
	Queue<Integer> queue1 = new LinkedList<Integer>();
//	System.out.println(queue1.element());//NoSuchElementException
	//add
	queue1.add(3);
	queue1.add(4);
	queue1.add(5);
	System.out.println(queue1.element());
	//remove
	System.out.println(queue1.remove());
	System.out.println(queue1.remove());
	System.out.println(queue1.remove());
//	System.out.println(queue1.remove());//NoSuchElementException
	System.out.println();
	
	//예외 처리 기능 포함 메서드
	Queue<Integer> queue2 = new LinkedList<Integer>();
	System.out.println(queue1.peek());
	//offer
	queue2.offer(3);
	queue2.offer(4);
	queue2.offer(5);
	//peek
	System.out.println(queue2.peek());
	//poll
	System.out.println(queue2.poll());
	System.out.println(queue2.poll());
	System.out.println(queue2.poll());
	System.out.println(queue2.poll());

}
}
