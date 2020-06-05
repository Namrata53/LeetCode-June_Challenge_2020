/*There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.

 

Example 1:

Input: [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation: 
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.*/

//Subtarct City A cost from city B. If u sort based on it u will get first N lowest cost that u can assign to city A and rest to city B
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int cost = 0;
         Arrays.sort(costs, new Comparator<int[]>() {  //sorting based on A-B
          public int compare(int[] entry1,int[] entry2) { 
  
            if ((entry1[0] - entry1[1]) > (entry2[0] - entry2[1])) // comparing CityA - CityB
                return 1; 
            else
                return -1; 
          } 
        });  
        for(int i=0; i<costs.length/2; i++){
            cost += costs[i][0];
        }
         for(int i=costs.length/2; i<costs.length; i++){
            cost += costs[i][1];
        }
        return cost;
    }
}