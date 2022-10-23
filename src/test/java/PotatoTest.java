import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoTest {

    @Test
    public void testCook1(){
        Potato p = new Potato();
        p.cook(190,35);
        assertEquals(p.toString(),"This is a baked potato.");
    }

    @Test
    public void testCook2(){
        Potato p = new Potato();
        p.cook(180,20);
        assertEquals(p.toString(),"This is a raw potato.");
    }

    @Test
    //edge case
    public void testCook3(){
        Potato p = new Potato();
        p.cook(250,30);
        assertEquals(p.toString(),"This is a raw potato.");
    }

    @Test
    public void testCook4(){
        Potato p = new Potato();
        p.cook(260,40);
        assertEquals(p.toString(),"This is a burnt potato.");
    }

    @Test
    public void testCook5(){
        Potato p = new Potato();
        p.cook(250,41);
        assertEquals(p.toString(),"This is a burnt potato.");
    }

    @Test
    public void testCook6(){
        Potato p = new Potato();
        p.cook(10,2);
        p.cook(10,2);
        assertEquals(p.toString(),"This is a raw potato.");
    }

    @Test
    public void testCook7(){
        Potato p = new Potato();
        p.cook(90,15);
        p.cook(110,25);
        assertEquals(p.toString(), "This is a raw potato. It went in the oven twice for some reason. Perhaps the chef is new.");
    }

    @Test
    public void testCook8(){
        Potato p = new Potato();
        p.cook(190,15);
        p.cook(60,26);
        assertEquals(p.toString(),"This is a raw potato.");
    }


}
