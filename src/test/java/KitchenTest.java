import org.junit.*;

import static org.junit.Assert.*;


public class KitchenTest {

    @Test
    public void testKitchen1(){
        Kitchen k = new Kitchen();
        assertEquals(k.cookFries(),"This is a plate of toasty french fries.");
    }

    @Test
    public void testKitchen2(){
        Kitchen k = new Kitchen();
        assertEquals(k.burnFries(),"This is a plate of blackened french fries.");
    }

    @Test
    public void testKitchen3(){
        Kitchen k = new Kitchen();
        assertEquals(k.cookPotato(),"This is a baked potato.");
    }

    @Test
    public void testKitchen4(){
        Kitchen k = new Kitchen();
        assertEquals(k.burnPotato(),"This is a burnt potato.");
    }

    @Test
    public void testKitchen5(){
        Kitchen k = new Kitchen();
        assertEquals(k.doubleCookFries(),"This is a plate of toasty french fries. They went in the oven twice - now they're double cooked chips and a hipster pub can overcharge you for them.");
    }

    @Test
    public void testKitchen6(){
        Kitchen k = new Kitchen();
        assertEquals(k.doubleCookPotato(),"This is a baked potato. It went in the oven twice for some reason. Perhaps the chef is new.");
    }










}
