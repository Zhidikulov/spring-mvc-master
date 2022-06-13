package web.model;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> carCount(List <Car> list, int count){
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
