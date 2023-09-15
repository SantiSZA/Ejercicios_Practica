package septiembre15;

public class Bidimensional3 {

    public static void main(String[] args) {

        int[][] ordenamiento = {{15, 20, 100}, {300, 2, 10}, {25, 90, 1}};

        int filas = 3, columnas = 3;

        int menor = ordenamiento[0][0];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (ordenamiento[i][j] < menor) {
                    menor = ordenamiento[i][j];
                }
            }
        }
        System.out.println("El numero menor es : "+menor);
    }
}
