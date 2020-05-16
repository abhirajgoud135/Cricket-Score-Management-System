public class scoreEvaluation{
	public int eval(int ...a){
		int sum=0;
		for(int i:a){
			sum+=i;
			if(i<0 && i>=6)
				return -1;
		}
		return sum;
	}
}
