// A program for creating pairings

public class brackets {

public int num-players;

  public static void main(String[] args) {
    DataInputStream in = new DataInputStream(System.in);
    System.out.println("enter # players:");

    num-players = Integer.parseInt(in.readln());
    player players[numPlayer];

    //initialize players
    for(int i; i<numPlayers; i++){
      System.out.print("name:");
      players[i].changeName(in.readln());

    }
  }


  player players[numPlayer];
}