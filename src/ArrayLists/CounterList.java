    package ArrayLists;

    import java.util.ArrayList;
    import java.util.List;

    public class CounterList {
        public static void main(String[] args) {
            List<String> countList = new ArrayList<>();
            countList.add("a");
            countList.add("b");
            countList.add("a");
            countList.add("c");
            countList.add("d");
            countList.add("d");
            countList.add("c");
            countList.add("a");
            countList.add("e");

            int countA =0;
            int countB =0;
            int countC = 0;
            for(String cn: countList){
                if(cn.equals("a"))
                    countA++;
                else if(cn.equals("c"))
                    countB++;
                else if(cn.equals("d"))
                    countC++;
            }
            System.out.println("Occurance of a "+ countA);
            System.out.println("Occurance of c "+countB);
            System.out.println("Occurance of d "+countC);
        }
    }
