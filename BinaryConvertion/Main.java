class Main{
    public static StringBuilder binaryNumber = new StringBuilder("");
    
    public static void main(String[] args) {
        int decimal = 23;
        String binary = getBinaryForm(decimal);

        System.out.println(binary);
    }

    private static String getBinaryForm(int decimal){
        
        if (decimal > 0) {
            binaryNumber.append(decimal % 2);
            getBinaryForm(decimal / 2);
        }

        String binary = binaryNumber.reverse().toString();

        return binary;
    }
}