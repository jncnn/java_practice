public class day1 {

    public static void main(String[] args){


//        RyDay3Customer customer1 = new RyDay3Customer();
//        RyDay3Customer customer2 = new RyDay3Customer("Ramazan", "test@test.com");
//        RyDay3Customer customer3 = new RyDay3Customer("Zeliha", 10000L, "test@test.com");
//        customer1.checkNumber(5);

        Wall wall1 = new Wall(10,11);
        Wall wall2 =new Wall();

        wall2.setHeight(5);
        wall2.setWidth(12);

        double area1 = wall1.getArea();
        double  area2 = wall2.getArea();

        System.out.println(area1);
        System.out.println(area2);

    }

    /*Write a method called checkNumber with an int parameter number.
    The method should not return any value, and it needs to print out:
    "positive" if the parameter number is > 0
 "negative" if the parameter number is < 0
  "zero" if the parameter number is equal to 0*/





     /*Leap Year Calculator
Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

To determine whether a year is a leap year, follow these steps:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
The following years are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
This is because they are evenly divisible by 100 but not by 400.


The following years are leap years:
1600, 2000, 2400
This is because they are evenly divisible by both 100 and 400.



Examples of input/output:

isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)

isLeapYear(1600); → should return true since 1600 is a leap year

isLeapYear(2017); → should return false since 2017 is not a leap year

isLeapYear(2000);  → should return true because 2000 is a leap year*/
    public static boolean isLeapYear(int year){
        if(year < 0 || year >= 9999){
            return false;
        }
        if (year%4 == 0 ){

            if (year%100 ==0){
                if (year%400 ==0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }

    /*
    1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
The following years are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
This is because they are evenly divisible by 100 but not by 400.

     */
    }
//



}





