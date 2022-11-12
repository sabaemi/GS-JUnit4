import test1.Utils;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
public class UtilsTest {
    @Test
    public void testIsValidEmailAddress() {
        Utils utils = new Utils();
        assertEquals(false,utils.isValidEmailAddress("s@."));
    }
    @Test
    public void testIsValidEmailAddress1() {
        Utils utils = new Utils();
        assertEquals(false,utils.isValidEmailAddress("1@."));
    }
    @Test
    public void testIsValidEmailAddress2() {
        Utils utils = new Utils();
        assertEquals(false,utils.isValidEmailAddress("s@.."));
    }
    @Test
    public void testIsValidEmailAddress3() {
        Utils utils = new Utils();
        assertEquals(false,utils.isValidEmailAddress("@."));
    }
    @Test
    public void testIsValidEmailAddress4() {
        Utils utils = new Utils();
        assertEquals(false,utils.isValidEmailAddress("s1@."));
    }
    @Test
    public void testIsValidEmailAddress5() {
        Utils utils = new Utils();
        assertEquals(false,utils.isValidEmailAddress("s1.@v"));
    }
    @Test
    public void testIsValidEmailAddress6() {
        Utils utils = new Utils();
        assertEquals(false,utils.isValidEmailAddress("@.1"));
    }
    @Test (timeout = 50)
    public void testGetCount() {
        Utils utils = new Utils();
        assertEquals(1,utils.getCount("hi ","hi"));
        //assertEquals("1 KB",formatter.formatAsFileSize(1024*1024*1024*1024));
    }
    @Test (timeout = 50)
    public void testGetCount1() {
        Utils utils = new Utils();
        assertEquals(1,utils.getCount("",""));
    }
    @Test (timeout = 50)
    public void testGetCount2() {
        Utils utils = new Utils();
        assertEquals(0,utils.getCount("kk","K"));
    }
    @Test (timeout = 50)
    public void testGetCount3() {
        Utils utils = new Utils();
        assertEquals(3,utils.getCount("aaaa","aa"));
    }
    @Test
    public void testLongestCommonSubstring() {
        Utils utils = new Utils();
        utils.longestCommonSubstring("\n","\n");
    }
    @Test
    public void testLongestCommonSubstring1() {
        Utils utils = new Utils();
        assertEquals("jkjkj",utils.longestCommonSubstring("jkjkj","jkjkjk"));
    }
    @Test
    public void testLongestCommonSubstring2() {
        Utils utils = new Utils();
        assertEquals("jkjkjk",utils.longestCommonSubstring("jkjkjkk","jkjkjk"));
    }
    @Test
    public void testLongestCommonSubstring3() {
        Utils utils = new Utils();
        assertEquals("j",utils.longestCommonSubstring("j","jkjkjk"));
    }
    @Test
    public void testLongestCommonSubstring4() {
        Utils utils = new Utils();
        assertEquals("j",utils.longestCommonSubstring("jkjkjkk","j"));
    }
    @Test
    public void testLongestCommonSubstring5() {
        Utils utils = new Utils();
        assertEquals("",utils.longestCommonSubstring("5","11"));
    }
    @Test
    public void testLongestCommonSubstring6() {
        Utils utils = new Utils();
        assertEquals("",utils.longestCommonSubstring("ll",null));
    }
}
