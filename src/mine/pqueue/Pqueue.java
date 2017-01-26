package mine.pqueue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Pqueue {
	void check(){
		
		Comparator<Store> distComp = new Comparator<Store>() {

			@Override
			public int compare(Store o1, Store o2) {
				if (o1.value < o2.value)
					return -1;
				if (o1.value > o2.value)
					return 1;
				return 0;
			}
		};
		PriorityQueue<Store> queue = new PriorityQueue<>(distComp);
		queue.add(new Store("this", 4));
		queue.add(new Store("qui", 7));
		queue.add(new Store("wer", 2));
		System.out.println(queue);
		Store gg = new Store("test", 1);
		queue.add(gg);
		System.out.println(queue);
		gg.value = 10;
		queue.remove(gg);
		queue.add(gg);
		System.out.println(queue);
	}
	public static void main(String[] args) {
		Pqueue mine = new Pqueue();
		mine.check();
	}

}
