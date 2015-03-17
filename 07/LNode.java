public class LNode<T>{
	private T value;
	private LNode<T> next;

	public String name(){
	    return "Daniel.Kodsi";
	}

	public LNode(T val){
		setData(val);
	}
	
	public LNode(T val,LNode<T> node){
		setData(val);
		setNext(node);
	}

	public T getData(){
		return value;
	}
	
	public void setData(T x){
		value = x;
	}
	
	public LNode<T> getNext(){
		return next;
	}
	public void setNext(LNode<T> thing){
		next = thing;
	}
	public String toString(){
		return String.valueOf(value);
	}
}
