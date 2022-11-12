import test1.Formatter;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
public class FormatterTest {
    @Test
    public void testFormatAsFileSize() {
        Formatter formatter = new Formatter();
        assertEquals("1 B",formatter.formatAsFileSize(1));
    }
    @Test
    public void testFormatAsFileSize1() {
        Formatter formatter = new Formatter();
        assertEquals("1.0 KB",formatter.formatAsFileSize(1024));
    }
//    @Test
//    public void testFormatAsFileSize10() {
//        Formatter formatter = new Formatter();
//        assertEquals("2.0 KB",formatter.formatAsFileSize(2048));
//    }
    @Test
    public void testFormatAsFileSize11() {
        Formatter formatter = new Formatter();
        assertEquals("1.95 KB",formatter.formatAsFileSize(2000));
    }
    @Test
    public void testFormatAsFileSize2() {
        Formatter formatter = new Formatter();
        assertEquals("1.0 MB",formatter.formatAsFileSize(1024*1024));
    }
    @Test
    public void testFormatAsFileSize12() {
        Formatter formatter = new Formatter();
        assertEquals("1.99 MB",formatter.formatAsFileSize(2097150));
    }
    @Test
    public void testFormatAsFileSize3() {
        Formatter formatter = new Formatter();
        assertEquals("1.0 GB",formatter.formatAsFileSize(1024*1024*1024));
    }
    @Test
    public void testFormatAsFileSize4() {
        Formatter formatter = new Formatter();
        assertEquals("8589934591.99 GB",formatter.formatAsFileSize(Long.MAX_VALUE));
    }
    @Test
    public void testFormatAsFileSize5() {
        Formatter formatter = new Formatter();
        assertEquals("error",formatter.formatAsFileSize(-1));
    }
    @Test
    public void testFormatAsFileSize13() {
        Formatter formatter = new Formatter();
        assertEquals("1.86 GB",formatter.formatAsFileSize(2000000000));
    }
    @Test
    public void testFormatAsFileSize6() {
        Formatter formatter = new Formatter();
        assertEquals("23.47 KB",formatter.formatAsFileSize(1045*23));
    }
    @Test
    public void testFormatAsFileSize7() {
        Formatter formatter = new Formatter();
        assertEquals("23.47 MB",formatter.formatAsFileSize(1045*1024*23));
    }
    @Test
    public void testFormatAsTimeLength() {
        Formatter formatter = new Formatter();
        assertEquals("10 milli seconds",formatter.formatAsTimeLength(10));
        //assertEquals("1 KB",formatter.formatAsFileSize(1024*1024*1024*1024));
    }
    @Test
    public void testFormatAsTimeLength1() {
        Formatter formatter = new Formatter();
        assertEquals("1 seconds",formatter.formatAsTimeLength(1000));
    }
    @Test
    public void testFormatAsTimeLength2() {
        Formatter formatter = new Formatter();
        assertEquals("50 seconds",formatter.formatAsTimeLength(50000));
    }
    @Test
    public void testFormatAsTimeLength3() {
        Formatter formatter = new Formatter();
        assertEquals("1 minutes 0 seconds",formatter.formatAsTimeLength(60000));
    }
    @Test
    public void testFormatAsTimeLength4() {
        Formatter formatter = new Formatter();
        assertEquals("1 minutes 1 seconds",formatter.formatAsTimeLength(61000));
    }
    @Test
    public void testFormatAsTimeLength5() {
        Formatter formatter = new Formatter();
        assertEquals("59 minutes 1 seconds",formatter.formatAsTimeLength(3541000));
    }
    @Test
    public void testFormatAsTimeLength6() {
        Formatter formatter = new Formatter();
        assertEquals("1 hour 59 minutes",formatter.formatAsTimeLength(3599999*2));
    }
    @Test
    public void testFormatAsTimeLength7() {
        Formatter formatter = new Formatter();
        assertEquals("1 minutes 2 seconds",formatter.formatAsTimeLength(62500));
    }
    @Test
    public void testFormatAsTimeLength8() {
        Formatter formatter = new Formatter();
        assertEquals("2 hour 10 minutes 20 seconds",formatter.formatAsTimeLength(7820000));
    }
    @Test (expected=IllegalArgumentException.class)
    public void testFormatAsTimeLength9() {
        Formatter formatter = new Formatter();
        formatter.formatAsTimeLength(-1);
        //assertEquals("error",formatter.formatAsTimeLength(-1));
    }
    @Test
    public void testFormatAsTimeLength10() {
        Formatter formatter = new Formatter();
        assertEquals("10 minutes 20 seconds 10 milli seconds",formatter.formatAsTimeLength(620010));
    }
    @Test
    public void testFormatAsTimeLength11() {
        Formatter formatter = new Formatter();
        assertEquals("20 seconds 10 milli seconds",formatter.formatAsTimeLength(20010));
    }
    @Test
    public void testFormatAsTimeLength12() {
        Formatter formatter = new Formatter();
        assertEquals("2 hour 20 seconds 10 milli seconds",formatter.formatAsTimeLength(7220010));
    }
}
