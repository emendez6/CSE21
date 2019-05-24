package oop;

public class SeasonCounter extends ModNCounter {

private static String[] names =  {"spring", "summer", "fall", "winter"};
public SeasonCounter() {
super (4);
        // fill-in by creating an object with 4 divisor
    }

@Override
public String toString() {
if (super.value() == 0){
return "spring";
}
if (super.value() == 1){
return "summer";
}
if (super.value() == 2){
return "fall";
}
if (super.value() == 3){
return "winter";
}
return null;
        // fill-in so it returns the season name
}
  
}
