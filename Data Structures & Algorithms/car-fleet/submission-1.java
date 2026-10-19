class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[] spd = new int[target]; // stores the speed for each position
        int n = speed.length;

        for (int i = 0; i < n; i++) {
            spd[position[i]] = speed[i];
        }

        // sorting the positions
        Arrays.sort(position);

        int distance = target - position[n - 1];
        float btime = distance / (float) spd[position[n - 1]];
        int fleet = n;

        for (int i = n - 2; i >= 0; i--) {
            distance = target - position[i];
            float time = distance / (float) spd[position[i]];
            if (time <= btime) {
                fleet--;
            } else {
                btime = time;
            }
        }
        return fleet;
























        /* double reqDistance = 0; // distance a car requires to travel at to reach target;
        // if 2 cars have same reqDistance/speed then they are a fleet
        double reqSpeed = 0; // reqSpeed = reqDistance / speed
        // if speed is 0 different fleet + 1;
        int count = position.length; // keeps track of number of fleets, we start with each car in own fleet
        int n = position.length; // number of cars
        Stack<Double> stack = new Stack<>(); // stores reqSpeed

        Arrays.sort(position);
        for (int i = 0; i < n; i++) {
            reqDistance = target - position[i];
            int carSpeed = speed[i];
            if (carSpeed == 0) break; //avoids div by zero error 
            reqSpeed = reqDistance / carSpeed;
            if (stack.contains(reqSpeed)) {
                count--; // means it will reach the target same
            // time as other car, thus we reduce fleet count
            // if time that is in stack is already greater than any upcoming, 
            // if reqSpeed => time is = or less than then it is same fleet as one ahead
            // if time is greater than in stack, its a new fleet starting
            } else {
                stack.push(reqSpeed);
            }
        }
        return count; */
    }
}
