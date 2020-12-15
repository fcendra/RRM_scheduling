public class RRSimulation {
 
  // NO MORE INSTANCE VARIABLE CAN BE DEFINED
  private Ring jobs;

  // DO NOT MODIFY THE CONSTRUCTOR
  public RRSimulation() {
    jobs = GenJob.genInitJobList();
    System.out.println("The original job list is:");
    System.out.println(jobs);
  }
  
  public void run(int unit) {
	  int totalTimeAfterExecution = 0;
	  while(jobs.size() != 0) {
		  Job currentJob = (Job) jobs.getCurrObj();
		  totalTimeAfterExecution += unit;
		  System.out.println("Job being served: "+currentJob);
		  if (currentJob.served(unit) <= 0) {
			  System.out.println(currentJob+" is done.");
			  jobs.removeCurrObj();
		  }
		  else{
			  jobs.advance();
		  }
		  System.out.println("The current job list is: "+jobs);
	  }
	  System.out.println("All jobs finished after "+totalTimeAfterExecution+" hours.");
  }
}
