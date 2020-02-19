package edu.eci.arsw.api.primesrepo.service;

import edu.eci.arsw.api.primesrepo.PrimesException;
import edu.eci.arsw.api.primesrepo.model.FoundPrime;

import java.util.List;

/**
 * @author Santiago Carrillo
 * 2/22/18.
 */
public interface PrimeService
{

    void addFoundPrime(FoundPrime foundPrime) throws PrimesException;

    List<FoundPrime> getFoundPrimes()throws PrimesException;

    FoundPrime getPrime( String prime )throws PrimesException;

}
