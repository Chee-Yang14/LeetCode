public class LeetCode739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int holder = 0;
        int count = 0;
        int[] temp = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            holder = temperatures[i];
            for (int j = i; j <= temperatures.length-1; j++) {
                if (temperatures[j] > holder) {
                    temp[i] = count;
                    
                    count=0;
                    break;
                }else if(j==temperatures.length-1){
                    temp[i] = 0;
                    count=0;
                }else{
                    count++;
                }
            }
        }
        return temp;
    }
}
