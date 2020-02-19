package edu.eci.arsw.primefinder;

import edu.eci.arsw.math.MathUtilities;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinder extends Thread{

    private BigInteger a;
    private BigInteger b;
    private PrimesResultSet prs;
    public  void findPrimes(BigInteger _a, BigInteger _b, PrimesResultSet prs){
            
                this.a=_a;
                this.b=_b;
                this.prs=prs;
	}
	@Override
    public void run(){
        MathUtilities mt=new MathUtilities();
        int itCount=0;
        BigInteger i=a;
        while (i.compareTo(b)<=0){
            itCount++;
            if (mt.isPrime(i)){
                prs.addPrime(i);
            }

            i=i.add(BigInteger.ONE);
        }
    }
	
	
	
	
}
