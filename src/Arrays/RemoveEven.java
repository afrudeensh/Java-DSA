package Arrays;

public class RemoveEven {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,90,10,11,67,87,37,88,50,0,12};
        int count =0;
        for(int no : arr){
            System.out.print(no +" ");
        }
        System.out.println();
        for(int num :arr){
            if(num  % 2!=0){
                System.out.print(num+ " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
