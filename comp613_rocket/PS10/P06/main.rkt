
(define (prime? n)
  (cond
    [(<= n 1) #f]  ; 1 or any non-positive number is not prime
    [(= n 2) #t]   ; 2 is the only even prime number
    [(even? n) #f] ; Other even numbers greater than 2 are not prime
    [else (let loop ((i 3))
            (cond
              [(> (* i i) n) #t]  ; No divisors found, n is prime
              [(zero? (remainder n i)) #f] ; i divides n, so n is not prime
              [else (loop (+ i 2))]))])) ; Check next odd number