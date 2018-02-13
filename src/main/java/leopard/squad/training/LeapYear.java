package leopard.squad.training;

public class LeapYear {


    //A leap year is divisible by 4,
    // but is not otherwise divisible by 100,
    // unless it is also divisible by 400.

    public boolean isALeapYear(int year){

        if (((year%4 == 0) && (year%100!=0)) || (year%400==0)){
            return true;
        }
        return false;
    }

}
