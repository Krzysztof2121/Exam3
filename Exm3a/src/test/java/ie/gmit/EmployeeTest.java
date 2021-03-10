package ie.gmit;

public class EmployeeTest {

 //
     //    public static void main(String args[]) {
     private Employee e1;


     void init() {e1 = new Employee( "Krzysztof", "Mr", "12345678K", "2345667890",46);

   @
           void TestConstructorTitleFail(){
       Exception e assertTRrows(IllegalArgumentException.class, () -> new Employee( "Krzysztof", "Mr", "12345678K", "2345667890",46);
       asserEquals("invalid title", e.getMessage());

         }
     }


}
