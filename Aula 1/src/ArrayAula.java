public class ArrayAula {
    public static void main(String[] args) {
        int[] arrayNumero = new int[10];
        arrayNumero[0] = 8;
        arrayNumero[1] = 12;
        arrayNumero[2] = 15;
        arrayNumero[3] = 18;
        arrayNumero[4] = 19;
        arrayNumero[5] = 7;
        arrayNumero[6] = 12;
        arrayNumero[7] = 13;
        arrayNumero[8] = 11;
        arrayNumero[9] = 10;

        System.out.println("Tamanho do vetor: " + arrayNumero.length);
        for(int i=0; i < arrayNumero.length; i++){
            System.out.println(arrayNumero[i]);
        }
    }
}
