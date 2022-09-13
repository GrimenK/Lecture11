import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        //TASK 1
        List<Integer> list = new ArrayList<>(List.of(8,5,6));
        List<Integer> list2 = new ArrayList<>(List.of(2,7,4,8,0,1,76,16));
        List<List<Integer>> listVals = new ArrayList<>(List.of(list,list2));


        List<Integer> result = new ArrayList<>(
                listVals.stream()
                .flatMap(x -> x.stream())
                .sorted(((o1, o2) -> o1 - o2))
                .collect(Collectors.toList())

        );

        LOGGER.info("Task A + B: " + result);
        result.add(null);

        List<Integer> resultOptional = new ArrayList<>(
                result
                        .stream()
                        .map(x -> Optional.ofNullable(x).orElse(55))
                        .collect(Collectors.toList())
        );
        LOGGER.info("Task C + D: " + resultOptional);
    }
}
