package oop;

public class ModNCounter2  extends Counter {


    private int cycleLength; 

    public ModNCounter2 (int n) { 
    cycleLength = n; 
    }  

    
    public void increment ( ) { 
    
    if(super.value () < cycleLength -1 )
    super.increment();
    else
    super.reset();
    
}
}