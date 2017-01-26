package mine.pqueue;

public class Store {
	String name;
	Integer value;
	
	public Store(String n, Integer v) {
		name = new String(n);
		value = v;
	}
	
	public String toString(){
		return Integer.toString(value);
	}

}
