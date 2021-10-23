public class VetoresIguaisMultiplicados {
    public static void main(String[] args){ 
            int[] vetorA = new int[]{1,2,3,4,5};
    
            int[] vetorB = new int[vetorA.length];

            for(int i = 0; i < vetorB.length; i++){
                ((vetorB[i]) * 2);
            }
    
            System.arraycopy(vetorA, 0, vetorB, 0, vetorA.length);
    }
    
}
