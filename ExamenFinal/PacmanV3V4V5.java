import java.util.Scanner;

public class PacmanV3V4V5{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean terminar = false;

        int[][] unaMatriz = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 2, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 2, 1 },
                { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        int[] posicionPersonaje = { 7, 10 };
        int[] posicionFantasma = { 5, 10 };
        int puntos = 0;
        int invencibilidad = 0;
        int skin=0;
        boolean cambioSkin = false;

        do {
            System.out.println("Puntos: [" + contador + "] / " + "Invencibilidad: [" + invencibilidad + "] / Skin: [" + skin + "]");
            for (int laFila = 0; laFila < unaMatriz.length; laFila++) {
                for (int laColumna = 0; laColumna < unaMatriz[laFila].length; laColumna++) {
                    if (skin==0){
                        if (laFila == posicionPersonaje[0] && laColumna == posicionPersonaje[1]) {
                            System.out.print("P");
                        } else if (laFila == posicionFantasma[0] && laColumna == posicionFantasma[1]) {
                            System.out.print("F");
                        } else {
                            if (unaMatriz[laFila][laColumna] == 0) {
                                System.out.print(".");
                            } else if (unaMatriz[laFila][laColumna] == 1) {
                                System.out.print("#");
                            } else if (unaMatriz[laFila][laColumna] ==2) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    } else if (skin==1){
                        if (laFila == posicionPersonaje[0] && laColumna == posicionPersonaje[1]) {
                            System.out.print("P2");
                        } else if (laFila == posicionFantasma[0] && laColumna == posicionFantasma[1]) {
                            System.out.print("F2");
                        } else {
                            if (unaMatriz[laFila][laColumna] == 0) {
                                System.out.print("===");
                            } else if (unaMatriz[laFila][laColumna] == 1) {
                                System.out.print("///");
                            } else if (unaMatriz[laFila][laColumna] ==2) {
                                System.out.print("???");
                            } else {
                                System.out.print("¿¿¿");
                            }
                        }
                    } else {

                        if (laFila == posicionPersonaje[0] && laColumna == posicionPersonaje[1]) {
                            System.out.print("PP3");
                        } else if (laFila == posicionFantasma[0] && laColumna == posicionFantasma[1]) {
                            System.out.print("FF3");
                        } else {
                            if (unaMatriz[laFila][laColumna] == 0) {
                                System.out.print("iii");
                            } else if (unaMatriz[laFila][laColumna] == 1) {
                                System.out.print("···");
                            } else if (unaMatriz[laFila][laColumna] ==2) {
                                System.out.print("!!!");
                            } else {
                                System.out.print("rrr");
                            }
                        }
                    }

                }
                System.out.println();
            }

            inputUsuario = entrada.nextLine().charAt(0);
            switch (inputUsuario) {
                case 's', 'S', '8':
                    posicionPersonaje[0] = posicionPersonaje[0] + 1;

                    if (posicionPersonaje[0]>11){
                        posicionPersonaje[0]=0;
                    }

                    break;
                case 'w', 'W', '2':
                    posicionPersonaje[0] = posicionPersonaje[0] - 1;

                    if (posicionPersonaje[0]<0){
                        posicionPersonaje[0]=11;
                    }

                    break;
                case 'a', 'A', '4':
                    posicionPersonaje[1] = posicionPersonaje[1] - 1;

                    if (posicionPersonaje[1]<0){
                        posicionPersonaje[1]=21;
                    }

                    break;
                case 'd', 'D', '6':
                    posicionPersonaje[1] = posicionPersonaje[1] + 1;

                    if (posicionPersonaje[1]>21){
                        posicionPersonaje[1]=0;
                    }

                    break; 
                case 'v', 'V':
                    skin = skin + 1;
                    if (skin>2){
                        skin = 0;
                    }
                    cambioSkin = true;
                    break;
                case 'f', 'F':
                    terminar = true;
            }

            if (invencibilidad!=0 && !cambioSkin){
                invencibilidad = invencibilidad - 1;
            }

                    }
                    if (laFila == posicionPersonaje[0] && laColumna == posicionPersonaje[1] && unaMatriz[laFila][laColumna] == 2) {
                        unaMatriz [laFila][laColumna] = -1;
                        puntos = puntos + 6;
                        invencibilidad = invencibilidad + 15;
                    }
                }
            }
        } while (!terminar);
    }   
}