public class Matriz {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 12;
        matrix[1][0] = 131;
        matrix[1][1] = 1411;
        for(int[] vetorInterno: matrix){ //A, B
            for (int valor: vetorInterno){ //A1, A2, B1, B2
                System.out.println(valor);
            }
        }

        //for(int linhas = 0; linhas < matrix.length; linhas++){
          //  for (int colunas = 0; colunas < matrix[0].length; colunas++){
              //  System.out.println(matrix[linhas][colunas]);
               // for(int[] vetorInterno: matrix) { //A, B
                 //   for (int valor : vetorInterno) { //A1, A2, B1, B2
                      //  System.out.println(valor);
                   // }
                //}

                //for(int linhas = 0; linhas < matrix.length; linhas++){
                    //for (int colunas = 0; colunas < matrix[0].length; colunas++){
                        //System.out.println(matrix[linhas][colunas]);
                 //   }
            //    }
            //}
       // }
    }
}
