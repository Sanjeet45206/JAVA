class Car{
    private String make;
    private String model;
    private int year;
    private String color;
    Car(String mk, String md,int yr,String clr){
        this.make=mk;
        this.model=md;
        this.color=clr;
    }
    public void getCarDetails(){
        System.out.println(color+"-"+model+" "+year);
    }
}
public class S9 {
    public static void main(String[]args){
        Car principalCar = new Car("Hyundai","120",2022,"White");
        Car vprincipalCar = new Car("Maruti","Swift",2020,"Grey");
        System.out.println("The two cars parked un front of SMVITM are");
        principalCar.getCarDetails();
        vprincipalCar.getCarDetails();
    }
    
}
