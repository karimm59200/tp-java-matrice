package org.example.matrice1;

public class Matrice1 {

    public static void MatriceSommeDiagonale() {
        int[][] matrice = {
                {1, 2, 3},
                {1, 8, 3},
                {1, 2, 1}
        };
        int res = 0;
//        System.out.println(matrice[0][0]);
//        System.out.println(matrice[1][1]);
//        System.out.println(matrice[2][2]);


        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                System.out.print(matrice[i][j] + " ");
                res += matrice[i][j];
                i++;

            }
            System.out.println(" le résultat est de : " + res);
        }

    }
}
