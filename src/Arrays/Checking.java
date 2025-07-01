    package Arrays;

    public class Checking {
        public static void main(String[] args) {
            int[]arr = {0,1,0,3,12};

            for(int i =0;i<arr.length;i++){
                if(arr[i]!=0){
                    System.out.print(arr[i]+" ");
                }
            }
            for(int i =0;i<arr.length;i++){
                if(arr[i]==0){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }


    }
