import java.util.Scanner;

public class Reto_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidadNotas;
        double promedio;
        double sumaNotas = 0;
        
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        cantidadNotas = leer.nextInt();
        double[] notas = new double[cantidadNotas];
       
        
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese el valor de la nota "+(i+1)+": " );
            notas[i] = leer.nextDouble();
            sumaNotas += notas[i];
        }
        
        promedio = sumaNotas / cantidadNotas;
        System.out.println("El promedio de las notas es: " + promedio);
        
        if (promedio < 3) {
            System.out.println("Reprobaste");
        } else if (promedio >= 3 && promedio <= 4) {
            System.out.println("Pasaste raspando");
        } else if (promedio > 4){
            System.out.println("Aprobaste con buenos resultados");
        }else{
            System.out.println("Digito un dato invalido, vuleva a intentarlo");
        }
        
        leer.close();
    }

}