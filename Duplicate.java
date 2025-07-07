class main{
    public static void main(String[] args){
        String str = "Hello";
        System.out.println("The string is: " + str);
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
        String result = "";
        for(char i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println("\nThe string after removing duplicates is: " + result);

    }
}