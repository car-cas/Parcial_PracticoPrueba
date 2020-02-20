package edu.eci.arsw.api.primesrepo;

import edu.eci.arsw.api.primesrepo.model.FoundPrime;
import edu.eci.arsw.api.primesrepo.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Santiago Carrillo
 * 2/22/18.
 */
@RestController
public class PrimesController {

    @Autowired
    PrimeService primeService;

    @GetMapping("/primes")
    public ResponseEntity<?> getPrimes() {

        try {
            return new ResponseEntity<>(primeService.getFoundPrimes(), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/primes")
    public ResponseEntity<?> postPrime(@RequestBody FoundPrime newFoundPrime) {

        try {
            return new ResponseEntity<>(primeService.addFoundPrime(newFoundPrime), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("/primes/{primeNumber}")
    public ResponseEntity<?> getPrimeByPrimeNumber(@PathVariable String primeNumber) {

        try {
            return new ResponseEntity<>(primeService.getPrime(primeNumber), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
