import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int [] nums=new int[n];
        int left=0;
        int right=0;
        int result=100001;
        int sum=0;

        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        while(true){
            if(sum>=s){
                sum-=nums[left];
                result=Math.min(result, (right - left));
                left++;
            } else if(right==n){
                break;
            } else{
                sum+=nums[right++];
            }
        }
        
        if(result==100001){
            result=0;
        }

        System.out.println(result);
    }
}
