import java.util.LinkedList;
import java.util.Queue;

public class practice {
    public static void main(String[] args) {
       Queue <String> q = new LinkedList<String>();
         q.add("a");
            q.add("b");
            q.add("c");
            q.add("d");
            q.add("e");

   
   

        System.out.println(q.poll());
        //q.peek to see the first value in the queue
        System.err.println(q.peek());
        //q.contains to check if a value is in the queue
        System.out.println(q.contains("a"));
        //q.remove to remove a value from the queue
        System.err.println(q.remove('d'));

        //q.size to get the size of the queue
        System.out.println(q.size());

        //q.clear to clear the queue
        System.err.println(q.clear());
        //q.isEmpty to check if the queue is empty
        System.out.println(q.isEmpty());
        //q.toArray to convert the queue to an array
        System.err.println(q.toArray()[1]);
        //q.iterator to iterate through the queue
        System.out.println(q.iterator());
        //q.offer to add a value to the queue
        System.err.println(q.offer("f"));//This will add f to the queue

    }
}
