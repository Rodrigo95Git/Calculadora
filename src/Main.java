public class Main {
    public static void main(String[] args) {
        double n1=25, n2=5 , resulsuma, ressulresta;
        Operaciones suma=new Operaciones();
        resulsuma=suma.suma(n1,n2);
        System.out.println("La suma es : " + resulsuma);

        Operaciones resta=new Operaciones();
        ressulresta=resta.resta(n1,n2);
        System.out.println("La resta es : " + ressulresta);
    }
}