import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        Tort tortuRES = new Tort();
        System.out.println("A tortek szama = " + Tort.getCounter());

        Tort ujTort = new Tort(4,3);
        System.out.println("A tortek szama = " + Tort.getCounter());
       // System.out.println("A nevezonk = " + ujTort.getNevezo());
        //System.out.println("A szamlalonk = " + ujTort.getSzamlalo());

        Tort probatort = new Tort();
        probatort.setNevezo(4);
        probatort.setSzamlalo(2);
        System.out.println("tort = " + probatort.tosTring());
        System.out.println("A tort erteke: " + probatort.ertek());
        System.out.println("lnko = " + probatort.lnko(probatort.getSzamlalo(), probatort.getNevezo()));
        System.out.println("egyszerusitett tort = " + probatort.egyszerusit().tosTring());
        System.out.println(probatort.equals(ujTort));
        System.out.println(probatort.hashCode());
        probatort.szorzasEgesszel(2);
        System.out.println(probatort.tosTring());
        
    }
}
