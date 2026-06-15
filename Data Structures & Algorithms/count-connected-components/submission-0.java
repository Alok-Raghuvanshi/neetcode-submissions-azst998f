class Solution {
    public int countComponents(int n, int[][] edges) {
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
          int count=0;
          for(int i=0;i<n;i++)
          {
            if(!vis[i])
            {
                dfs(i,vis,map);
                count++;
            }
          }
        return count;
    }
    void dfs(int node,boolean[] vis,HashMap<Integer,List<Integer>> map)
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
