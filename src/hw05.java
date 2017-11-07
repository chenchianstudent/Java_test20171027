import javafx.stage.StageStyle;

import java.util.Scanner;

public class hw05 {
    public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data[] = {2, 3, 15, 46, 15};
        System.out.println("input:");
        int n = scn.nextInt();

        for (int i = n; i < data.length; i++) {
            data[i + 1] = data[i];
        }
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }

}



