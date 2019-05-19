import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{

    @Test 
    public void squad_instantiatesRightly_true() {
        Squad squad = new squad("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals(true, squad instanceof Squad);
    }

    @Test 
    public void squad_instantiatesWithName_String() {
        Squad squad = new squad("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals("Your Name", squad.getName());
    }

    @Test 
    public void squad_instantiatesWithSize_Integer() {
        Squad squad = new squad("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals("Size Of It", squad.getSize());
    }

    @Test 
    public void squad_instantiatesWithLPersonal_String() {
       Squad squad = new squad("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals("Your Hero", squad.getPersonal());
    }

    @Test 
    public void squad_instantiatesWithGroup_String() {
        Squad squad = new squad("Your Name", "Size Of It", "Your Hero", "The Squad");
        assertEquals( "The Squad", squad.getGroup());
    }
}
