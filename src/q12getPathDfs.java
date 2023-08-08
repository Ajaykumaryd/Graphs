import java.util.ArrayList;
import java.util.Scanner;



public class q12getPathDfs {

       public static ArrayList<Integer> getPath(int adjMatrix[][],int s,int e,ArrayList<Integer>ans,boolean []vis){

        if(s==e){
        ArrayList<Integer>temp=new ArrayList<>();
        temp.add(e);
        return temp;
        }

        for(int i=0;i< adjMatrix.length;i++){
            if(adjMatrix[s][i]==1 && vis[i]==false){
                vis[i]=true;
               ArrayList<Integer>obj=getPath(adjMatrix,i,e,ans,vis);
               if(obj!=null){
                   obj.add(i);
                   return obj;
               }
            }
        }
        return null;
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
        System.out.println("Enter the start");
        int st=s.nextInt();
        System.out.println("Enter the end");
        int ed=s.nextInt();

        ArrayList<Integer> ans= new ArrayList<>();
        boolean vis[]=new boolean[adjMatrix.length];
        ans=getPath(adjMatrix,st,e,ans,vis);

            if(ans!=null){
            for(int element:ans){
            System.out.println(element+" ");
        }
        }

    }
}
