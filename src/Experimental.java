import java.util.Arrays;
import java.util.List;

public class Experimental {
  private List<String> list;

  Experimental(List<String> list) {
    this.list = list;
  }

  public void printList() {
    for (String s : list) {
      System.out.println(s);
    }
  }
}
