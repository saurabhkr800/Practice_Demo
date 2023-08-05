package assignment_18_05;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;

public class College {
    public static void main(String[] args) {
        LinkedHashMap<StudentMarks,Integer> college=new LinkedHashMap<>();
      Student student1=new Student(1401,"prashanth","mech",95.5,85.7,90.5,87.8);
        Student  student2=new  Student (1401,"prashanth","mech",95.5,85.7,90.5,87.8);
        college.put(student1,1);
        college.put(student2,2);
//     ListIterator<StudentMarks> arr1=college.listIterator();
//        while (arr1.hasNext()){
//            if(arr1.next().getMaths().equals(arr1.hasNext())){
//                arr1.remove();
//            }
//        }
        System.out.println(college);
        System.out.println(college.size());
    }
}
