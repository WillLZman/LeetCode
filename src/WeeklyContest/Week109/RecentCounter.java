package WeeklyContest.Week109;

class RecentCounter {

    int ping = 0;
    long currentMilliTime = System.currentTimeMillis();
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);
        recentCounter.ping(100);
        recentCounter.ping(3001);
        recentCounter.ping(3002);

    }
        public RecentCounter() {
            System.out.println(currentMilliTime);

        }
        public int ping(int t) {
        long pastMilliseconds = currentMilliTime-3000;
            System.out.println(pastMilliseconds);
        if (pastMilliseconds>(t-3000)){
            ping ++;

        }
        System.out.println(ping);
        return ping;
        }

}




/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

