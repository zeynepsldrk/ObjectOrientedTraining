import java.util.Arrays;

public class Stack {
    //Default maximum stack size
    public static final int MAX_STACK_SIZE = 4;

    String[] array = new String[MAX_STACK_SIZE];
    int pointer = 0;
    boolean full = false;
    boolean empty = true;

    //Push element from the top
    public Boolean push(String newElement)
    {
        if(!full)
        {
            array[pointer] = newElement;
            pointer++;
            empty = false ;
            if(pointer == MAX_STACK_SIZE)
                full = true ;
            return true ;
        }
        return false ;
    }
    //Pop element from the top
    public String pop()
    {
        String lastItem = null ;
        if (!empty)
        {
            lastItem = array[pointer - 1];
            array[pointer - 1] = null;
            pointer-- ;
            if (pointer == 0)
                empty = true;
            if (pointer != MAX_STACK_SIZE)
                full = false;
        }
        return lastItem ;
    }
    //Remove all elements from stack
    public void clear()
    {
        Arrays.fill(array, null);
        pointer = 0 ;
        empty = true;
        full = false;
    }
    //Stack status operations

    //Is stack empty?
    public boolean isEmpty()
    {
        return empty ;
    }
    //Is stack full?
    public boolean isFull()
    {
        return full ;
    }
    //How many elements in stack?
    public int size()
    {
        return pointer;
    }
    //Capacity of stack
    public int getCapacity()
    {
        return MAX_STACK_SIZE ;
    }
    //Outputs the elements in stack
    public void showElements()
    {
        if (!empty)
        {
            System.out.println("Elements of stack:");
            for (String a : array)
                if (a != null)
                    System.out.println(a);
        }
        else
            System.out.println("Stack is empty");


    }
}
