import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual tabuada você quer?");
        int tabuada = s.nextInt();

        System.out.println("Qual o tipo de tabuada?");
        String tipo = s.next();

        Calculo.tipoCalc(tipo, tabuada);
    }
}