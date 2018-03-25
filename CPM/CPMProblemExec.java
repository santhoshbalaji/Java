public class CPMProblemExec{
	public static void main(String args[]) throws Exception{
		String problemName = args[0];//path to file where the data is stored
		CPMProblem problem = new CPMProblem(problemName);
		System.out.println(problem);
		System.out.println(problem.getCriticalPath());
		/*problem.fillESEF();
		problem.fillLFLS();
		problem.calculateCriticalPath();
		problem.displayResults();*/
	
	}


}
