
(define (prime-factors n)
  (let loop ((n n)             ; initial value of n
             (divisor 2)       ; starting with the smallest prime
             (factors '()))    ; list to collect factors
    (cond
      [(> (* divisor divisor) n) (reverse (if (> n 1) (cons n factors) factors))]  ; if divisor^2 > n, add n if n > 1
      [(zero? (remainder n divisor))
       (loop (/ n divisor) divisor (cons divisor factors))]  ; if n divisible by divisor, divide and collect
      [else
       (loop n (if (= divisor 2) 3 (+ divisor 2)) factors)])))  ; increment divisor correctly