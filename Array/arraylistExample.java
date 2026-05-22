import java.util.ArrayList;
public class arraylistExample {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");   
        list.add("Java");   
        System.out.println(list);
        list.set(0, "Hi");
        System.out.println(list);
        list.add(1, "Everyone");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(1));
    }
    
}
