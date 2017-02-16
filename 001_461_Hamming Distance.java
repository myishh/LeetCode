/***
 * This problem tests the knowledge of bitwise operation. And, Or, Not, XOR
 * @author myishh
 * Thinking:
 * 1) Get the last bit of x and y, XOR their last bits, and the count the number of 1s in the result
 * 2) XOR x and y, we have the result, and then count the last bit by &1 and move one bit to right.
 * Trick: if you want to get the last bit's value, just And with 1, i.e. x&1
 */

public class HammingDistance_461 {

	public static void main(String[] args) {
		System.out.println(HammingDistance(1, 4));
		System.out.println(HammingDistance(75, 88));
	}
	
	//XOR x and y, then count the result by &1 and moving to right
	public static int HammingDistance(int x, int y){
		
		int cnt = 0;
		int res = x ^ y;
		
		while( res!=0 ) {
			if ((res & 1) == 1){
				cnt++;				
			}
			res>>=1;			
		}
		return cnt;
	}

}
