import java.util.Objects;

public class Tort{
    private int szamlalo;
    private int nevezo;

    static int counter;

    public Tort(){
        this.nevezo = 1;
        this.szamlalo = 0;
        counter++;
    }

    public Tort(int szamlalo, int nevezo){
        this.szamlalo = szamlalo;
        this.nevezo = nevezo;
        counter++;
    }

    public static int getCounter(){
        return  counter;
    }

    public int getNevezo(){
        return  this.nevezo;
    }

    public int getSzamlalo(){
        return this.szamlalo;
    }

    public void setSzamlalo(int szamlalo){
        this.szamlalo = szamlalo;
    }

    public void setNevezo(int nevezo){
        if (nevezo == 0){
            System.out.println("A nevezo nem lehet 0!");
            this.nevezo = 1;
        }else {
            this.nevezo = nevezo;
        }
    }

    //override
    public String tosTring(){
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(szamlalo);
        stringBuffer.append("/");
        stringBuffer.append(nevezo);
        return stringBuffer.toString();
    }

    public Double ertek(){
        return (double) szamlalo / nevezo;
    }

    public int lnko (int a, int b){
        while(a != b){
            if (a > b){
                a -= b;
            }else {
                b -= a;
            }
        }
        return a;
    }

    public Tort egyszerusit(){
        int oszto = lnko(szamlalo, nevezo);
        this.szamlalo /= oszto;
        this.nevezo /= oszto;
        return this;
    }

    public boolean equals(Object o) {//???
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tort tort = (Tort) o;
        return szamlalo == tort.szamlalo && nevezo == tort.nevezo;
    }
    public int hashCode() {
        return Objects.hash(szamlalo, nevezo);
    }

    public void szorzasEgesszel(int szorzo){
        this.szamlalo *= szorzo;
    }
}