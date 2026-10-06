import java.util.*;

class DepthFirstSearch {

    static List<List<Integer>> tree = new ArrayList<>();

    static void dfs(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int child : tree.get(node)) {
            if (!visited[child]) {
                dfs(child, visited);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of nodes
        int n = sc.nextInt();

        // Create adjacency list
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        // Number of edges
        int edges = sc.nextInt();

        // Take edges as input
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            tree.get(u).add(v);
            tree.get(v).add(u);
        }

        // Starting node
        int start = sc.nextInt();

        boolean[] visited = new boolean[n + 1];

        // DFS
        dfs(start, visited);
    }
}