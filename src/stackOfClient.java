public class stackOfClient {
    public static  void stackOfString(){
        MyGenericStack<String> stack =new MyGenericStack<>();

        stack.push("so 1");
        stack.push("so 2");
        stack.push("so 3");
        stack.push("so 4");
        System.out.println("size cua stack truoc khi pop la :"+ stack.size());
        while (!stack.isEmpty()){
            stack.pop();
        }
        System.out.println("size cua stack sau khi pop la :"+ stack.size());

    }
    public static void stackOfInterger(){
        MyGenericStack<Integer> stack =new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("size cua stack truoc khi pop la :"+ stack.size());
        while (!stack.isEmpty()){
            stack.pop();
        }
        System.out.println("size cua stack sau khi pop la :"+ stack.size());

    }

    public static void main(String[] args) {
        System.out.println("stack 1 la ");
        stackOfString();
        System.out.println("----------------");
        System.out.println("stack 2 la ");
        stackOfInterger();
    }
}
