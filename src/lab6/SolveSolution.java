public class SolveSolution {
    double Solution(double a) {
        double left = 0;
        double right = 100000;
        while(right - left > 0.0000001) {
            double mid = (right + left) / 2;

            double result = mid * mid - mid + Math.sqrt(mid);

            if( result < a ) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return (left+right) /2 ;
    }
}
