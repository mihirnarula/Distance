package distance;
import java.util.*;
public class Distance {

    int km;
    int mtr;
    // method to input distance
    void input(){
        // create scanner object
        Scanner sc = new Scanner(System.in);
        // input distaance in kilometers
        System.out.println("Enter distance in kilometers: ");
        km = sc.nextInt();
        // input distaance in meters
        System.out.println("Enter distance in meters: ");
        mtr = sc.nextInt();
        }
    
// adding the distance by coverting meters to kilometers
    void AddDistance(Distance d1, Distance d2){
        
        km = d1.km + d2.km;
        mtr = d1.mtr + d2.km;
        
        if(mtr > 1000){
            mtr-=1000;
            km++;
        }
    }
    // method to display final distance
    void display(){
        System.out.println("Total distance = \t" +km+ "Km\t" +mtr+ "m");
    }
       // main to create objects and call methods     
    public static void main(String[] args) {
        
        Distance a = new Distance();
        Distance b = new Distance();
        a.input();
        b.input();
        Distance c = new Distance();
        c.AddDistance(a, b);
        c.display();
    }
    
}
