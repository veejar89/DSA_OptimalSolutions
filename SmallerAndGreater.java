public class SmallerAndGreater {
    public int solve(int[] A) {
        int max = 0, min = 1000001;
        for(int i : A){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int ans = 0;
        for(int i : A){
            if(i > min && i < max)
                ans++;
        }
        return ans;
    }
}
