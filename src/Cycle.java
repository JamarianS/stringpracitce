public class Cycle {
    public static void main(String[]args) {
        int bicycles = 10;
        int bicycleWheels;
        int tricycles;
        int TotalWheels = 47;
        int tricycleWheels ;


         bicycleWheels = bicycles * 2 ;
        tricycleWheels = TotalWheels - bicycleWheels;
         tricycles = tricycleWheels / 3;

        System.out.println(TotalWheels);
        System.out.println(bicycleWheels);
        System.out.println(tricycleWheels);
        System.out.println(tricycles);

        System.out.println("This Cycle Shop has " + tricycles + " tricycles !");
   }
}