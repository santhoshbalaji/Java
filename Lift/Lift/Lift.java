import java.util.TreeSet;

enum Direction{
    1,0,-1;
}

public class Lift{
    private int TOTAL_FLOORS;
    private Direction DIRECTION;
    private TreeSet<Integer> QUEUE;
    private int CURRENT_FLOOR;
}
