import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;


public class challenge1{
public static void main(String[] args) {
    Queue<String> post = new LinkedList<String>();
    post.add("a");
    post.add("b");
    post.add("c");
    post.add("a");

    boolean hasSimilarItems = hasSimilarItems(post);
    System.out.println(hasSimilarItems);
}

public static boolean hasSimilarItems(Queue<String> queue) {
    Set<String> set = new HashSet<String>();
    for (String item : queue) {
        if (set.contains(item)) {
            return true;
        }
        set.add(item);
    }
    return false;
}

}
