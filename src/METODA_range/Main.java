package METODA_range;

import java.util.List;
import java.util.stream.*;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> liczby = IntStream.range(10, 15)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(liczby);
    }
}
