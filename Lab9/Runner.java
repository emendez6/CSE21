package oop;

public class Runner {

public static void main(String[] args) {
testCounter();

testCounter7Statements();

testModNCounter2();
}
public static void testModNCounter2(){
System.out.println("-- testing ModNCounter2");

ModNCounter2 c = new ModNCounter2(2);
c.increment();
c.increment();
System.out.println(c.value());


}

public static void testCounter() {
System.out.println("-- testing Counter");


Counter c = new Counter();

c.increment();
c.increment();
c.increment();
System.out.println(c.value());



}


// Use this method to complete exercise 1c
public static void testCounter7Statements() {
Counter c = new Counter();
System.out.println("-- testing 7 statements");
// include exactly 7 increment() and reset() statements below
c.increment();
c.increment();
c.increment();
c.reset();
c.increment();
c.increment();
c.increment();

System.out.println("current value: " + c.value());

}


}
