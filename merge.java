class main{
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] mergedArray = merge(arr1, arr2);
        
        for (int num : mergedArray) {
            System.out.println(num + " ");
        }
    }
}

    