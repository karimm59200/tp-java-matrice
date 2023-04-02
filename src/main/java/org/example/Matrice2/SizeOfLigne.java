package org.example.Matrice2;

public class SizeOfLigne {
    public static void sizeOfLine() {

        int[][] matrice = {
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5, 6},
        };
        int firstCellSize = 0;

        for (int i = 0; i < matrice.length; i++) {
            if(i == 0){
                firstCellSize = matrice[i].length;
                i++;
            }
            else if(firstCellSize !=  matrice[i].length) {
                System.out.println("not regular");
                return;
            }else{
                System.out.println("regular");
                return;
            }
        }
    }

}