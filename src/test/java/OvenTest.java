import org.junit.*;

import static org.junit.Assert.*;


public class OvenTest {




    @Test
    public void testCreateOven(){
        Oven oven = new Oven();
        int maxTemp1 = oven.getMaxTemperature();
        assertEquals(320,maxTemp1);
    }

    @Test
    public void testCreateOvenWithTemp(){
        Oven oven = new Oven(400);
        int maxTemp2 = oven.getMaxTemperature();
        assertEquals(400,maxTemp2);
    }

    @Test
    public void testOvenWithNegativeTemp(){
       assertThrows(IllegalArgumentException.class, () -> new Oven(-10));
    }

    @Test
    public void testInsertFood(){
        Oven oven = new Oven();
        Fries food = new Fries();
        try{
            oven.setTemperature(245);
            oven.insertFood(food,15);
            assertTrue(food.cooked);
        }catch(Exception e){
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testInsertFood2(){
        Oven oven = new Oven();
        Potato p = new Potato();
        try{
            oven.setTemperature(170);
            oven.insertFood(p,10);
            assertFalse(p.cooked);
        }catch(Exception e){
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testInsertFood3(){
        Oven oven = new Oven();
        Potato p = new Potato();
        try{
            oven.setTemperature(170);
            oven.insertFood(p,-10);
            assertFalse(p.cooked);
        }catch(Exception e){
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testInsertFood4(){
        Oven oven = new Oven();
        try{
            oven.setTemperature(170);
            oven.insertFood(null,10);
        }catch(Exception e){
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }



    @Test
    public void testSetTemperature1(){
        Oven oven = new Oven();
        oven.setTemperature(210);
        assertEquals(410, oven.getCurrentTemperature());

    }

    @Test
    public void testSetTemperature2(){
        Oven oven = new Oven(350);
        oven.setTemperature(350);
        assertEquals(662, oven.getCurrentTemperature());
    }

    @Test
    public void testSetTemperature3(){
        Oven oven = new Oven();
        assertThrows(IllegalArgumentException.class, () -> oven.setTemperature(-10));
    }





}
