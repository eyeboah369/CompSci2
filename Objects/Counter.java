public class Counter
{
    
    private int counter;
   public Counter() {
       int minimum = 0;
    int maximum;
       
    }
    
    public Counter(int min, int max) {
        int counter = min;
        min = 1;
        max = 20;
    }
    
    public boolean equals(Object otherObject) {
        int object = 2;
      boolean result = true;
      if(otherObject instanceof Counter) {
          object = otherObject;
          
        }
        return object;
        
        
    }
    
    
    public void decrease() {
    
        int add;
        while(counter > 0) {
            counter += add;
            add++;
        }
        
    
    
    }
    
    
    
    public boolean rolledOver() {
        
        return false;
    }
    
    
    public String toString() {
        
        String message = "The object is in a usable state";
        
        return message;
        
    }
    
    
    
}
    
    
