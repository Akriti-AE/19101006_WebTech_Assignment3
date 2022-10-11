class Question2 {
    public static void main(String[] args) {
        int input_array[] = {14,2,2,18,18,18,17,3,13,9,0,20,13,5,6};
        System.out.print("Input: ");
        for(int h=0; h<input_array.length; h++){
            System.out.print(input_array[h] + " ");
        }
        int index[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int count1[] = new int[21];
        for(int i = 0; i<index.length; i++){
            for(int j = 0; j<input_array.length; j++){
                if(input_array[j] == i){
                count1[i]++;
                }
            }
        }
        
        //counting begins
        int count2[] = new int[21];
        count2[0] = count1[0];
        for(int k = 1; k<index.length; k++){
            count2[k] = count2[k-1] + count1[k];
        }
        
        //sorting begins
        int result[] = new int[input_array.length];
        for(int l=0; l<result.length; l++){
            for(int m=0; m<index.length; m++){
                if(input_array[l]==index[m]){
                    while(count1[m]>=1){
                        result[count2[m]-count1[m]] = input_array[l];
                        count1[m] = count1[m] - 1;
                    }
                }
            }
        }
        //Final result
        System.out.print("Output: ");
        for(int n=0; n<result.length; n++){
            System.out.print(result[n] + " ");
        }
    }
}