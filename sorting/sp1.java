
public class sp1{

    public static void main(String[] args) {
        int[] ar1={2,4,6};
        int[] ar2={1,3,7,9};
        int[] nar=new int[ar1.length+ar2.length];

        int i=0,j=0,k=0;

        for(int l=0;l<ar1.length+ar2.length;i++){
            if (ar1[i]>=ar2[j]) {
                nar[k]=ar1[j];
                k++;
            }
        }

        System.out.println(nar.length);
    }

}

