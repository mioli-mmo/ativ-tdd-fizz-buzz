# Evolução do código na metodologia 'Test Driven Development'

## Etapa 1: regra 'divisível por 3'

#### Classe testada

```java
public static class FizzBuzz {
    public String executar(int numero) {
        if (numero % 3 == 0) {
            return "fizz";
        }
        return "Não divisível";   
    }
}
```

### Teste

```java
    public class TesteFizzBuzz {
        public static void testar(int numero, FizzBuzz fizzBuzzObj) {
            String resultado = fizzBuzzObj.executar(numero);

            if ( !resultado.equals("fizz") ) {
                System.out.println("Teste 1 falhou");
            }
        }
    }
```

## Etapa 2: regra 'divisível por 5'

---

#### Classe testada

```java
public static class FizzBuzz {
    public String executar(int numero) {
        if (numero % 3 == 0) {
            return "fizz";
        } else if (numero % 5 == 0) {
            return "buzz";
        }
        return "Não divisível";   
    }
}
```

### Teste

```java
    public class TesteFizzBuzz {
        public static void testar(int numero, FizzBuzz fizzBuzzObj, String esperado) {
            String resultado = fizzBuzzObj.executar(numero);

            if ( !resultado.equals(esperado) ) {
                System.out.println("Teste falhou, pois o resultado " + resultado + " não foi igual ao esperado " + esperado);
            } else {
                System.out.println("Teste passou, pois o resultado " + resultado + " foi igual ao esperado " + esperado);
                }
        }
```

---

## Etapa 3: regra 'divisível por 3 e por 5'

#### Classe testada

```java
public static class FizzBuzz {
    public String executar(int numero) {
        if ( numero % 3 == 0 && numero % 5 == 0 ) {
            return "fizzbuzz";
        } else if ( numero % 3 == 0 ) {
            return "fizz";
        } else if ( numero % 5 == 0 ) {
            return "buzz";
        }
        return "Não divisível";   
    }
}
```

---

## Etapa 4: refactor

#### Classe testada

```java
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
```