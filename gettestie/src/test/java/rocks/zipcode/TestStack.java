package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

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
        
    }
}

