public class Question1 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 0, 5, 6, 0, 8};
        int sum = 0;
        int m=0,n=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.printf("INDEX NO. WHERE 0 OCCURS IS : %d\n", i);
                m=i;
                break;
            }
        }
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==0){
                System.out.printf("INDEX NO. WHERE 0 OCCURS IS : %d\n", i);
                n=i;
                break;
            }
        }
        for(int i=m; i<=n; i++){
            sum = sum + arr[i];
        }
        System.out.println("Array after changing: -");
        for(int i=0; i<arr.length; i++){
            if(i==3 || i==4 || i==5 || i==6){
                System.out.println(arr[i]);
                continue;
            }
            arr[i] = sum;
            System.out.println(arr[i]);
        }
    }
}
