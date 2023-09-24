import java.util.Scanner;

public class Dinosaur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("TREX VS TRICEROTOPS");
        System.out.println("ENTER YOUR NEXT MOVE");
        String input = scan.nextLine();
        int trex = 100;
        int tri = 100;
        String[] moves ={"bite","punch"};

        if(input.equalsIgnoreCase(moves[0])){
            System.out.println("You bit the tri");
            tri = tri-60;
        } else if(input.equalsIgnoreCase(moves[1])){
            System.out.println("you pinched the tri");
            tri=tri-20;
        }
        System.out.println(tri);
    }
}
