package modulo2;

public class srednia {
    public static void main(String[]args){

        int[] tablica = {1,2,3,4,5,6,7,8,9,10};
        double sum = 0;
        for (int i= 0; i<tablica.length; i++) {
            sum += tablica[i];
        }
        sum /= tablica.length;
            System.out.println(sum);

        }
    }


