public class Rational
{
   private int numerator;
   private int denominator;
   private int negate;
   private int invert;
   
   
   public Rational() {
       
       numerator = 1;
       denominator = 1; 

    }
    
    public Rational(int n, int d) {
        
        //Rational fraction = new Rational(3, 4);
        n = 4;
        d = 5;
    }
    
    
    
    
    public int getNumerator() {
     

        return numerator;
    }
    
    public int getDenominator() {

        
        
        return denominator;
    }
    
    public Rational negate() {
         int r = 4;
         Rational negate = -1;
       
        
        return r * negate;
        
    }
    
    
    public Rational invert() {
        
        denominator = numerator;
        numerator = 1;
      
        
        return (numerator) / (denominator);
    }
    
    
     public Rational add(Rational other) {
        
      int first = 4;
      int second = 5;
         
      other = first + second;
        
        return other;
    }
    
    
    public Rational subtract(Rational other) {
        
        int first = 4;
      int second = 5;
         
      other = first - second;
        
        
        return other;
    }
    
      public Rational multiply(Rational other) {
        
        int first = 4;
      int second = 5;
         
      other = first * second;
        
        
        return null;
    }
    
      public Rational divide(Rational other) {
        
      int first = 4;
      int second = 5;
         
      other = first / second;  
        
        
        return other;
    }
    
      public Rational normalize(Rational other) {
        other =  numerator / denominator;
        
        
        }
        
       private int gcd(int a,int b) {
              
              int result = 0;
              if(a < b) {
                  result = gcd(b,a);
                }
                else if(b==0) {
                    result = a;
                }
                else {
                    int remainder = a % b;
                result = gcd(b, remainder);
            }
            return result;
        }
    
    
    
    
    
    
    
}
