import java.util.Scanner;

class Robber{
    public static int houseRobber(int arr[]){
        int sum1=0,sum2=0;

        for (int i=0;i<arr.length;i+=2){
            sum1+=arr[i];
          
        }
        for (int i=1;i<arr.length;i+=2){
            sum2+=arr[i];

        }
        return sum1>=sum2?sum1:sum2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(houseRobber(arr));
    }
}