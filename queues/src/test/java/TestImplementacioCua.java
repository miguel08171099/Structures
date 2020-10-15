import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class TestImplementacioCua {
    Cua<String> c;

    @Before
    public void setUp() throws Exception{
        this.c = new ImplementacioCua<String>(4);
        this.c.push("1");
        this.c.push("2");
    }
    @Test
    public void testPush1() throws Exception{
        Assert.assertEquals(2, this.c.size());
        this.c.push("3");
        Assert.assertEquals(3, this.c.size());
    }

    @Test
    public void testPush2() throws Exception{
        Assert.assertEquals(2, this.c.size());
        this.c.push("3");
        this.c.push("4");
        Assert.assertEquals(4, this.c.size());
    }
    @Test(expected = ExcepcioCuaCompleta.class)
    public void testPushFull() throws Exception{
        Assert.assertEquals(2, this.c.size());
        this.c.push("3");
        this.c.push("4");
        this.c.push("5");
        Assert.assertEquals(4, this.c.size());
    }
    @Test
    public void testPop1() throws Exception{
        Assert.assertEquals(2, this.c.size());
        String un = this.c.pop();
        Assert.assertEquals(1, this.c.size());
        Assert.assertEquals("1", un);

        String dos = this.c.pop();
        Assert.assertEquals(1, this.c.size());
        Assert.assertEquals("2", dos);

    }
    @Test(expected = ExcepcioCuaBuida.class)
    public void testPopEmpty() throws Exception{
        Assert.assertEquals(2, this.c.size());
        String un = this.c.pop();
        Assert.assertEquals(1, this.c.size());
        Assert.assertEquals("1", un);

        String dos = this.c.pop();
        Assert.assertEquals(1, this.c.size());
        Assert.assertEquals("2", dos);

        String tres = this.c.pop();
    }
}
