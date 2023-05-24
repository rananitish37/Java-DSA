public class nRopesWithMinCost 
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        long res=0;
        while(pq.size()>1){
            long first=pq.poll();
            long second=pq.poll();
            res+=first+second;
            pq.add(first+second);
        }
        return res;
    }

}
