import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {

    private LinkedList<T> stack;
    public MyGenericStack(){
        stack=new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();

    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (this.size()==0){
            return true;
        }
        return false;
    }





















//    private LinkedList<T> stack;
//    public MyGenericStack(){
//        stack=new LinkedList<T>();
//    }
//    public void push( T element){
//        stack.push(element);
//    }
//    public int size(){
//        return this.size();
//    }
//    public boolean isEmpty(){
//        if (this.size()==0){
//            return false;
//        }
//        return  true;
//    }
//    public T pop(){
//        if (isEmpty()){
//            return null;
//        }
//        return stack.removeFirst();
//    }

}
