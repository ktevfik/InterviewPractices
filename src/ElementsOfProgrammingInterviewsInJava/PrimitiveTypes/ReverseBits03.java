/*
 * Copyright (c) 2.09.2021 17:25.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;
import static ElementsOfProgrammingInterviewsInJava.PrimitiveTypes.SwapBits02.swapBits;
public class ReverseBits03 {
    public static void main(String[] args) {
        System.out.println(reverseBits((long)73));
        System.out.println(reverseBits((int) 73));
        System.out.println(reverseBits((short) 73));
    }
    public static long reverseBits(long x) {
        int f = 0,k = 63;
        for(int i = 0;i <= 32;i++) {
            x = swapBits(x,f++,k--);
        }
        return x;
    }
    public static int reverseBits(int x) {
        int i  = 0, j = 31;
        for (int k = 0; k <= 16; k++) {
            x = (int)swapBits(x,i++,j--);
        }
        return x;
    }
    public static short reverseBits(short x) {
        int i  = 0, j = 15;
        for (int k = 0; k <= 8; k++) {
            x = (short) swapBits(x,i++,j--);
        }
        return x;
    }
}
