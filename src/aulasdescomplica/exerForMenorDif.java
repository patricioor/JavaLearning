
package aulasdescomplica;

import java.util.Arrays;

public class exerForMenorDif {
    public static void main(String[] args) {
        int[] arr = {0,4,5,9,9};
        int[] k = new int[2];
        int minDiff = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++)
            for(int j = i+1; j < arr.length;j++){
                int diff = Math.abs(arr[i]-arr[j]);
                
                if(diff<minDiff){
                    minDiff = diff;
                    k[0] = arr[i];
                    k[1] = arr[j];
                }
            }
        System.out.println(Arrays.toString(k)); // [9,9]
    }
}
