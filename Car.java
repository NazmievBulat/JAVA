import org.testng.annotations.BeforeMethod;

public class Car {

    int price;
    String model;
    String year;
    String condition;

    Car(int price, String model){
     this.price = price;
     this.model = model;


    }

    void buy(){
        System.out.println("CAR IS BOUGHT");
    }
    void sell(){

        System.out.println("CAR IS SOLD");
    }

    void printAllInfo(){
        System.out.println("price" + price + "year" + year + "model" + model
                + "condition" + condition);


    }
    void setPrice(int newPrice){
        this.price = newPrice;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String newYear){
        this.year=newYear;
    }

}
