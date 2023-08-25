public class RyDay3Customer {
   private String name;
   private  Long creditLimit;
   private String email;

   public RyDay3Customer(){};

   public RyDay3Customer(String name, String email){
       this.name = name;
       this.email = email;
   }


   public RyDay3Customer(String name, Long creditLimit, String email){
       this.name = name;
       this.creditLimit = creditLimit;
       this.email = email;
   }

    public void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");

        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }


   public String getName(){
       return this.name;
   }
    public Long getCreditLimit(){
       return this.creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
