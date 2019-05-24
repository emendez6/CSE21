package oop;

public class DecrementableCounter extends Counter {

public void decrement() {
int myN = super.value();
if (myN > 0){
super.reset();
while(super.value() < (myN -1)){
super.increment();
}
}
}

}