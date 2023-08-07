import java.io.BufferedReader;
import java.io.FileReader;

public class ElevatorGuy {
    public static void main(String args[]){
        try {
            String path = "elevator_guy.in";
            BufferedReader lineReader = new BufferedReader(new FileReader(path));


            int floors = Integer.parseInt(lineReader.readLine());

            if (floors <= 0){
                System.exit(0);
            }

            int passengers = Integer.parseInt(lineReader.readLine());

            if (passengers <= 1){
                System.exit(0);
            }

            int pickup = 1; // The first pickup
            String outputs = "";
            int lastFloor = 1;

            for (int i=0;i<passengers;i++) {
                String xAndy = lineReader.readLine();
                int x = Integer.parseInt(xAndy.split(" ")[0]);
                int y = Integer.parseInt(xAndy.split(" ")[1]);

                //Check if it is first pickup
                if (outputs == ""){
                    if (x != pickup){
                        outputs += pickup+"F\n";
                    }
                }

                outputs += (x > 0 && x <= floors) ? x+"F\n" : "NONE\n";
                outputs += (y > 0 && y <= floors) ? y+"F\n" : "NONE\n";
                lastFloor = (y > 0) ? y : lastFloor;
            }

            if (lastFloor != 1){
                outputs += "1F\n";
            }

            System.out.println(outputs.trim());

            lineReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
