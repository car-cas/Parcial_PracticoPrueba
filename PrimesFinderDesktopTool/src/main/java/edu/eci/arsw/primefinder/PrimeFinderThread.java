package edu.eci.arsw.primefinder;

import java.math.BigInteger;

public class PrimeFinderThread extends Thread {

    private BigInteger a;
    private BigInteger b;
    private PrimesResultSet prs;

    public PrimeFinderThread(BigInteger _a, BigInteger _b, PrimesResultSet prs){

        this.a=_a;
        this.b=_b;
        this.prs=prs;
    }

    @Override
    public void run(){
        PrimeFinder.findPrimes(a,b,prs);
    }
}
