package arrayInJavaQs;

public class LargestAndSmallest {
    public static void main(String[] args){
        int[] IntArray = {1,2,5,6,7};
        //System.out.println(IntArray[0]);

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;


        for(int i:IntArray){
            //System.out.print(IntArray[i]);
            if(i>largest){
                largest=i;
            }
            else if(i<smallest){
                smallest=i;
            }

        }
        System.out.println("largest" +largest);
        System.out.println("smallest"+ smallest);
    }
}
