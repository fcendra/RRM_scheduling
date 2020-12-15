import java.util.ArrayList;

public class GenJob {

  private static MyRandom rand = new MyRandom();
  private static final int MINTIME = 1; // minimum time needed to serve
  private static final int MAXTIME = 4; // maximum time needed to serve

  public static Job genOneJob() {
    int timeNeeded = MINTIME + rand.nextInt(MAXTIME-MINTIME+1) - 1;
    return new Job(timeNeeded); 
  }

  // generate n jobs
  public static Ring genJobList(int n) {
    ArrayList<Job> list = new ArrayList<Job>();

    for (int i = 0; i < n; i++)
      list.add(genOneJob()); 

    Ring ring = new Ring();
    ring.addObj(list.remove(0));
    while (list.size() != 0) ring.addObj(list.remove(list.size()-1));

    return ring;
  }

  public static Ring genInitJobList() {
    return genJobList(5);
  }
}
