public class Calculo {
    private static void soma(int numero){
        for (int i = 0; i<=10;i++){
            int result = numero + i;
            System.out.println( numero +" + "+ i +" = "+ result);
        }
    }

    private static void subtracao(int numero){
        for (int i = 0; i<=10;i++){
            int result = numero - i;
            System.out.println( numero +" - "+ i +" = "+ result);
        }
    }

    private static void mult(int numero){
        for (int i = 0; i<=10;i++){
            int result = numero * i;
            System.out.println( numero +" x "+ i +" = "+ result);
        }
    }

    private static void div(int numero){
        for (int i = 0; i<=10;i++){
            int result = numero / i;
            System.out.println( numero +" / "+ i +" = "+ result);
        }
    }

    public static void tipoCalc(String calc, int numero) {
        switch (calc){
            case "x": mult(numero);
            break;
            case "/": div(numero);
            break;
            case "+": soma(numero);
            break;
            case "-": subtracao(numero);
            break;
            default:
                System.out.println("algo deu errado");
        }
    }
}
