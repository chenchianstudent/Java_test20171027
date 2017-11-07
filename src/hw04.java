import java.util.Scanner;

public class hw04 {
    public void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int data[] = {2, 3, 15, 46, 15};
        System.out.println("input:");
        int n=scn.nextInt();
        int n1=scn.nextInt();

        for(int i=0;i<data.length;i++){
            if(i>=n&&i<=n1){
                data[i]=0;
            }
        }
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }
}


