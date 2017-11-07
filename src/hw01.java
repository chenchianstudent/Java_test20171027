
public class hw01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int data[] = {2, 3, 15, 46, 15};
        int data1[] = new int[5];

        for (int i = 0; i < data1.length; i++) {
            data1[i] = data[i];
            if (data1[i]==0) {
                System.out.print(i);
                break;
            }


        }

    }

}
