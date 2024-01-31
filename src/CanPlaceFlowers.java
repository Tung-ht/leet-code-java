class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }

    // greedy algo
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            n--;
        } else if (flowerbed.length == 1 && flowerbed[0] == 1) {
            return n <= 0;
        } else {
            for (int i = 0; i < flowerbed.length; i ++) {
                if (i == 0 && flowerbed[i] == 0  && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if (i == flowerbed.length - 1 && flowerbed[i-1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if (i > 0 && i < flowerbed.length - 1 && flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}