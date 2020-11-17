package j.m.w.streams;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsUtilTest {

    private Stream<String> animals = Stream.of("Frog", "Deer", "Alligator", "Deer");

    @Test
    public void findElementFromStream_Found() {

        String smallest = StreamsUtil.findElementFromStream("Frog", animals);
        Assert.assertEquals("Frog", smallest);
    }

    @Test
    public void findElementFromStream_NotFound() {

        String smallest = StreamsUtil.findElementFromStream("IDon'tExist", animals);
        Assert.assertNull(smallest);
    }

    @Test
    public void supplyDateWithOffset() {

        LocalDate today = LocalDate.now();
        LocalDate suppliedDate = StreamsUtil.supplyDateWithOffset(1);

        Assert.assertEquals(today.minusDays(1), suppliedDate);
    }

    @Test
    public void consumeListToMap() {

        Map<Integer, String> animalMap = new HashMap<>();
        StreamsUtil.consumeListToMap(animals.collect(Collectors.toList()), animalMap);

        Assert.assertEquals(4, animalMap.size());
    }
}
