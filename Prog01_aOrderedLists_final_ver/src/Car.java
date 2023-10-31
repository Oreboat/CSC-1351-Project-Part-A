public class Car implements Comparable<Car> {
    private String make;
    private int year;
    private int price;
    
    public Car(String Make, int Year, int Price)
    {
        this.make = Make;
        this.year = Year;
        this.price = Price;
    }
    public String getMake(){
        return make;
    }
    public int getYear(){
        return year;
    }
    public int getPrice(){
        return price;
    }
    public int compareTo(Car car2){
        //if (String.valueOf(make.charAt(0)).compareTo(String.valueOf(car2.getMake().charAt(0))) {
          //  return -1;
        //} else if (String.valueOf(make.charAt(0)).compareTo(String.valueOf(car2.getMake().charAt(0) == 0)) {
          //  return 1;
        //} else {
          //  if (year < car2.getYear()) {
            //    return -1;
            //} else if (year > car2.getYear()) {
              //  return 1;
            //}
        return 0;
    }
    public String toString(){
        return "Make: " + make + ", Year : " + year + ", Price: " + price + ";";
    }
}
