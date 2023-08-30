import java.util.LinkedList;
import java.util.Queue;

public class QueueTest01 {

	public static void main(String[] args) {
		Queue <Integer> queue = new LinkedList<>();
		queue.add(100); //enqueue
		queue.offer(200);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.remove()); //dequeue
		queue.clear(); //초기화
	}

}
