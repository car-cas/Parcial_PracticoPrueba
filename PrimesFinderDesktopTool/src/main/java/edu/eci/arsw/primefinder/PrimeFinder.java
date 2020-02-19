package edu.eci.arsw.primefinder;

import edu.eci.arsw.math.MathUtilities;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinder extends Thread{

    public static void findPrimes(BigInteger _a, BigInteger _b, PrimesResultSet prs){
        BigInteger a=_a;
        BigInteger b=_b;
        MathUtilities mt=new MathUtilities();
        int itCount=0;
        BigInteger i=a;
        while (i.compareTo(b)<=0){
            synchronized (PrimesFinderTool.monitThread){
                if (PrimesFinderTool.pause){
                    try {
                        PrimesFinderTool.monitThread.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            itCount++;
            if (mt.isPrime(i)){
                prs.addPrime(i);
            }

            i=i.add(BigInteger.ONE);
        }
        PrimesFinderTool.countTr.decrementAndGet();
    }
}
