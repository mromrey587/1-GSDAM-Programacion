package battleship;

import java.util.*;

public class Battleship {

    public static void main(String[] args) {
        int tablero[][] = {
            {3, 0, 4, 4, 4, 4, 0, 0, 0, 0},
            {3, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {3, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 3, 3, 3, 0, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 2, 0, 0, 2, 0, 0, 0, 0, 5},
            {0, 0, 0, 0, 2, 0, 0, 0, 0, 5},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
            {0, 0, 0, 2, 0, 0, 0, 0, 0, 5},
            {0, 0, 0, 2, 0, 0, 0, 0, 0, 5}

        };
        int tableroj[][] = {
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
            {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2}
        };
        ArrayList<Integer> barco3 = new ArrayList();
        barco3.add(tablero[0][0]);
        barco3.add(tablero[1][0]);
        barco3.add(tablero[2][0]);
        barco3.add(tablero[3][4]);
        barco3.add(tablero[3][5]);
        barco3.add(tablero[3][6]);

        ArrayList<Integer> barco4 = new ArrayList();
        barco4.add(tablero[0][2]);
        barco4.add(tablero[0][3]);
        barco4.add(tablero[0][4]);
        barco4.add(tablero[0][5]);

        ArrayList<Integer> barco2 = new ArrayList();
        barco2.add(tablero[4][1]);
        barco2.add(tablero[5][1]);
        barco2.add(tablero[5][4]);
        barco2.add(tablero[6][4]);
        barco2.add(tablero[9][3]);
        barco2.add(tablero[8][3]);

        ArrayList<Integer> barco5 = new ArrayList();
        barco5.add(tablero[5][9]);
        barco5.add(tablero[6][9]);
        barco5.add(tablero[7][9]);
        barco5.add(tablero[8][9]);
        barco5.add(tablero[9][9]);

        int fin = 0;
        String respuesta;
        while (fin < 7) {
            System.out.println("¿Quiere que le muestre el tablero actual?");
            respuesta = new Scanner(System.in).nextLine();
            if (respuesta.equals("S") || respuesta.equals("s")) {
                for (int x = 0; x < 10; x++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print(tableroj[j][x]);

                    }
                    System.out.println();

                }

            }
            System.out.println("Introduce el valor de Y");
            int y = new Scanner(System.in).nextInt();

            System.out.println("Introduce el valor de X");
            int x = new Scanner(System.in).nextInt();

            int barco = tablero[y][x];

            if (barco > 0) {
                switch (barco) {
                    case 2:
                        tablero[y][x] = 0;
                        tableroj[y][x] = 0;
                        System.out.println("Tocado");
                        if ((tablero[4][1] == 0) && ((tablero[5][1]) == 0)) {
                            System.out.println("a casa un barco de 2");
                            fin++;
                            tablero[4][1] = -1;
                        }

                        if ((tablero[5][4] == 0) && ((tablero[6][4]) == 0)) {
                            System.out.println("a casa un barco de 2");
                            fin++;
                            tablero[5][4] = -1;
                        }

                        if ((tablero[9][3] == 0) && ((tablero[8][3]) == 0)) {
                            System.out.println("a casa un barco de 2");
                            fin++;
                            tablero[9][3] = -1;
                        }

                        break;

                    case 3:
                        tablero[y][x] = 0;
                        tableroj[y][x] = 0;
                        System.out.println("Tocado");
                        if ((tablero[0][0] == 0) && ((tablero[1][0]) == 0) && ((tablero[2][0]) == 0)) {
                            System.out.println("a casa un barco de 3");
                            fin++;
                            tablero[2][0] = -1;
                        }
                        if ((tablero[3][4] == 0) && ((tablero[3][5]) == 0) && ((tablero[3][6]) == 0)) {
                            System.out.println("a casa un barco de 3");
                            fin++;
                            tablero[3][4] = -1;
                        }

                        break;

                    case 4:
                        tablero[y][x] = 0;
                        tableroj[y][x] = 0;
                        System.out.println("Tocado");
                        if ((tablero[0][2] + tablero[0][3] + tablero[0][4] + tablero[0][5]) == 0) {
                            System.out.println("a casa el barco de 4");
                            fin++;
                            tablero[0][2] = -1;
                        }
                        break;

                    case 5:
                        tablero[y][x] = 0;
                        tableroj[y][x] = 0;
                        System.out.println("Tocado");
                        if ((tablero[5][9] + tablero[6][9] + tablero[7][9] + tablero[8][9]) == 0) {
                            System.out.println("a casa el barco de 5");
                            fin++;
                            tablero[8][9] = -1;
                        }
                        break;

                }
            } else {
                System.out.println("AGUA");
                tableroj[y][x] = -1;
            }
        }
        System.out.println("bien hecho, has hundido todo los barcos");
    }

}
