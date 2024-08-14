import java.util.ArrayList;
class Graph {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    Graph(int v)
    {
        for (int i = 0; i < v; i++)
        {
            list.add(new ArrayList<Integer>());
        }
    }
    public void push(int v, int u) {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public void dfs(int v)
    {
        boolean[] arr=new boolean[list.size()];
        dfs1(v,arr);
    }
    public void dfs1(int v,boolean[] arr)
    {
        System.out.println(v+" ");
        arr[v] =true;
        for(int i=0;i<list.get(v).size();i++)
        {
            int k=list.get(v).get(i);
            if(!arr[k])
            {
                dfs1(k,arr);
            }
        }
    }
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Vertex :" + i);
            for (int j = 0; j < list.get(i).size();j++) {
                System.out.println(list.get(i).get(j));
            }
        }
    }
    public static void main(String[] args)
    {
        Graph g= new Graph(5);
        g.push(0,1);
        g.push(2,4);
        g.push(0,2);
        g.push(0,3);
        g.display();
        System.out.print("DFS");
        System.out.println();
        g.dfs(0);
    }
}