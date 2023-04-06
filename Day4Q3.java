public class Main {
    public static void main(String[] args) {
        int[] arr = {50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};
        int max = 50;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                System.out.println(arr[i]);
            }
        }
    }
}