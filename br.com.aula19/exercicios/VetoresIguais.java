public class VetoresIguais{

    public static void main(String[] args) {
       
    int[] vetorA = new int [5];
    vetorA[0] = 1;
    vetorA[1] = 2;
    vetorA[2] = 3;
    vetorA[3] = 4;
    vetorA[4] = 5;
    
    int[] vetorB = vetorA.clone(); 
    
    
    for(double itens : vetorA){
            System.out.println(itens);
        }
}