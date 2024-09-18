import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //rellenar array
        char seats[][] = new char[10][10];

        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                seats[r][c] = 'L';
            }
        }

        Scanner keyboard = new Scanner(System.in);
        String sentinel = "";

        while (!sentinel.equalsIgnoreCase("finish")){

            System.out.println("¿Desea ver los asientos disponibles? Escriba: 'Si' o 'No'");
            String showSeats = keyboard.next();

            if(!showSeats.equalsIgnoreCase("si") && !showSeats.equalsIgnoreCase("no")){
                System.out.println("Palabra incorrecta. Debe escribir la palabra 'Si' o " +
                        " la palabra 'No'");
                continue;
            }

            if (showSeats.equalsIgnoreCase("si")){
                //mostrar mapa de asientos
                System.out.println(" Mapa de asientos disponibles:");
                System.out.print("\n");
                for (int f = 0; f < 10; f++) {
                    for (int c = 0; c < 10; c++) {
                        System.out.print(" " + seats[f][c] + " ");
                    }
                    System.out.print("\n");
                }
            }

            //elegir asiento
            System.out.println("Escriba la fila de su asiento");
            int seatRow = keyboard.nextInt();

            if(seatRow < 0 || seatRow > 9){
                System.out.println("Fila incorrecta, elija una fila entre el 0 y el 9");
                continue;
            }

            System.out.println("Escriba la columna de su asiento");
            int seatColumn = keyboard.nextInt();

            if (seatColumn < 0 || seatColumn > 9) {
                System.out.println("Columna incorrecta, elija una columna entre el 0 y el 9");
                continue;
            }

            if(seats[seatRow][seatColumn] == 'X'){
                System.out.println("El asiento esta ocupado, por favor elija otro asiento");
            }

            if(seats[seatRow][seatColumn] == 'L'){
                System.out.println("Ha reservado su asiento con EXITO!");
                seats[seatRow][seatColumn] = 'X';
            }

            System.out.println("Para salir del sistema escriba la palabra: 'finish', para" +
                    " continuar escriba cualquier letra");

            sentinel = keyboard.next();
        }
    }
}