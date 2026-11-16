public class Diplomas {
    static boolean canFit(long m , long n, long w, long h) {
        long columns = m/w;
        long rows = m /h;

        return columns * rows >= n;
    }


    public long FindBox(long n , long w , long h) {
        long left = 0 ;
        //long right = 1_000_000_000_000_000_000L;
        long right = (long)1e18;

        while (left < right) {
            long mid = left + (right - left) / 2 ;

            if(canFit(mid, n, w, h)) {
                right = mid;
            } else {
                left = mid +1;
            }
        }
        return left;
    }
}
