public class VetoresIguais{

    public static void main(String[] args) {
       
        int[] vetorA = new int[]{1,2,3,4,5};

        int[] vetorB = new int[vetorA.length];

        System.arraycopy(vetorA, 0, vetorB, 0, vetorA.length);

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("vetorB posição " + i + ": " + vetorB[i]);
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetorA posição " + i + ": " + vetorA[i]);
        }
    }
}