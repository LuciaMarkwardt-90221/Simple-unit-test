import org.junit.Test;

import static org.junit.Assert.*;

public class FriesTest {
    @Test
    public void testCook1(){
        Fries f = new Fries();
        f.cook(230,10);
        assertEquals(f.toString(),"This is a plate of raw french fries.");
    }

    @Test
    public void testCook2(){
        Fries f = new Fries();
        f.cook(180,5);
        assertEquals(f.toString(),"This is a plate of raw french fries.");
    }

    @Test
    //edge case
    public void testCook3(){
        Fries f = new Fries();
        f.cook(300,10);
        System.out.println();
        assertEquals(f.toString(),"This is a plate of raw french fries.");
    }

    @Test
    public void testCook4(){
        Fries f = new Fries();
        f.cook(300,20);
        assertEquals(f.toString(),"This is a plate of toasty french fries.");
    }


    @Test
    public void testCook5(){
        Fries f = new Fries();
        f.cook(300,21);
        assertEquals(f.toString(),"This is a plate of blackened french fries.");
    }


    @Test
    public void testCook6(){
        Fries f = new Fries();
        f.cook(100,5);
        f.cook(140,6);
        assertEquals(f.toString(),"This is a plate of raw french fries. They went in the oven twice - now they're double cooked chips and a hipster pub can overcharge you for them.");
    }

    @Test
    public void testCook7(){
        Fries f = new Fries();
        f.cook(1,5);
        f.cook(14,16);
        assertEquals(f.toString(),"This is a plate of raw french fries. They went in the oven twice - now they're double cooked chips and a hipster pub can overcharge you for them.");
    }


    @Test
    public void testCook8(){
        Fries f = new Fries();
        f.cook(190,15);
        f.cook(240,11);
        assertEquals(f.toString(), "This is a plate of toasty french fries. They went in the oven twice - now they're double cooked chips and a hipster pub can overcharge you for them.");
    }

    @Test
    public void testCook9(){
        Fries f = new Fries();
        f.cook(150,15);
        f.cook(300,25);
        assertEquals(f.toString(),"This is a plate of blackened french fries.");
    }

    public void testCook10(){
        Fries f = new Fries();
        f.cook(200,5);
        f.cook(30,5);
        assertEquals(f.toString(),"This is a plate of raw french fries. ");
    }


}
