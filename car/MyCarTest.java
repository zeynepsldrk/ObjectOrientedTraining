public class MyCarTest {
    public static void main(String[] args) {

        MyCar myCar = new MyCar();
        //myCar.make = "Honda"; -> make değişkenini final yaptığımız için tekrardan atama yaptığımızda hata alırız.
        myCar.model = "A";
        myCar.year = "2019";
        myCar.distance = 500;
        myCar.speed = 20;
        myCar.accelerate(100);


        double myCarsPeriod = myCar.go(1000);
        System.out.println("Birinci aracin 1000 km gitmesi "+ myCarsPeriod + " saat surer.");
        System.out.println("My " + myCar.getInfo());

        MyCar myCar2 = new MyCar();
        //myCar2.make = "Hyundai";
        myCar2.model = "i20";
        myCar2.year = "2010";
        myCar2.distance = 1000;
        myCar2.speed = 10;
        myCar2.accelerate(200);


        double mySecondCarsPeriod = myCar2.go(1000);
        System.out.println("Ikinci aracin 1000 km gitmesi "+ mySecondCarsPeriod + " saat surer.");
        System.out.println("My Second " + myCar2.getInfo());
    }
}
