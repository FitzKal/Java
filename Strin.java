import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*
        Olvassunk be  vegjelig a kimenetrol, ; vesszovel elvalasztott szamokat
        es nezzuk meg hogy, keszitheto e belole haromszog
        es ha igen milyen
        kezeljuk a hibakat

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a szamokat: ");
        String s = scanner.nextLine();
        String[] sztringek = s.split(";");
        Double [] nums = new Double[sztringek.length];
        for (int i = 0; i < sztringek.length; i++){
            nums[i] = Double.parseDouble(sztringek[i]);
        }
        if (nums[0] + nums[1] > nums[2] && nums[2] + nums[1] > nums[0] && nums[2] + nums[0] > nums[1] ){
            System.out.println("Rajzolhato haromszog");
        }else {
            System.out.println("Nem rajzolhato haromszog");
        }*/

         /* tomb
        atlag
        min
        max

        double osszeg = 0;
        Scanner scanner = new Scanner(System.in);
        Double[] nums = new Double[3];
        String s;
        for (int i = 0; i < 3 ; i++){
            System.out.println("Adj meg egy szamot: ");
            s = scanner.nextLine();
            nums[i] = Double.parseDouble(s);
            osszeg += nums[i];
        }
        double min = nums[0];
        double max = nums[0];
        for (var a : nums){
            if (a > max){
                max = a;
            } else if (a < min) {
                min = a;
            }
        }
        Arrays.sort(nums);
        for (var a : nums){
            System.out.println(a);
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Osszeg: "+osszeg);
        System.out.println("Atlag: "+osszeg/nums.length);*/

        /*
        olvassunk be 10 db sort
        milyen hosszu az elem
        van-e benne szokoz
        nagy es kisbetus
        elso szo
        ures e
         */
        Scanner scanner = new Scanner(System.in);
        String[] text = new String[3];
        for (int i = 0; i < text.length; i++){
            String s = scanner.nextLine();
            text[i] = s;
        }
        for (int i  = 0; i < text.length; i++){
            System.out.println(text[i] + " " + text[i].length());
            if (text[i].indexOf(' ')==-1){
                System.out.println("Nincs Benne szokoz");
            }else {
                System.out.println("Van benne szokoz, es az elso szava: " + text[i].substring(0,text[i].indexOf(" ")));
            }
            System.out.println("Nagybetus: "+text[i].toUpperCase());
            System.out.println("kisbetus: "+text[i].toLowerCase());
            System.out.println("ures-e: " + text[i].isEmpty());
            System.out.println("trim" + text[i].trim());
        }
    }
}