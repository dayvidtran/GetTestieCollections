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
        //if we add more than 10 the capacity, from my understanding, increases in increments of 10 so expected would be 20
        Assert.assertEquals(expected, vec.capacity());
    }

    @Test
    public void testTreeMap(){
        TreeMap<String, Integer> tree = new TreeMap<>();
        tree.put("Milk", 2);
        boolean expected = false;

        Assert.assertEquals(expected, tree.isEmpty());
    }

    @Test
    public void testStack(){
        Stack<Integer> milk = new Stack<>();
        milk.add(1);
        milk.add(2);
        milk.add(3);
        milk.add(4);

        Integer actual = milk.peek();
        Integer expected = milk.elementAt(3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTreeSet(){
        TreeSet<Integer> exampleTree = new TreeSet<>();
        exampleTree.add(1);
        exampleTree.add(2);
        exampleTree.add(3);
        exampleTree.clear();

        boolean expected = true;
        assertEquals(expected, exampleTree.isEmpty());
    }

    @Test
    public void testIterator() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hiep");
        list.add("Nora");

        Assert.assertEquals("Hiep", list.iterator().next());
    }

    @Test
    public void testPriorityQueue(){
        PriorityQueue<String> priorQ = new PriorityQueue<>();
        priorQ.add("Jarek");
        priorQ.add("Truong");
        priorQ.add("Jake");
        priorQ.add("Zach");
        priorQ.poll();

        Assert.assertEquals(3, priorQ.size());

    }

    @Test
    public void testComparable(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        Integer expected = -1;
        Integer actual = arrayList.get(0).compareTo(arrayList.get(1));

        Assert.assertEquals(expected, actual);
    }
}

