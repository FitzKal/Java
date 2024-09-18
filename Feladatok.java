import java.util.Arrays;

class Metodusok {

    //1
    static void elso (int a, int b, int c){
        int [] tomb = {a, b ,c};

        // bubble sort-tal nehezebb xdd
        for (int i = 1; i < tomb.length; i++) {
            for (int j = 0; j < tomb.length - 1; j++) {
                if (tomb[j + 1] < tomb[j]) {
                    int temp = 0;
                    temp = tomb[j + 1];
                    tomb[j + 1] = tomb[j];
                    tomb[j] = temp;
                }
            }
        }
        //Arrays.sort(tomb); // konnyebb lol
        for (int i = 0; i < tomb.length; i++){
            System.out.println(tomb[i]);
        }
    }
    //2
    static void minabsz(double a, double b, double c){
        double [] dub = {a, b, c};
        double minimum = 0;
        Arrays.sort(dub);
        minimum = dub[0];
        for (int i = 0; i < dub.length; i++) {
            dub[i] = Math.abs(dub[i]);
        }
        Arrays.sort(dub);
        System.out.println("Max = "+dub[2] + " " + "Min =  " + minimum ); //nem fogom megint megirni 2-szer a bubble sort-ot xd
    }

    //3
    static void haromszog (int a, int b , int c){
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("Lehet belole haromszog");
        }else {
            System.out.println("Nem lehet belole haromszog");
        }
    }

    //4
    static void evszam(int a, int b){
        for (int i = a; i <= b; i++){
            if ((i % 4 == 0 && i%100 != 0) || i % 400 == 0){
                System.out.println("Szokoev = " + i);
            }
        }
    }

    //5
    static int osztas(int a, int b){
        int hanyados = 0;
        while (a >= b){
            hanyados = hanyados + 1;
            a = a-b;
        }
        return  hanyados;
    }

    //6
    static boolean prime(int a){
        int n = 0;
        for (int i = 2; i <= a/2; i++){
            if (a%i == 0){
                n++;
            }
        }
        if (n >= 1){
            return true;
        }else {
            return false;
        }
    }

    //7
    static void fibonacci (int n){ //nem mondja hogy muszaj lenne rekurzioval, de azzal meg nem jottem ra, hogy hogyan is gondolja
         int n1 = 0;
         int n2 = 1;
         int n3;
         for (int i =0; i<n; i++){
             System.out.print(n1 + " ");
             n3 = n1 + n2;
             n1 = n2;
             n2 =  n3;

        }
        System.out.println();
    }

    static void fibonacci_idk(int n){ //abba amit a tanar megadott kb igy van, de itt se tudom hogy hol a rekurzio xd
        int n1 = 0;
        int n2 = 1;
        if (n == 1){
            System.out.println(n1);
        }
        if (n == 2){
            System.out.println(n1 +" "+ n2);
        }else {
            int c = n1 + n2;
            System.out.print(n1 + " " + n2 + " "+ c + " ");
            int k = 3;
            while (k < n){ //idk miert nem for ciklus lol van +1 valtozonk xd
                n1 = n2;
                n2 = c;
                c = n1 +n2;
                System.out.print(c + " ");// ezt kihagyta valamiert a megoldasbol xdd enelkul nem jon ki rendesen a feladat lol mert mindig csak az elso harom faktorialist fogja kiirni
                k = k+1;
            }
            System.out.println();
        }
    }
    //8
    static void mirror(int n){
        int mirrorSzam = 0;
         while (n != 0){
             mirrorSzam = mirrorSzam*10;
             mirrorSzam = mirrorSzam + n%10;
             n = n /10;

         }
        System.out.println(mirrorSzam);
    }
    //9
    static int fakt_with_norek(int n){
        int szam = 1;
        for (int i = 1; i <= n; i++){
            szam = szam * i;
        }
        return szam;
    }
    static int fakt_rek(int b){
        if (b <= 1){
            return 1;
        }
        return b * fakt_rek(b-1);
    }

    public static void main(String[] args) {
            elso(3,2,1);
            minabsz(-99,5,-10);
            haromszog(3,4,5);
            evszam(1990, 2024);
        System.out.println("hanyados = " +osztas(10,5));
        if (prime(4) == false){
            System.out.println("primszam");
        }else {
            System.out.println("nem prim");
        }
        fibonacci(4);
       fibonacci_idk(5);
       mirror(119);//xd
        System.out.println(fakt_with_norek(4));
        System.out.println(fakt_rek(4));


    }

}