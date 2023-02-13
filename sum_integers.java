class HelloWorld {
    public static void main(String[] args) {
        String sample_input="PRA12Ga782d45601$3";

        int sum=0;
    
        
        for(int i = 0; i < sample_input.length() ; i++){
            if(Character.isDigit(sample_input.charAt(i))){
                sum = sum + Integer.parseInt(String.valueOf(sample_input.charAt(i)));
            }
        }
        
        System.out.println(sum);
    }
}