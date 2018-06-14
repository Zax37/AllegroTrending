package pl.uj.jwzp.util;

import org.junit.Assert;
import org.junit.Test;

public class UrlJoinerTest {
    private final static String noDash = "test1";
    private final static String rightDash = "test2/";
    private final static String leftDash = "/test3";
    private final static String bothDashes = "/test4/";

    private final static String expectedOutput1 = "test1/test1";
    private final static String expectedOutput2 = "test2/test1";
    private final static String expectedOutput3 = "test1/test3";
    private final static String expectedOutput4 = "test2/test3";
    private final static String expectedOutput5 = "/test4/test4/";

    @Test
    public void shouldAddDashWhenNotPresent() {
        UrlJoiner uut = new UrlJoiner();

        String result = uut.join(noDash, noDash);

        Assert.assertEquals(expectedOutput1, result);
    }

    @Test
    public void shouldNotAddDashWhenOnePresent() {
        UrlJoiner uut = new UrlJoiner();

        String result1 = uut.join(rightDash, noDash);
        String result2 = uut.join(noDash, leftDash);

        Assert.assertEquals(expectedOutput2, result1);
        Assert.assertEquals(expectedOutput3, result2);
    }

    @Test
    public void shouldRemoveDashWhenTwoPresent() {
        UrlJoiner uut = new UrlJoiner();

        String result = uut.join(rightDash, leftDash);

        Assert.assertEquals(expectedOutput4, result);
    }

    @Test
    public void shouldNotChangeAnyOtherDashes() {
        UrlJoiner uut = new UrlJoiner();

        String result = uut.join(bothDashes, bothDashes);

        Assert.assertEquals(expectedOutput5, result);
    }
}
