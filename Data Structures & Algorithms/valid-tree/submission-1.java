// Method 1 (Elegant)
// Check edges = n-1
// DFS/BFS connectivity check
class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n-1)
        return false;
         int r=edges.length;
         boolean vis[]=new boolean[n];
         HashMap<Integer,List<Integer>>map=new HashMap<>();
         for(int i=0;i<n;i++)
          {
         map.put(i,new ArrayList<>());
          }
          for(int i = 0; i<edges.length; i++)
          {
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
          }
          dfs(0,vis,map);

        for(boolean v : vis)
        {
            if(!v)
                return false;
        }

        return true;
    }

    void dfs(int node,
             boolean[] vis,
             HashMap<Integer,List<Integer>> map)
    {
        vis[node] = true;

        for(int nei : map.get(node))
        {
            if(!vis[nei])
            {
                dfs(nei,vis,map);
            }
        }
    }
}
