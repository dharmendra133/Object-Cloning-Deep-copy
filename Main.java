package ObjectCloning_DeepCopy;
import java.util.*;
import java.lang.*;
public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1=new Student(1,"Dharmendra","Mirchaiya");
        System.out.println(Arrays.toString(s1.arr));
        Student s2=(Student) s1.clone();
        System.out.println(Arrays.toString(s2.arr));
        s2.arr[0]=100;
        System.out.println(Arrays.toString(s1.arr));
        System.out.println(Arrays.toString(s2.arr));
    }
}
