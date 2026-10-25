public class Ejercicio08 {
    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 9;
        int variable3 = 20;
        int variable4 = 500;
        int variable5 = 2;
        int variable6 = 3;
        int variable7 = 200;
        int variable8 = 50;
        int variable9 = 51;
        System.out.println("----Solucion a problema----");
        boolean resultado = (((variable1 * variable2) + variable3 - (variable4 / variable5) + Math.pow(variable6, variable5) >= variable7) || (variable8 >= variable8 - variable8 + variable9));
        System.out.println(resultado);
    }
}
