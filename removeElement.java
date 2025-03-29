class Main {
    public static void main(String[] args) {
     int[] arr = {5, 8, 12, 18, 22};
        
        for(int i = 1; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
            
        }
        arr[arr.length -1] = 0;
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
       
    }
}