class Solution {
    public double angleClock(int hour, int minutes) {
        double hrDeg = (hour*30) + (minutes*0.5);
        double minDeg = (minutes*6);
        double angBet = Math.abs(hrDeg - minDeg);
        return Math.min(angBet, 360-angBet);
    }
}