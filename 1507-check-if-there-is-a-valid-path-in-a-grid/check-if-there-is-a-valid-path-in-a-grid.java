class Solution {
    int[][][] d = {
        {},
        {{0,-1},{0,1}},
        {{-1,0},{1,0}},
        {{0,-1},{1,0}},
        {{0,1},{1,0}},
        {{0,-1},{-1,0}},
        {{0,1},{-1,0}}
    };

    public boolean hasValidPath(int[][] g) {
        int m = g.length, n = g[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] v = new boolean[m][n];
        q.offer(new int[]{0,0});
        v[0][0] = true;

        while(!q.isEmpty()) {
            int[] p = q.poll();
            int x = p[0], y = p[1];
            if(x == m-1 && y == n-1) return true;

            for(int[] k : d[g[x][y]]) {
                int nx = x + k[0], ny = y + k[1];
                if(nx>=0 && ny>=0 && nx<m && ny<n && !v[nx][ny]) {
                    for(int[] z : d[g[nx][ny]]) {
                        if(z[0]==-k[0] && z[1]==-k[1]) {
                            v[nx][ny]=true;
                            q.offer(new int[]{nx,ny});
                        }
                    }
                }
            }
        }
        return false;
    }
}