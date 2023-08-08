import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q1Graph1 {


    //DFS
    public static   void dfs(int adj[][],int cur,boolean vis[]){
    vis[cur]=true;
    System.out.print(cur+" ");
    for(int i=0;i< adj.length;i++){
        if(adj[cur][i]==1 && vis[i]==false){
           dfs(adj,i,vis);
        }
    }
    }
    public static void dfs(int adj[][]){
     boolean vis[]=new boolean[adj.length];

     for(int i=0;i< adj.length;i++){
         if(!vis[i]){
             dfs(adj,i,vis);
             System.out.println();
         }
     }
    }


    //BFS
    public static void bfs(int adj[][]){
    boolean vis[]=new boolean[adj.length];
    Queue<Integer> queue=new LinkedList<>();
    vis[0]=true;
    queue.add(0);
    while (!queue.isEmpty()){
    int cur= queue.poll();
    System.out.print(cur+" ");
    for(int i=0;i< adj.length;i++){
        if((adj[cur][i] == 1 && !vis[i])){
            queue.add(i);
            vis[i]=true;
        }
    }
    }
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
//        Scanner s=new Scanner(System.in);
        System.out.println("Enter the vertices");
        int v=s.nextInt();
        System.out.println("Enter the edges");
        int e= s.nextInt();
        int adjMatrix[][]=new int[v][v];

        for(int i=0;i<e;i++){
            int v1=s.nextInt();
            int v2=s.nextInt();
            adjMatrix[v1][v2]=1;
            adjMatrix[v2][v1]=1;
        }

//        for(int i=0;i<v;i++){
//            for(int j=0;j<v;j++){
//                System.out.print(adjMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }

        dfs(adjMatrix);
        bfs(adjMatrix);
    }

}
