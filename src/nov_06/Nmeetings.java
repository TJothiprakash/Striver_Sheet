package nov_06;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Meeting{
    int start;
    int end;
    int index;
    public Meeting(int start, int end, int index){
        this.start=start;
        this.end=end;
        this.index=index;
    }

}
public class Nmeetings {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int n=6;
        List<Integer> meetingOrder= maxMeetings(start,end,n);
        System.out.println(meetingOrder);
    }

    private static List<Integer> maxMeetings(int[] start, int[] end, int n) {
        List<Meeting> meetings= new ArrayList<>();
        for(int i=0;i<n;i++){
            meetings.add(new Meeting(start[i],end[i],i+1));
        }
        Collections.sort(meetings, Comparator.comparingInt((Meeting m) -> m.end)
                .thenComparingInt(m -> m.index));
    List<Integer> result= new ArrayList<>();
    int limit=0;
    for(Meeting meeting:meetings){
        if(meeting.start >limit){
            result.add(meeting.index);
            limit=meeting.end;
        }
    }
    return result;
    }
}
