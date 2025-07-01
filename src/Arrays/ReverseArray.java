package Arrays;

public class ReverseArray {
        public static void main(String[]args) throws ArrayIndexOutOfBoundsException{
            int[] num = {1, 20, 30, 40, 5, 60};
           for(int i = (num.length)-1;i>=0;i--){
               System.out.print(num[i] + " ");
           }
        }
}
