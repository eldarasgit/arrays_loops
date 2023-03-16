import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//          Pirma uzduotis

        System.out.println("----- 1 uzd -----");

        for (int i = 0; i < 10; i++) {
            System.out.println("Labas " + (i + 1));
        }


//          Antra uzduotis

        System.out.println("----- 2 uzd -----");


        for (int i = 0; i < 9; i++) {
            System.out.println(i + 1);
        }


//          Trecia uzduotis

        System.out.println("----- 3 uzd -----");

        String [] plants3 = new String[10];

        plants3[0] = "Azuolas";
        plants3[1] = "Morka";
        plants3[2] = "Bulve";
        plants3[3] = "Tulpe";
        plants3[4] = "Kanapes";
        plants3[5] = "Agurkas";
        plants3[6] = "Braske";
        plants3[7] = "Obuolys";
        plants3[8] = "Spinatai";
        plants3[9] = "Ridikas";

        for (int i = 0; i < plants3.length; i++) {
            System.out.print(plants3[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(plants3));


//          Ketvirta uzduotis

        System.out.println("----- 4 uzd -----");

        plants3[0] = "Azuolas";
        plants3[1] = "Morka";
        plants3[2] = "Bulve";
        plants3[3] = "Tulpe";
        plants3[4] = "Kanapes";
        plants3[5] = "Agurkas";
        plants3[6] = "Braske";
        plants3[7] = "Obuolys";
        plants3[8] = "Spinatai";
        plants3[9] = "Ridikas";

        for (int i = 0; i < plants3.length; i++) {
            System.out.println(plants3[i]);
        }


//        Penkta uzduotis

        System.out.println("----- 5 uzd -----");

        plants3[0] = "Azuolas";
        plants3[1] = "Morka";
        plants3[2] = "Bulve";
        plants3[3] = "Tulpe";
        plants3[4] = "Kanapes";
        plants3[5] = "Agurkas";
        plants3[6] = "Braske";
        plants3[7] = "Obuolys";
        plants3[8] = "Spinatai";
        plants3[9] = "Ridikas";

        for (int i = plants3.length - 1; i >= 0; i--) {
            System.out.println(plants3[i]);
        }


//          Sesta uzduotis

        System.out.println("----- 6 uzd -----");

        for (int i = 10; i <= 50; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();


//          Septinta uzduotis

        System.out.println("----- 7 uzd -----");

        for (int i = 10; i <= 50; i = i + 2) {
            if (i % 10 == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
















    }
}