package softwaredesignlab4;

public class Date {
    
    public final int year, month, day;
            
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int dayTo(Date new_date){
        int total_days_this = (this.year * 365) + (this.month * 30) + (this.day);
        int total_days_new = (new_date.year * 365) + (new_date.month * 30) + (new_date.day);
        
        int difference = total_days_this - total_days_new;
        if(difference < 0){
            difference *= -1;
        }
    
        return difference;
    }
    
}
