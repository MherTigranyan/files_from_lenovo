public class Aragachap {

    int maxSpeed;
    String street;

    public Aragachap(int maxSpeed, String street) {
        this.maxSpeed = maxSpeed;
        this.street = street;
    }


    public void check(Car car){
        if (maxSpeed < car.speed){
        System.out.println("In " + street + " grazanl aragutyun@");
}   }
}
