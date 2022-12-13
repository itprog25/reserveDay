package com.company;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto();
        Lada lada = new Lada();
        if(auto instanceof Auto){
            System.out.println("Az auto referencia változó Autó típusú objektumra mutat");
        }
        if(lada instanceof Lada) { // lada amit vizsgálunk,az auto meg  a típus,date,string,Lada...
            System.out.println("A lada referencia változó Lada típusú objektumra mutat");
        }
        if(auto instanceof Auto) {
            System.out.println("A lada referencia változó Autó típusú objektumra mutat");
        }
        if(auto instanceof Lada) { //nem lesz igaz,nem ír ki semmit
            System.out.println("Az auto referencia változó Lada típusú objektumra mutat");
        }
    }
/*        System.out.println("Hello");
        try {
            reserveNap(5);
        } catch ( DayIsOnWeekendException e) {
            System.out.println("hiba keletkezett:" + e.getMessage());
        }catch (InvalidDayException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("viszlát");
        }*/
    private static void reserveNap(int dayOfWeek) throws InvalidDayException{ // void h ne térjen vissza és staticus h a mainból meg tudjam hivni
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            throw new DayOutOfBaounds("A nap kivülesik az érvényes tartományon: [1-7]");
        }
        if (dayOfWeek ==6 || dayOfWeek == 7) {
            throw new DayIsOnWeekendException("A nap hétvégére esik");
        }
        if (dayOfWeek ==5 ) {
            throw new DayIsFrieadyException("Péntek van");
        }
    }
}