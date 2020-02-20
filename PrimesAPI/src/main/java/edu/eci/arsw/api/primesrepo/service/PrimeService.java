package edu.eci.arsw.api.primesrepo.service;

import edu.eci.arsw.api.primesrepo.model.FoundPrime;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Santiago Carrillo
 * 2/22/18.
 */
@Service
public interface PrimeService {

    FoundPrime addFoundPrime( FoundPrime foundPrime ) throws Exception;

    List<FoundPrime> getFoundPrimes();

    FoundPrime getPrime( String prime ) throws Exception;

}
