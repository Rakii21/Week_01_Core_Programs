public class Review4 {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,8,9};
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff=(arr[j]-arr[i]);
                if(diff<0){
                    continue;
                }
                else{
                    if(diff>maxProfit) maxProfit=diff;
                }
            }
        }
        System.out.println(maxProfit);

    }
    
}
