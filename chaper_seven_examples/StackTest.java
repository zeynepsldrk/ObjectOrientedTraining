public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.showElements();

        System.out.println("Push:" + stack.push("0"));
        System.out.println("Push:" + stack.push("1"));
        System.out.println("Push:" + stack.push("2"));
        //System.out.println("Push:" + stack.push("4"));
        //System.out.println("Push:" + stack.push("5"));
        stack.showElements();
        System.out.println("Pop:" + stack.pop());
        stack.showElements();
        System.out.println("Size:" + stack.size());
        System.out.println("Is stack empty?" + stack.isEmpty());
        System.out.println("Is stack full?" + stack.isFull());
        stack.clear();
        System.out.println("Is stack empty?" + stack.isEmpty());
        System.out.println("Is stack full?" + stack.isFull());
        stack.showElements();

    }
}
