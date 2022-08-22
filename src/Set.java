import java.util.HashSet;

public class Set {


    public static void main(String[] args) {
        String[] makeOfCars = {"BMW","Mercedes","Toyota","Mercedes","Volkswagen","Mercedes"};

        HashSet<String> cars = new HashSet<String>();

        for(int i = 0;i< makeOfCars.length;i++)
        {
            cars.add(makeOfCars[i]);
        }

        System.out.println(cars);

        int diffOfSize = makeOfCars.length - cars.size();

        if(diffOfSize != 0)
        {
            System.out.println("We have+ " +cars.size()+" unique element and " +diffOfSize+ " dublicates");
        }
        else
        {
            System.out.println("All elements of makeOfCars are unique");
        }


        if(cars.contains("BMW"))
        {
            System.out.println("BMW is founded");
        }
        else
        {
            System.out.println("There is no BMW");
        }

    }






}
