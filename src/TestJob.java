import java.util.ArrayList;

public class TestJob {

  public static void main(String[] args) {

    Job j1 = new Job(4);
    Job j2 = new Job(3);
    Job j3 = new Job(1);
    Job j4 = new Job(2);

    ArrayList<Job> jobs = new ArrayList<Job>();
    jobs.add(j1);
    jobs.add(j2);
    jobs.add(j3);
    jobs.add(j4);

    System.out.println(jobs);

    // serve the job in the list one by one
    // each service is 2 hours
    while (jobs.size() > 0) {
      Job j = jobs.get(0);

      while (j.served(2) > 0) {
        System.out.println("serving " + j);
      }

      jobs.remove(0);
      System.out.println(j + " is finished.");
    }
  }
}
