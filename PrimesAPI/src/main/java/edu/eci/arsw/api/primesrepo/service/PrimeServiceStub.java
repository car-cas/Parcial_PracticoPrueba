package edu.eci.arsw.api.primesrepo.service;

import edu.eci.arsw.api.primesrepo.model.FoundPrime;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 2/22/18.
 */
@Component
public class PrimeServiceStub implements PrimeService {

    private List<FoundPrime> foundPrimes;

    public PrimeServiceStub() {

        foundPrimes = new ArrayList<>();
    }

    @Override
    public FoundPrime addFoundPrime( FoundPrime foundPrime ) throws Exception {

        if(validFoundPrimeNumber(foundPrime)) return foundPrime;
        throw new Exception("The prime number already exists");
    }

    private boolean validFoundPrimeNumber(FoundPrime foundPrime) {

        try {
            FoundPrime prime = findFoundPrimeByPrimeName(foundPrime.getPrime());
            return false;
        } catch (Exception e) {
            foundPrimes.add(foundPrime);
            return true;
        }
    }

    @Override
    public List<FoundPrime> getFoundPrimes() {
        return foundPrimes;
    }

    @Override
    public FoundPrime getPrime( String prime ) throws Exception {

        return findFoundPrimeByPrimeName(prime);
    }

    private FoundPrime findFoundPrimeByPrimeName(String prime) throws Exception {

        for(FoundPrime p: foundPrimes) {
            if(p.getPrime().equals(prime)) {
                return p;
            }
        }

        throw new Exception("Prime {"+prime +"} does not exist");
    }
}
