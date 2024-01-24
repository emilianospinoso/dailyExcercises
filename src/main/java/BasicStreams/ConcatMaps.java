package BasicStreams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatMaps {
    public static void main(String[] args) {

        Map<String, Integer> mapa1 = new HashMap<>();
        mapa1.put("Maria", 20);
        mapa1.put("Juan", 30);
        Map<String, Integer> mapa2 = new HashMap<>();
        mapa2.put("Euclis", 90);
        mapa2.put("Juan", 30);

        Map<String, Integer> mapaConcat = Stream.concat(
                mapa1.entrySet().stream(),
                mapa2.entrySet().stream()
        ).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (x,y)->x+y
        ));

        System.out.println(mapaConcat);

    }
}
