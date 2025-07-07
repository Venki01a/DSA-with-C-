class main{
    public static void main(String[] args){
        String str = "Hello";
        System.out.println("The string is: " + str);
        for(int i=str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i) + " ");
        }
    }
}