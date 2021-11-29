import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static int findJudge(int n, int[][] trust) {
        int[] trustValues = new int[n+1];
        for (int[] x:trust) {
            trustValues[x[0]]--;
            trustValues[x[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trustValues[i] == n-1) {
                return i;
            }
        }
        return -1;
    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[] arr = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[(i * n + j + k) % (m * n)] = grid[i][j];
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> path = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                path.add(arr[index++]);
            }
            ans.add(path);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] trust = new int[][] {
                {1,3},
                {2,3}
        };
        System.out.println(findJudge(3, trust));
    }
}
