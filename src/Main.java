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
        plants3[2] = "Kanapes";
        plants3[3] = "Tulpe";
        plants3[4] = "Agurkas";
        plants3[5] = "Braske";
        plants3[6] = "Obuolys";
        plants3[7] = "Spinatai";
        plants3[8] = "Bulve";
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
        plants3[2] = "Kanapes";
        plants3[3] = "Tulpe";
        plants3[4] = "Agurkas";
        plants3[5] = "Braske";
        plants3[6] = "Obuolys";
        plants3[7] = "Spinatai";
        plants3[8] = "Bulve";
        plants3[9] = "Ridikas";

        for (int i = 0; i < plants3.length; i++) {
            System.out.println(plants3[i]);
        }


//        Penkta uzduotis

        System.out.println("----- 5 uzd -----");

        plants3[0] = "Azuolas";
        plants3[1] = "Morka";
        plants3[2] = "Kanapes";
        plants3[3] = "Tulpe";
        plants3[4] = "Agurkas";
        plants3[5] = "Braske";
        plants3[6] = "Obuolys";
        plants3[7] = "Spinatai";
        plants3[8] = "Bulve";
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

        for (int i = 10; i <= 50; i += 2) {
            if (i % 10 == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();


//          Astunta uzduotis

        System.out.println("----- 8 uzd -----");

        int count = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Porine reiksme: " + count + " kartu.");


//          Devinta uzduotis

        System.out.println("----- 9 uzd -----");

        int shortNames = 0;
        int longNames = 0;


        plants3[0] = "Azuolas";
        plants3[1] = "Morka";
        plants3[2] = "Kanapes";
        plants3[3] = "Tulpe";
        plants3[4] = "Agurkas";
        plants3[5] = "Braske";
        plants3[6] = "Obuolys";
        plants3[7] = "Spinatai";
        plants3[8] = "Bulve";
        plants3[9] = "Ridikas";

        for (int i = 0; i < plants3.length; i++) {
            if (plants3[i].length() <= 5) {
                shortNames++;
            }
            if (plants3[i].length() >= 7) {
                longNames++;
            }
        }
        System.out.println("Trumpesni, nei 5 simvoliai: " + shortNames);
        System.out.println("Ilgesni, nei 7 simvoliai: " + longNames);


//          Desimta uzduotis

        System.out.println("----- 10 uzd -----");

        int middleNames = 0;

        plants3[0] = "Azuolas";
        plants3[1] = "Morka";
        plants3[2] = "Kanapes";
        plants3[3] = "Tulpe";
        plants3[4] = "Agurkas";
        plants3[5] = "Braske";
        plants3[6] = "Obuolys";
        plants3[7] = "Spinatai";
        plants3[8] = "Bulve";
        plants3[9] = "Ridikas";

        for (int i = 0; i < plants3.length; i++) {
            if (plants3[i].length() > 5 && plants3[i].length() < 7) {
                middleNames++;
            }
        }
        System.out.println("Tarp 5 ir 7 simboliu: " + middleNames + " zodis");


//          1 S uzduotis

        System.out.println("----- 1 Sunk uzd -----");


        int[] nums2 = new int[300];

        int count1 = 0;

        for (int i = 0; i < 300; i++) {
            nums2[i] = (int) (Math.round(Math.random() * 300));
            if (nums2[i] > 150) {
                count1++;
            }
            if (nums2[i] > 250) {
                System.out.print("[" + nums2[i] + "] ");
            } else {
                System.out.print(nums2[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Skaiciu daugaiu uz 150: " + count1);


//        2 S uzduotis

        System.out.println("----- 2 Sunk uzd -----");

        String kabl = "";
        for (int i = 1; i < 3000 ; i++) {
            if (i % 77 == 0) {
                kabl = kabl + i + ",";
            }
        }
        System.out.println(kabl.substring(0,kabl.length()-1));



//        3 S uzduotis

        System.out.println("----- 3 Sunk uzd -----");

        for (int i = 0; i <= 25; i++) {
            String zvaig = "*";
            for (int a = 0; a <= 25; a++) {
                zvaig = zvaig + "*";
            }
            System.out.println(zvaig);
        }


//        5 S (a) uzduotis

        System.out.println("----- 5 (a) Sunk uzd -----");

        while (true) {
            int coinRnd = (int) Math.round(Math.random());
            if (coinRnd == 1) {
                System.out.println("S");    // 1 - skaicius
            }
            if (coinRnd == 0) {               // 0 - herbas
                System.out.println("H");
                break;
            }
        }


//        5 S (b) uzduotis

        System.out.println("----- 5 (b) Sunk uzd -----");

        int coinCount = 0;

        while (true) {
            int coinRnd = (int) Math.round(Math.random());
            if (coinRnd == 0) {
                System.out.println("H");
                coinCount++;
            } else {
                System.out.println("S");
            }
            if (coinCount >= 3) {
                break;
            }
        }


//        5 S (c) uzduotis

        System.out.println("----- 5 (c) Sunk uzd -----");

        int coinCount3 = 0;

        while (true) {
            int coinRnd = (int) Math.round(Math.random());
            if (coinRnd == 0) {
                System.out.print("H");
                coinCount3++;
            } else {
                System.out.print("S");
                coinCount3 = 0;
            }
            if (coinCount3 >= 3) {
                break;
            }
        }



//        6 S Uzduotis

        System.out.println("----- 6 Sunk uzd -----");

        int petrasPoints = 0;
        int kazysPoints = 0;

        while (true) {
            int petrasRnd = 10 + (int) Math.round(Math.random() * 10);
            petrasPoints += petrasRnd;

            int kazysRnd = 5 + (int) Math.round(Math.random() * 20);
            kazysPoints += kazysRnd;

            if (petrasPoints >= 222 || kazysPoints >= 222)
                break;
        }

        if (petrasPoints > kazysPoints) {
            System.out.println("Laimejo Petras: " + petrasPoints);
        }
        if (petrasPoints < kazysPoints) {
            System.out.println("Laimejo Kazys: " + kazysPoints);
        }
        if (petrasPoints == kazysPoints) {
            System.out.println("Lygiosios " + petrasPoints + ":" + kazysPoints);
        }


//        8 S (a) Uzduotis

        System.out.println("----- 8 a Sunk uzd -----");

//        int vinisGylis;
//        int vinisCount;

        for (int i = 0; i < 5; i++) {

           int vinisCount = 0;
           int vinisGylis = 0;

            while (true) {
                int rndGylis = 5 + (int) Math.round(Math.random() * 15);
                vinisGylis += rndGylis;
                vinisCount++;
                if (vinisGylis >= 85) {
                    break;
                }
            }
            System.out.println((i + 1) + " vinis ikalta per " + vinisCount + " smugius:");
            System.out.println("Ikalimo gylis: " + vinisGylis + " mm");
        }

//        8 S (b) Uzduotis

        System.out.println("----- 8 b Sunk uzd -----");

//        int vinisGylis;
//        int vinisCount;

        for (int i = 0; i < 5; i++) {

           int vinisCount = 0;
           int vinisGylis = 0;

            while (true) {
                int rndGylis = 20 + (int) Math.round(Math.random() * 10);
                int smugis = (int) Math.round(Math.random());
                if (smugis == 1) {
                    vinisGylis += rndGylis;
                }
                vinisCount++;
                if (vinisGylis >= 85) {
                    break;
                }
            }
            System.out.println((i + 1) + " vinis ikalta per " + vinisCount + " smugius:");
            System.out.println("Ikalimo gylis: " + vinisGylis + " mm");
        }











    }
}