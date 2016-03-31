// Task: Compute Euler's number (number e) using sum of series: e = 1/0!+1/1!+1/2!+1/3!+...
public class NumberE {
    public static void main(String args[]) {  
        // iMax = number of terms in the series.
        // the series converges so fast that iMax=20 is anough to get number e to 15 sf.
        int iMax = 20;      
        double e = 1.0;
        double factorial = 1.0;
        // start from i=1 to handle 0!.
        for(int i=1; i<iMax; i++)  {
            factorial *= i;
            e += 1.0/factorial; 
        }        
        System.out.println(e);
}}