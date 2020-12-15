public class Job {
	private static int UNIQUE_ID;
	private int totalServedTime, servedTimeNeeded, testTime;
	int uid = ++UNIQUE_ID;
	public Job(int servedTimeNeeded) {
		this.servedTimeNeeded = servedTimeNeeded;
		testTime = servedTimeNeeded;
	}
	
	public int served(int servedTime) {
		if (servedTimeNeeded > servedTime) {
			totalServedTime += servedTime;
			servedTimeNeeded -= servedTime;
			return (servedTimeNeeded);
		}
		totalServedTime += servedTime;
		return (servedTimeNeeded*-1);
	}
	
	public String toString() {
		return uid+":("+testTime+","+totalServedTime+")";
	}
}
