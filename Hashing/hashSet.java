import java.util.HashSet;
public class hashSet {
    public static void main(String args[]){
        ////creation
        HashSet<String> cars = new HashSet<>();

        ////Insertion
        cars.add("Volvo");
        cars.add("RollsRoyce");
        cars.add("RangeRover");
        System.out.println(cars);

        ////Deletion
        cars.remove("Volvo");
        System.out.println(cars);

        ////Check Exixtence
        System.out.println(cars.contains("RollsRoyce"));

        ////Size(no of elements)
        System.out.println(cars.size());

        ////Loop Through
        for(String i : cars){
            System.out.println(i);
        }

        /////TreeSet, LinkedHashSet ----> methods same as above

    }
}
