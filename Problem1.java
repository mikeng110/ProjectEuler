
package projecteuler;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mikael
 */
public class Problem1 {
    
    public Set<Integer> multipleOf(int n, int upperBound) {
        int multible = n;
        Set<Integer> temp = new HashSet<>();
        while(multible < upperBound) {
            temp.add(multible);
           
            multible += n;
        }
        
        return temp;
    }
    public Set<Integer> multipleOf(int n, int m, int upperBound) {
        Set multipleN = multipleOf(n,upperBound);
        Set multipleM = multipleOf(m, upperBound);
        multipleN.addAll(multipleM);
        return multipleN;
        
    }
}
