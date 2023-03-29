package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }



    // Make a bigger test exercising more Stack methods.....

    @Test
    public void testArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        Integer addThing = 0;
        list.add(addThing);

        Assert.assertTrue(list.contains(addThing));
    }

    @Test
    public void testHashSet(){
        HashSet<String> set = new HashSet<>();
        String addThing ="jarek is cool";
        set.add(addThing);

        Assert.assertTrue(set.contains(addThing));
    }

    @Test
    public void testHashMap(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Jarek", 100);

        Assert.assertEquals(map.containsKey("Jarek"), map.containsValue(100));

    }

    @Test
    public void testLinkedList(){
        LinkedList<Integer> linked = new LinkedList<>();
        Integer addInt = 99;
        linked.add(addInt);

        Assert.assertTrue(linked.contains(addInt));
    }

    @Test
    public void testArrayDeque(){
        ArrayDeque<Integer> arrDeq = new ArrayDeque<>();
        arrDeq.add(1);
        arrDeq.add(2);
        arrDeq.add(3);
        Integer expected = 1;

        Assert.assertEquals(expected, arrDeq.getFirst());

    }

    @Test
    public void testVector(){
        Vector<Integer>  vec = new Vector<>();
        vec.add(1);
        vec.add(2);
        int expected = 10;
        //if we add more than 10 the capacity, from my understanding, increases in increments of 10
        Assert.assertEquals(expected, vec.capacity());
    }
}

