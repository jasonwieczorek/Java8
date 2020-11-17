package j.m.w.streams;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Just a simple util class that uses streams to do things.
 */
public class StreamsUtil {

    /**
     * Finds an element from a stream, returns null if not found
     */
    public static <T> T findElementFromStream(T searchObject, Stream<T> stream) {

        return (T) stream.filter(element -> element.equals(searchObject)).findFirst().orElse(null);
    }

    /**
     * Simple Supplier that returns a LocalDate given an offset.
     */
    public static LocalDate supplyDateWithOffset(int offset) {

        Supplier<LocalDate> dateSupplier = () -> {

            // put complex logic here if supplier is a real complicated one
            return LocalDate.now();
        };

        return dateSupplier.get().minusDays(offset);
    }

    /**
     * Simple test of a Consumer, nom nom converts a list to a map with the keys as indexes
     */
    public static void consumeListToMap(List<String> list, Map<Integer, String> map) {

        BiConsumer<Integer, String> mapConsumer = map::put;

        final int[] index = { 0 };
        list.forEach((element) -> mapConsumer.accept(index[0]++, element));
    }
}
