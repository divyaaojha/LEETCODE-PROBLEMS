class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalfuelrequired=0;  // to complete the journey
        int currenttankvalue=0;
        int startindex=0;

        for(int i =0; i<gas.length ; i++){
            int diff = gas[i]-cost[i];

            totalfuelrequired += diff;
            currenttankvalue += diff;

            if(currenttankvalue  < 0){
                startindex = i+1;  //the prev and all points till i - are also invalid
                currenttankvalue=0; //updated it to 0, to begin again
            }

        }

        return (totalfuelrequired >=0 ? startindex: -1);

        //MY APPROACH ---- TOTALLY WRONG
        // int n = gas.length;

      
        // int index =0;

        // for(int i =0; i<n; i++){
        // int tank=0;
        // int price=0;

        //     if(gas[i] >= cost[i]){

        //         index = i;
        //         tank -=price +gas[(i+1)%n];
        //         price += cost[i];

        //         int j =index;


        //         do{
                   
        //             tank -=price +gas[(j+1)%n];
        //             price += cost[j];
        //              j= (j+1)%n;

        //         }
        //         while(j != index && tank>=price);
        //         if(j==index){
        //             return j;
        //         }

        //     }
        // }

        // return -1;
    }
}  