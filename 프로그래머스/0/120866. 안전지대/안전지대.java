// Solution.java
class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] danger = new boolean[n][n];

        int[] dx = {-1,-1,-1,0,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,0,1,-1,0,1};

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    for(int d = 0; d < 9; d++){
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        if(nx >= 0 && ny >= 0 && nx < n && ny < n){
                            danger[nx][ny] = true;
                        }
                    }
                }
            }
        }

        int answer = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!danger[i][j]){
                    answer++;
                }
            }
        }

        return answer;
    }
}