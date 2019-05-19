import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{

    @Test 
    public void hero_instantiatesRightly_true() {
        Hero hero = new Hero("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals(true, hero instanceof Hero);
    }

    @Test 
    public void hero_instantiatesWithName_String() {
        Hero hero = new Hero("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals("Your Name", hero.getName());
    }

    @Test 
    public void hero_instantiatesWithSize_Integer() {
        Hero hero = new Hero("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals("Size Of It", hero.getSize());
    }

    @Test 
    public void hero_instantiatesWithLPersonal_String() {
        Hero hero = new Hero("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals("Your Hero", hero.getPersonal());
    }

    @Test 
    public void hero_instantiatesWithGroup_String() {
        Hero hero = new Hero("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals( "The Squad", hero.getGroup());
    }
}
