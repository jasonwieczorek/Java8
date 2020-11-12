package j.m.w.streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class StreamsUtilTest {

    private Stream<String> animals = Stream.of("Frog", "Deer", "Alligator", "Deer");

    @Test
    public void findElementFromStream_Found() {

        String smallest =  StreamsUtil.findElementFromStream("Frog", animals);
        Assert.assertEquals("Frog", smallest);
    }

    @Test
    public void findElementFromStream_NotFound() {

        String smallest =  StreamsUtil.findElementFromStream("IDon'tExist", animals);
        Assert.assertNull(smallest);
    }


}
