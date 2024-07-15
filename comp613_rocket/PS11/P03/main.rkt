

(require racket racket/stream)


(define (p03 count-vec)
  (for/fold ([result (make-vector 0)]) ; initializes the accumulator result as an empty vector with a length of 0.
            ([i (in-range (vector-length count-vec))]) ;  loop variable i
    (let ([count (vector-ref count-vec i)]) ; give i-th element of count-vec a name, count
      (vector-append result (make-vector count i))))) ;creates a new vector where every element is i, and the length of the new vector is determined by the value of count.
