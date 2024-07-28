import java.util.*;

class UserMainCode {
    public int totalUnusedRoad(int n, int m, int[][] r) {
        int[][] dist = new int[n][n];

        // Initialize distance array with a large value representing infinity
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i] = 0; // distance to itself is zero
        }

        // Fill the distance array with the given road lengths
        for (int i = 0; i < m; i++) {
            int a = r[i][0] - 1;
            int b = r[i][1] - 1;
            int d = r[i][2];
            dist[a][b] = d;
            dist[b][a] = d; // Because the roads are bidirectional
        }

        // Floyd-Warshall algorithm to find all-pairs shortest paths
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        // Calculate total length of all roads
        int totalRoadLength = 0;
        for (int i = 0; i < m; i++) {
            totalRoadLength += r[i][2];
        }

        // Calculate the length of roads used in the shortest paths
        int usedRoadLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dist[i][j] != Integer.MAX_VALUE) {
                    for (int k = 0; k < m; k++) {
                        int a = r[k][0] - 1;
                        int b = r[k][1] - 1;
                        int d = r[k][2];
                        if (dist[i][j] == dist[i][a] + d + dist[b][j] ||
                            dist[i][j] == dist[i][b] + d + dist[a][j]) {
                            usedRoadLength += d;
                        }
                    }
                }
            }
        }

        // Calculate the total length of unused roads
        return totalRoadLength - usedRoadLength;
    }

    public static void main(String[] args) {
        UserMainCode solution = new UserMainCode();
        int n = 4;
        int m = 5;
        int[][] r = { {1, 2, 3}, {2, 3, 3}, {1, 4, 1}, {4, 2, 1}, {4, 3, 1} };
        System.out.println(solution.totalUnusedRoad(n, m, r)); // Output: 6
    }
}
