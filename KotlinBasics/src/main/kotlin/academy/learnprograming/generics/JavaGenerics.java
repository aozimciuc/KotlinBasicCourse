package academy.learnprograming.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics<T extends FlowerJava> {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item");
        String upperCase = list.get(0).toUpperCase();// No need to cast to String

        ArrayList<Object> strings = new ArrayList<>();
        strings.add("Item");
        boolean b = strings instanceof List; // strings instanceof List<String> doesn't compile
    }


    public void waterGarden(GardenJava garden) {
        garden.getFlowers().forEach(System.out::println);
    }

    public <T extends FlowerJava> void tendGarden(GardenJava<T> garden) {
        waterGarden(garden);
        garden.pickFlowers(25);
    }

    public <T extends FlowerJava> void tendRoseGarden(GardenJava<T> garden) {
        waterGarden(garden);
        garden.pickFlowers(25);
    }

}

class FlowerJava {
    private final Integer height;

    public Integer getHeight() {
        return this.height;
    }

    public FlowerJava(Integer height) {
        this.height = height;
    }

    public String toString() {
        return "Flower";
    }
}

class RoseJava extends FlowerJava {
    public RoseJava(Integer height) {
        super(height);
    }

    public String toString() {
        return "Rose";
    }

}

final class GardenJava<T extends FlowerJava> {
    private final List<T> flowers = new ArrayList<>();

    public List<T> getFlowers() {
        return flowers;
    }

    public List<T> pickFlowers(Integer height) {   // can use generic type T as return type
        System.out.println("I'm picking flowers");
        return this.flowers.stream()
                .filter(i -> i.getHeight() >= height)
                .toList();
    }

}
