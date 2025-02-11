/*
 Explanation to my approach :
  according to our question then our main goal is to determine  type of ticket you will receive based on ur speed.
  if in case if the driver's birthday the we will get a offer that is -5 of given ticket example:
  if your speed is 65 and if that is your birtday then 65-5=60 (reached a limit )-so no fine 

  so we have to apply a condition 


 */

 class car {
     int speed;
     boolean bday;

    public void car(int speed, boolean bday) {
        this.speed = speed;
        this.bday = bday;
    }
        public int speed() {
            int res = speed;
            if (bday) {
                res -= 5;
            }
            if (res <= 60) {
                return 0;
            } else if (res <= 80) {
                return 1;
            } else {
                return 2;
            }
        }
    }
    
    public class assessment {
        public static void main(String[] args) {
            car driver = new car();
            driver.car(62, true);
        System.out.println(driver.speed());


    }
}