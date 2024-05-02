package com.thread.lab_9;

class PrimeNumber implements Runnable
{
	private int start, end, primeSum=0;
	

	public PrimeNumber(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() 
	{
		for(int i = start; i <= end; i++)
		{
			if(isPrime(i))
			{
				primeSum = primeSum + i;
			}
				
		}		
	}
	
	private boolean isPrime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		
		for(int i = 2; i * i <= num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public int getPrimeSum()
	{
		return primeSum;
	}
	
}

public class SumOfAllPrimeNumbers{	

	public static void main(String[] args) throws InterruptedException {
		
		int limit = 100;
		int numThreads = 4;
		int segmentSize = limit / numThreads;

		PrimeNumber[] primeSumThreads = new PrimeNumber[numThreads];
        Thread[] threads = new Thread[numThreads];

        int start = 2;
        int end = segmentSize;

        for (int i = 0; i < numThreads; i++) {
            primeSumThreads[i] = new PrimeNumber(start, end);
            threads[i] = new Thread(primeSumThreads[i]);
            threads[i].start();

            start = end + 1;
            end += segmentSize;
        }

        int totalPrimeSum = 0;

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
            totalPrimeSum += primeSumThreads[i].getPrimeSum();
        }

        System.out.println("The sum of prime numbers up to " + limit + " is: " + totalPrimeSum);
    }
}
