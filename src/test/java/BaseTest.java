import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp() {
        System.out.println("Set up");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tear down");
    }
}
