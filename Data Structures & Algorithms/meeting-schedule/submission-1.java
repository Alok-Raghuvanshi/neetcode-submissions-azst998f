/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        
        int n=intervals.size();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j) continue;
                else
                {
                   
                    if(intervals.get(j).start>intervals.get(i).start&&intervals.get(j).start<intervals.get(i).end||intervals.get(j).end>intervals.get(i).start&&intervals.get(j).end<intervals.get(i).end||intervals.get(i).start==intervals.get(j).start&&intervals.get(i).end==intervals.get(j).end)
                    return false;
                }
            }
        }
        return true;
    }
}
