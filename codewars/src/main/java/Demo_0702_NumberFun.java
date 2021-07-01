/**
 * TODO
 *
 * @author ming
 * @date 2021/7/2 0:58
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class Demo_0702_NumberFun {
    public static void main(String[] args) {
    }

    @Test
    public void test1(){
        assertEquals(144, findNextSquare(121));
        assertEquals(676, findNextSquare(625));
        assertEquals(-1, findNextSquare(114));
    }

    public static long findNextSquare(long sq){
        /*double sqrt = Math.sqrt(sq);
        long long1 = (long) sqrt;
        long next = long1;
        if (sqrt - long1 == 0){
            next += 1;
            return next*next;
        }else {
            return -1;
        }*/
        /*long sqrt = (long) Math.sqrt(sq);
        return sqrt * sqrt == sq ? (sqrt + 1)*(sqrt + 1) : -1;*/
        long result = (long)Math.sqrt(sq);
        return result * result == sq ? (result + 1 ) * ( result + 1 ):-1;
    }
}
