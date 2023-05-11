package recursoshumanos;
public class RecursosHumanos {
    public static void main(String[] args) {
        Empregado Eduarda = new Assalariado(9500.0, "Eduarda", "Welter", "9876454546");
        Empregado Este = new Comissionado(500000.0, 5.0, "Este", "Bernardi", "123456789");
        Empregado Luiza = new Horista(200, 80.0, "Luiza", "Jung", "45678331213");
        
        System.out.println(Eduarda.vencimento());
        System.out.println(Este.vencimento());
        System.out.println(Luiza.vencimento());
    }
}
