public class Question4 {
    public static void main(String[] args){
        int input_number = 7;
        System.out.println("Input: " + input_number);
        
        //Hailstone sequence begins
        System.out.print("Output: ");
        while(input_number>1){
            if(input_number%2==0){
                input_number = input_number/2;
            }
            else{
                input_number = (input_number*3) + 1;
            }
            System.out.print(input_number + " ");
        }
    }
}