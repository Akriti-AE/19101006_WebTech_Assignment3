public class Question3 {
    public static String sortString(String input_string){
        char array[] = input_string.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
    
    public static void main(String[] args){
        String input_string = "Akriti";
        String output_string = sortString(input_string);
        
        System.out.println("Input: " + input_string);
        System.out.println("Output: " + output_string);
    }
}