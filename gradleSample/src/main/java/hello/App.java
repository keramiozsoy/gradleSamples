package hello;
import org.joda.time.LocalTime;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello App !!!");
   
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

  }
}
