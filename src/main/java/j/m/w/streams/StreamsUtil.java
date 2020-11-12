package j.m.w.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Just a simple util class that uses streams to do things
 */
public class StreamsUtil {


    /**
     * Finds an element from a stream, returns null if not found
     */
    public static <T> T findElementFromStream(T searchObject, Stream<T> stream) {

        return (T) stream.filter(element -> element.equals(searchObject)).findFirst().orElse(null);
    }
}
