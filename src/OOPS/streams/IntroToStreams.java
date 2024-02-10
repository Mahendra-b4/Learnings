package OOPS.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntroToStreams {
    // How to create Stream
    /*
    What is Stream -> Wrapper over the data source(like : Array, list, file, etc.)
     */

    // Way 1
    Integer[] array = {1,2,3,4,5};
    Stream<Integer> st1 =  Stream.of(array);

    //Way 2
    List<Integer> list = Arrays.asList(6,7,8,9,10);
    Stream<Integer> st2 = list.stream();

}
