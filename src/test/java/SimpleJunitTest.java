package test.java;

import org.junit.*;

/**
 * ***********************************************************************
 * <p/>
 * <b>Authors:</b>
 * Antonel Pazargic (antonel.pazargic@1and1.ro) aka jtonic
 * <p/><b>Date:</b> 7/14/13
 * <p/><b>Time:</b> 10:10 PM
 * <p/>
 * ***********************************************************************
 */
public class SimpleJunitTest {

    @Test
    public void testSimpleEquality() {
        Assert.assertEquals("a", "a");
    }

}
