import org.testng.annotations.Test;

public class CarClass {@Test
public void testCarClass() {
    Car myFirstCar = new Car(3000 , " Prius");

    Car mySecondCar = new Car(20000 , " Range Rover");


    myFirstCar.buy();
    mySecondCar.buy();

    myFirstCar.printAllInfo();



    myFirstCar.setYear("2012");

    String firstCarYear = myFirstCar.getYear();
    System.out.println("firstCarYear =" + firstCarYear);


    boolean isEqualTo = false;
    if (firstCarYear != null) {
        String year = myFirstCar.getYear();
        isEqualTo = year.equalsIgnoreCase("2012");

    }

    System.out.println("isEqualTo = " + isEqualTo);
}
}
