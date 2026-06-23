public class Main {

    // -- Classe testada --
    public static class FizzBuzz {
        public String executar(int numero) {
            if ( numero % 15 == 0 ) {
                return "fizzbuzz";
            } else if ( numero % 3 == 0 ) {
                return "fizz";
            } else if ( numero % 5 == 0 ) {
                return "buzz";
            }
            return Integer.toString(numero);   
        }
    }

    // -- Classe de teste --
    public static class TesteFizzBuzz {
        public static void testar(int numero, FizzBuzz fizzBuzzObj, String esperado) {
            String resultado = fizzBuzzObj.executar(numero);

            if ( !resultado.equals(esperado) ) {
                System.out.println("Teste falhou, pois o resultado " + resultado + " não foi igual ao esperado " + esperado);
            } else {
                System.out.println("Teste passou, pois o resultado " + resultado + " foi igual ao esperado " + esperado);
            }
        }
    }

    // -- Execução --
    public static void main(String[] args) {
        FizzBuzz instanciaFizzBuzz = new FizzBuzz();

        TesteFizzBuzz.testar(3, instanciaFizzBuzz, "fizz");
        TesteFizzBuzz.testar(5, instanciaFizzBuzz, "buzz");
        TesteFizzBuzz.testar(15, instanciaFizzBuzz, "fizzbuzz");
        TesteFizzBuzz.testar(2, instanciaFizzBuzz, "2");
    }
}
