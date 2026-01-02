import java.lang.Math;

class Time{
    int hours;
    int minutes;
    int seconds;
    
    //default constructor 
    //hms constructor 
    Time(){
        this.hours =0;
        this.minutes=0;
        this.seconds=0;
    }
    
    //hms constructor
    Time(int h,int m,int s){
        this.hours = h;
        this.minutes=m;
        this.seconds=s;
        //normalize prevents the overflow of minutes and seconds
        normalize();
    }
    
    //seconds constructor
    Time(int Seconds){
        this.hours = Seconds/3600;
        this.minutes = (Seconds/3600)%60;
        this.seconds = Seconds%60;
    }
    
    //helper method normalie 
    
    public void normalize(){
        if(this.seconds>=60){
            this.minutes+=this.seconds/60;
            this.seconds = this.seconds%60;
        }
        
        if(this.minutes>=60){
            this.hours +=this.minutes/60;
            this.minutes= this.minutes%60;
            
        }
    }
    
    //method to add time
    
    public Time Add(Time other){
        int hoursH = this.hours+other.hours;
        int minutesH = this.minutes+other.minutes;
        int secondsH = this.seconds + other.seconds;
        
        int totalSeconds = (hoursH*3600)+(minutesH*60)+secondsH;
        
        return new Time(totalSeconds);
    }
    
    //method to subtract time 
    
    public Time Subtract(Time other){
        int totalSeconds1 = (this.hours*3600)+(this.minutes*60)+this.seconds;
        int totalSeconds2 = (other.hours*3600)+(other.minutes*60)+other.seconds;
        
        int totalSeconds = Math.abs(totalSeconds1-totalSeconds2);
        
        return new Time(totalSeconds);
    }
    
    //display Time 
    
    public void display(){
        System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);
    }

}

//main driver function 

public class Main{
    public static void main(String[]args){
        Time t1 = new Time(1,40,38);
        Time t2 = new Time(4,45,28);
        
        Time t3 = t1.Add(t2);
        
        t3.display();
    }
}

