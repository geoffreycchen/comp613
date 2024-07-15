

(require racket racket/stream)

(define (p01 vec)
  (if (<(vector-length vec) 2)
      vec
  (for/vector ([i (in-range 1 (vector-length vec))]); Iterates over the range starting from 1
    (-(vector-ref vec i) (vector-ref vec (sub1 i))))
  ))


