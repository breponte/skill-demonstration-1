import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void test() {
        assertEquals(SkillDemo.passTest(), "fail");
    }
}
