import java.util.Arrays;

public class Queue {
    //Default maximum queue size
    public static final int MAX_QUEUE_SIZE = 4;

    String[] array = new String[MAX_QUEUE_SIZE];
    int pointer = 0;
    boolean empty = true;
    boolean full = false;

    //Insert element at the bottom
    public Boolean queue(String newElement)
    {
        if (!full)
        {
            array[pointer] = newElement;
            pointer++;
            empty = false;
            if (pointer == MAX_QUEUE_SIZE)
                full = true;
            return true ;
        }
        else
            return false;
    }

    //Pop element from the top
    public String dequeue()
    {
        int i;
        String firstItem = null;
        if (!empty)
        {
            firstItem = array[0];
            array[0] = null;
            for (i = 0; i < size() - 1; i++) {
                array[i] = array[i + 1];
            }
            array[i] = null;
            pointer--;
            if (pointer != MAX_QUEUE_SIZE)
                full = false;
            if (pointer == 0)
                empty = true;
        }
        return firstItem;
    }
    //Remove all elements from queue
    public void clear()
    {
        Arrays.fill(array, null);
        pointer = 0;
        empty = true;
        full = false;
    }
    //Queue status operations

    //Is queue empty?
    public boolean isEmpty()
    {
        return empty;
    }
    //Is queue full?
    public boolean isFull()
    {
        return full;
    }
    //How many elements in queue?
    public int size()
    {
        return pointer;
    }
    //Capacity of queue
    public int getCapacity()
    {
        return MAX_QUEUE_SIZE;
    }
    //Outputs the elements in queue
    public void showElements()
    {
        if (!empty)
        {
            System.out.println("Elements of array:");
            for (String a : array)
            {
                if (a != null)
                    System.out.println(a);
            }
        }
        else
            System.out.println("Queue is empty");

    }
}
