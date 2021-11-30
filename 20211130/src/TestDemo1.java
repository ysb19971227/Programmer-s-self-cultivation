import java.util.*;

public class TestDemo1 {
    public int findJudge(int n, int[][] trust) {
        int[] trustValues = new int[n+1];
        for(int[] x : trust) {
            trustValues[x[0]]--;
            trustValues[x[1]]++;
        }
        for(int i = 1;i<= n;i++) {
            if(trustValues[i]== n-1) {
                return i;
            }
        }
        return -1;
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[] Unidimension = new int[m * n];
        for(int i = 0;i< m;i++) {
            for(int j = 0;j < n;j++) {
                Unidimension[(i * n + j + k)%(m * n)] = grid[i][j];
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        for(int i = 0;i < m;i++) {
            List<Integer> tmp = new ArrayList<>();
            for(int j = 0;j < n;j++) {
                tmp.add(Unidimension[index++]);
            }
            ans.add(tmp);
        }
        return ans;
    }
}
