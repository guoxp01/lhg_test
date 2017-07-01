package htf;

public class ParallelSpeedup 
{
	public int numProcessors(int k, int overhead)
	{
		int c = 0;
		for(int i=1;i<=k;i++)
		{
			int sum = 0;
			for(int j=1;j<i;j++)
			{
				sum += j*overhead;
			}
			if(sum > k)
				break;
			c = i;
		}
		int minTime = k*overhead;
		int min = 0;
		for(int i=1;i<=c;i++)
		{
			int sum = 0;
			for(int j=1;j<i;j++)
			{
				sum += j*overhead;
			}
			sum +=  (k%i == 0 ? k/i : k/i +1);
			if(sum < minTime)
			{
				minTime = sum;
				min = i;
			}
		}
		return min;
	}
}
