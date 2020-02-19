package edu.eci.arsw.api.primesrepo.service;

import edu.eci.arsw.api.primesrepo.model.FoundPrime;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Santiago Carrillo
 * 2/22/18.
 */
@Component("primeServiceStub")
public class PrimeServiceStub implements PrimeService {
    private final Map<String, FoundPrime> primes = new HashMap<>();
    @Override
    public void addFoundPrime( FoundPrime foundPrime ) {

    }

    @Override
    public List<FoundPrime> getFoundPrimes()
    {
        //TODO
        return null;
    }

    @Override
    public FoundPrime getPrime( String prime )
    {
        //TODO
        return null;
    }
}
