package Evaluacion;



import javax.swing.*;


public class Evaluacion {
    public static Logic Mytriki;

    public static void main(String[] args) {

        Mytriki = new Logic();
            String result = null;
            int gameMOde = 0;
            int placePlayer_Row;
            int placePlayer_column;
            int turn;
            char Winner= 0;
        int limit = 0;
        boolean endGame = false;
        String showInputDialog = JOptionPane.showInputDialog("Seleccione el modo \n" +
                "1) 3x3\n" +
                "2) 5x5");


            while (endGame == false) {
                turn = 1;
                JOptionPane.showMessageDialog(null, "Turno del jugador uno (X)");
                result = JOptionPane.showInputDialog("Seleccione la fila que desea ");
                placePlayer_Row = Integer.parseInt(result);
                result = JOptionPane.showInputDialog("Seleccione la columna que desea ");
                placePlayer_column = Integer.parseInt(result);

              endGame = Mytriki.comprobarvictoria(gameMOde);
                Winner = 'X';



                limit++;
                if (gameMOde == 1 && limit == 9) {
                    endGame = true;
                }
                if (gameMOde == 2 && limit == 25) {
                    endGame = true;
                }

                if (endGame == false) {
                    turn = 2;
                    JOptionPane.showMessageDialog(null, "Turno del jugador dos (O)");
                    result = JOptionPane.showInputDialog("Seleccione la fila que desea");
                    placePlayer_Row = Integer.parseInt(result);
                    result = JOptionPane.showInputDialog("Seleccione la columna que desea");

                    placePlayer_column = Integer.parseInt(result);

                    endGame = Mytriki.comprobarvictoria(gameMOde);
                    Winner = 'O';
                    limit++;
                    if (gameMOde == 1 && limit == 9) {
                        endGame = true;
                    }
                    if (gameMOde == 2 && limit == 25) {
                        endGame = true;
                    }
                }
            }

            if (gameMOde == 1) {
                if (limit != 9) {
                    JOptionPane.showMessageDialog(null, "End game\\n" +
                            "El ganador es: " + Winner);
                } else JOptionPane.showMessageDialog(null, "There are no boxs left to fill\n end game");
            }
            if (gameMOde == 2) {
                if (limit != 25) {
                    JOptionPane.showMessageDialog(null, "End game\n" +
                            "El ganador es: " + Winner);
                } else JOptionPane.showMessageDialog(null, "There are no boxs left to fill\n end game");
            }

        }
    }
