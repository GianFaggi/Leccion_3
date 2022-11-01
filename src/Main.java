public class Main {
    public static void main(String[] args) {
        suma(3,2,4);
        coche micoche = new coche();
        micoche.Sumarpuerta();
        System.out.println(micoche.puertas);

    }

    public static int suma(int a, int b, int c){
        int resultado =  a + b + c;
        System.out.println(resultado);
        return resultado;
    }
}

class coche{
    int puertas;
    public void Sumarpuerta(){
        this.puertas++;
    }
}