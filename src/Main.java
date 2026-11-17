import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        String[][] preguntas = {
            {"¿Cuál no es un tipo primitivo en Java?", "a. int", "b. char", "c. boolean", "d. String"},
            {"¿Qué tipo de dato almacena números enteros?", "a. int", "b. String", "c. boolean", "d. char"},
            {"¿Qué tipo almacena verdadero o falso?", "a. double", "b. boolean", "c. int", "d. String"},
            {"¿Qué símbolo termina una instrucción?", "a. :", "b. ,", "c. ;", "d. ."},
            {"¿Qué palabra se utiliza para crear una clase?", "a. class", "b. new", "c. void", "d. int"},
            {"¿Qué método inicia un programa Java?", "a. start", "b. run", "c. main", "d. init"},
            {"¿Qué tipo almacena un solo carácter?", "a. int", "b. char", "c. String", "d. float"},
            {"¿Qué clase permite leer datos del teclado?", "a. System", "b. Math", "c. String", "d. Scanner"},
            {"¿Qué operador se utiliza para sumar?", "a. +", "b. -", "c. *", "d. /"},
            {"¿Qué operador devuelve el resto de una división?", "a. /", "b. +", "c. %", "d. *"},
            {"¿Qué palabra se utiliza para una condición?", "a. for", "b. if", "c. class", "d. import"},
            {"¿Qué palabra se utiliza si la condición es falsa?", "a. else", "b. while", "c. return", "d. new"},
            {"¿Qué operador compara si dos valores son iguales?", "a. =", "b. !=", "c. ==", "d. >"},
            {"¿Qué operador significa diferente?", "a. ==", "b. !=", "c. >=", "d. <="},
            {"¿Qué operador significa AND lógico?", "a. ||", "b. !", "c. &&", "d. =="},
            {"¿Qué operador significa OR lógico?", "a. ||", "b. &&", "c. !", "d. %"},
            {"¿Qué operador significa NOT lógico?", "a. +", "b. !", "c. &&", "d. ||"},
            {"¿Qué bucle comprueba la condición antes de ejecutarse?", "a. if", "b. switch", "c. while", "d. class"},
            {"¿Qué bucle se ejecuta al menos una vez?", "a. for", "b. while", "c. if", "d. do-while"},
            {"¿Qué palabra permite salir de un bucle?", "a. break", "b. continue", "c. new", "d. void"},
            {"¿Qué palabra salta a la siguiente iteración?", "a. break", "b. continue", "c. class", "d. import"},
            {"¿Qué método obtiene la longitud de un String?", "a. size()", "b. count()", "c. length()", "d. get()"},
            {"¿Qué método convierte un String a mayúsculas?", "a. upper()", "b. toUpperCase()", "c. uppercase()", "d. upperCase()"},
            {"¿Qué método convierte un String a minúsculas?", "a. toLowerCase()", "b. lower()", "c. toSmall()", "d. small()"},
            {"¿Qué método compara el contenido de dos Strings?", "a. compare()", "b. ==", "c. equals()", "d. same()"},
            {"¿Qué método compara Strings ignorando mayúsculas?", "a. equals()", "b. equalsIgnoreCase()", "c. compare()", "d. contains()"},
            {"¿Qué método comprueba si un String contiene un texto?", "a. contains()", "b. find()", "c. search()", "d. length()"},
            {"¿Qué método extrae una parte de un String?", "a. charAt()", "b. split()", "c. substring()", "d. equals()"},
            {"¿Qué método devuelve un carácter de un String?", "a. get()", "b. charAt()", "c. character()", "d. index()"},
            {"¿Cuál es la primera posición de un array?", "a. 1", "b. 2", "c. -1", "d. 0"},
            {"¿Cómo se obtiene la longitud de un array?", "a. array.length", "b. array.size()", "c. array.count()", "d. array.long()"},
            {"¿Cómo se declara un array de enteros?", "a. int array", "b. int[] array", "c. array int", "d. String array"},
            {"¿Qué palabra se utiliza para crear un objeto?", "a. class", "b. create", "c. new", "d. object"},
            {"¿Qué tipo indica que un método no devuelve nada?", "a. int", "b. String", "c. boolean", "d. void"},
            {"¿Qué palabra devuelve un valor desde un método?", "a. return", "b. break", "c. new", "d. public"},
            {"¿Qué método imprime texto con salto de línea?", "a. print()", "b. println()", "c. write()", "d. show()"},
            {"¿Qué método de Scanner lee un número entero?", "a. nextLine()", "b. next()", "c. nextInt()", "d. readInt()"},
            {"¿Qué método de Scanner lee una línea de texto?", "a. nextInt()", "b. read()", "c. getLine()", "d. nextLine()"},
            {"¿Qué tipo permite almacenar números decimales?", "a. double", "b. boolean", "c. char", "d. int"},
            {"¿Cómo se escribe un comentario de una línea?", "a. ##", "b. //", "c. --", "d. **"},
            {"¿Qué palabra permite importar una clase?", "a. include", "b. require", "c. import", "d. use"},
            {"¿Qué operador aumenta una variable en una unidad?", "a. --", "b. **", "c. ==", "d. ++"},
            {"¿Qué operador disminuye una variable en una unidad?", "a. --", "b. ++", "c. !=", "d. +="},
            {"¿Cuánto es 10 % 3?", "a. 3", "b. 1", "c. 0", "d. 10"},
            {"¿Cuánto es 5 + 3 * 2?", "a. 16", "b. 13", "c. 11", "d. 10"},
            {"¿Cuánto es 10 / 2?", "a. 2", "b. 8", "c. 20", "d. 5"},
            {"¿Qué método calcula una raíz cuadrada?", "a. Math.sqrt()", "b. Math.pow()", "c. Math.abs()", "d. Math.random()"},
            {"¿Qué método genera un número aleatorio?", "a. Math.sqrt()", "b. Math.random()", "c. Math.round()", "d. Math.max()"},
            {"¿Qué método devuelve el valor máximo de dos números?", "a. Math.min()", "b. Math.abs()", "c. Math.max()", "d. Math.sqrt()"},
            {"¿Qué método elimina espacios al principio y al final de un String?", "a. remove()", "b. clean()", "c. delete()", "d. trim()"}
        };

        String[] respuestas = {
            "d", "a", "b", "c", "a", "c", "b", "d", "a", "c", "b", "a", "c", "b", "c", "a", "b", "c", "d", "a", "b", "c", "b", "a", "c", "b", "a", "c", "b", "d", "a", "b", "c", "d", "a", "b", "c", "d", "a", "b", "c", "d", "a", "b", "c", "d", "a", "b", "c", "d"
        };

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1));
            for (int j = 0; j < preguntas[i].length; j++) {
                System.out.println(preguntas[i][j]);
            }
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals(respuestas[i])) {
                System.out.println("Respuesta correcta!");
                puntos++;
            } else if (respuesta.equals("a") || respuesta.equals("b") ||
                       respuesta.equals("c") || respuesta.equals("d")) {
                System.out.println("Respuesta incorrecta");
                System.out.println("Respuesta correcta: " + respuestas[i]);
            } else {
                System.out.println("Respuesta no válida");
                return;
            }
        }
        System.out.println("Puntuación: " + puntos + "/" + preguntas.length);
        System.out.println("Respuestas incorrectas: " + (preguntas.length - puntos));
        System.out.println("Nota final: " + (puntos * 10.0 / preguntas.length));
    }
}
