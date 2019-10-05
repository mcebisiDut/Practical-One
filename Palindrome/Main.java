class Main{
    public static void main(String[] args) {
        String word = "Civic";
        boolean palindrome = isPalindrome(word);

        System.out.println(palindrome);
    }

    private static boolean isPalindrome(String word){
        StringBuilder input = new StringBuilder(word);

        return input.reverse().toString().equalsIgnoreCase(word);
    }
}