import java.net.Socket;

public class Zadanie2 {
     public static int rentalCarCost(int d) {
        int sum = 0;
        for(int i=0; i<d;i++){
        sum+=40;
        }
        if(d>=7){
        sum-=50;
      }else if(d>=3){
        sum-=20;
      }
      
      
        return sum;
       
        
  }
  public static void main(String[] args) {
    System.out.println(rentalCarCost(10));
  }

    
}
