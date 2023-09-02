public class player(string name{{

  private int wins = 0;
  private int losses = 0;
  public string name;

  public void win {
    wins++;
  }

  public void loss {
    losses--;
  }

  public changeName(string nName){
    name = nName;
  }

  public int getWins(){
    return wins;
  }

  public int getLosses(){
    return losses;
  }
}