import java.util.*;
import java.io.*;
public class p1{
  public static class Pair {
    String item;
    int weight;
     Pair(String item,int weight)
    {
      this.item=item;
      this.weight=weight;
    }
  }
  public static String[] sort(String[]items,int[]weights){
  PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(b.weight, a.weight));
  for(int i=0;i<items.length;i++)
  {
    pq.add(new Pair(items[i],weights[i]));

  }
  String[]ans=new String[items.length];
  int idx=0;
  while(!pq.isEmpty())
  {
    Pair p=pq.remove();
    ans[idx]=p.item;
    idx++;
  }
  return ans;

    
  }
public static void main(String args[])
{
 String[] items={"laptop","tv","phone","watch"};
 int[] weight={500,1000,250,50};
 String[] ans=sort(items,weight);
 for(String x:ans){
System.out.println(x+"");
 }
  
}
}

  
    