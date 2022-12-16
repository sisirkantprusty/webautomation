import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestcase extends BaseTest {

    @Test
    public void firstTestcase() {
        System.out.println("Running first test case");
        Assert.assertTrue(true);
    }
    @Test
    public void secondTestcase() {
        System.out.println("Running first test case");
        Assert.assertTrue(true);
    }
    
}

