import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Human {
    void eat(String dish, String curry);

}

// class A implements Runnable {
// public void run() {
// for (int i = 0; i < 5; i++) {
// System.out.println("Hi ");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
// }
// }

// class B implements Runnable {
// public void run() {
// for (int i = 0; i < 5; i++) {
// System.out.println("Hello ");

// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
// }
// }

// SOLUTION FOR RACE CONDITION
// class A{
// int counter ;

// public synchronized void Increment(){
// counter++;
// }
// }

public class App {
    public static void main(String[] args) throws Exception {

        // Human obj = (dish , curry) -> System.out.println("Im eating " + dish + " with
        // " + curry);

        // obj.eat("biryani" , "raitha");

        // RUNNABLE INTERFACE
        // A obj1 = new A();
        // B obj2 = new B();

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();

        // Using Anonmyous inner class

        // Runnable obj1 = new Runnable() {
        // public void run() {
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hi ");

        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {

        // e.printStackTrace();
        // }
        // }
        // }
        // };
        // Runnable obj2 = new Runnable() {
        // public void run() {
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello ");

        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {

        // e.printStackTrace();
        // }
        // }
        // }
        // };

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();

        // RACE CONDITION DEMO

        // A countA = new A();

        // //USING LAMBDA EXPRESSION

        // Runnable obj1 = () -> {
        // for (int i = 0; i < 10000; i++) {
        // countA.Increment();
        // }

        // };
        // Runnable obj2 = () -> {
        // for (int i = 0; i < 10000; i++) {
        // countA.Increment();

        // }

        // };

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();

        // t1.join();
        // t2.join();

        // System.out.println("counter : " + countA.counter);

        // Object elements
        // List nums = new ArrayList();

        // specific elemenst => Integer

        // Set<Integer> nums = new HashSet<Integer>();

        // nums.add(755);
        // nums.add(5);
        // nums.add(6);
        // nums.add(2);
        // nums.add(567);
        // nums.add(6);

        // System.out.println(nums.get(3) );

        // USING ITERATOR
        // Iterator nums2 = nums.iterator();

        // while(nums2.hasNext()){
        // System.out.println(nums2.next());
        // }

        // for(int a : nums){
        // System.out.println( a);
        // }

        // MAP INTERFACE

        // Map<String, Integer> menu = new LinkedHashMap<>();

        // menu.put("Biryani" , 200);
        // menu.put("Roti" , 20);
        // menu.put("Panner" , 450);
        // menu.put("C curry", 90);

        // System.out.println(menu.get("Roti"));

        // System.out.println( menu.containsKey("Biryani"));

        // System.out.println(menu.keySet());

        // for(String dish : menu.keySet()){
        // System.out.println(menu.get(dish));
        // }

        // System.out.println(menu);

        // Comparator<Integer> comp = (i, j) -> i % 10 > j % 10 ? 1 : -1;

        // List<Integer> nums = new ArrayList<>();

        // nums.add(45);
        // nums.add(31);
        // nums.add(67);
        // nums.add(22);

        // Collections.sort(nums , comp);

        // System.out.println(nums);

        // List<Student> studs = new ArrayList<>();

        // studs.add(new Student(25, "Yash"));
        // studs.add(new Student(12, "Raj"));
        // studs.add(new Student(6, "Pappu"));
        // studs.add(new Student(16, "Kiran"));

        // // comparotor
        // Comparator<Student> scomp = ( o1,  o2) -> o1.age>o2.age ? 1 : -1;
                

            

        
        // Collections.sort(studs,scomp);

        // for (Student s : studs) {
        //     System.out.println(s);
        // }














            // for(int i : nums){
            //     System.out.println(i);
            // }

            // Consumer<Integer> con =  i -> System.out.println(i);

             

            // nums.forEach(con);
            // nums.forEach(n -> System.out.println(n));







        List<Integer> nums = Arrays.asList(2,6,9,4,77,861);



        Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
                if(n%2 == 0){
                    return true;
                }
                else
                {
                    return false;
                }
            }
            
        };

        Function<Integer , Integer> fun = new Function<Integer,Integer>() {

            @Override
            public Integer apply(Integer n) {

                return n*2;
                
            }
            
        };

        Stream<Integer> s1 =  nums.stream();

        Stream<Integer> s2 =  s1.filter(p);

        Stream<Integer> s3 =  s2.map(fun);

         Integer result =  s3.reduce(0,(c,e) -> c+e );

        // s3.forEach(n -> System.out.println(n));

        //System.out.println(result);


        int res = nums.stream()
            .filter(n -> n%2 ==0 )
            .map(n -> n*2)
            .reduce(0,(c,e) -> c+e );


        // System.out.println(res);




























        List<Integer> arr = Arrays.asList(2,3,8);

        int filterSum = arr.stream()
            .map(n -> n*2)
            .filter(n -> n==4)
            .reduce(0,(c,e) -> c+e);


        Stream<Integer> filterValues = arr.stream()
            .map(n -> n*2)
            .filter(n -> n==4);


        // System.out.println( "Sum : " + filterSum);

        // filterValues.forEach(n -> System.out.println(n));




        List<String> names =  Arrays.asList("yash" , "ram" , "kiran" , "john");


        
        List<String> filteredNames = names.stream()
            .filter(n -> n.contains("a"))
            .map(n -> n.toUpperCase())
            .collect(Collectors.toList());


        System.out.println(filteredNames);

































    }

}

class Student /*implements Comparable<Student> */ {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return this.name + " : " + this.age;
    }

    // @Override
    // public int compareTo(Student that) {

    //     if (this.age > that.age) {
    //         return 1;
    //     } else {
    //         return -1;
    //     }
    // }
}
