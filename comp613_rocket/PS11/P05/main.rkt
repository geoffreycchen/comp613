
(require racket racket/stream)

(define (p05 ht1 ht2)
  (for/fold ([r ht1])
            ([(k v) (in-hash ht2)])
    (hash-update r k (lambda (vv) (+ vv v)) 0)))
