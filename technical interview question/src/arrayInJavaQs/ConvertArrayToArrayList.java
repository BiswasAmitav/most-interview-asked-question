package arrayInJavaQs;
import java.util.Arrays;
import java.util.List;


public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        System.out.println("Conterting array to array List...");


        //Given string ...
        String[] colors = {"Red", "Green","Blue"};

        //first way to convet array to array LIst ...

        List list =Arrays.asList(colors);
        System.out.println(list);

        //second method..
  //      List<String> ls = new ArrayList<>();
//        Collections.addAll(ls,colors);
//        System.out.println(ls);



        //Third method....
//        for(String string:colors){
//            ls.add(string);
//        }
 //       System.out.println(ls);


    }
}
