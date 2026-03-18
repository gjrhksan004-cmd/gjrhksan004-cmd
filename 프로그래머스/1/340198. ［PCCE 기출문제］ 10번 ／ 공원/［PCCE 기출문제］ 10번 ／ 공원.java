import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Integer[] sortedMats = Arrays.stream(mats).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedMats, (a, b) -> b - a);
        
        int rows = park.length;
        int cols = park[0].length;
        
        for (int size : sortedMats) {
            for (int r = 0; r <= rows - size; r++) {
                for (int c = 0; c <= cols - size; c++) {
                    if (canPlace(park, r, c, size)) {
                        return size; 
                    }
                }
            }
        }
        
        return -1; 
    }
    
    
    boolean canPlace(String[][] park, int r, int c, int size) {
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false; 
                }
            }
        }
        return true;
    }
}

