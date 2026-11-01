class lab12 {
    public int removeElementInplace(int[] arr, int val) {
        int idx = 0 ;
        for (int i = 0 ; i < arr.length ; i ++ ) {
            if (arr[i] != val) {
                arr[idx] = 0 ;
                idx++;
            }
        }
        return idx;
    }
}
