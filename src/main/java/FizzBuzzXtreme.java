import java.util.AbstractMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



/**
 * Created by savithak on 6/19/16.
 */
public class FizzBuzzXtreme {
    public Map<Integer, String> fizzbuzz(int N) {

        Stream<Map.Entry<Integer, String>> fizzStream = IntStream.rangeClosed(1, N/3).mapToObj(i -> new AbstractMap.SimpleEntry<>(i * 3, "fizz"));
        Stream<Map.Entry<Integer, String>> buzzStream = IntStream.rangeClosed(1, N/5).mapToObj(i -> new AbstractMap.SimpleEntry<>(i * 5, "buzz"));
        Stream<Map.Entry<Integer, String>> fizzbuzzStream = IntStream.rangeClosed(1, N/15).mapToObj(i -> new AbstractMap.SimpleEntry<>(i * 15, "fizzbuzz"));
        Stream<Map.Entry<Integer, String>> mehStream = IntStream.rangeClosed(1, N).mapToObj(i -> new AbstractMap.SimpleEntry<>(i, ""));

        return Stream.of(mehStream,fizzStream, buzzStream, fizzbuzzStream)
                .flatMap(Function.identity())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (value1, value2) -> value2));

    }
}
