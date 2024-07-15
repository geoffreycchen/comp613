

(require racket racket/stream)
(define (p04 words)
  (for/fold ([freq-hash (hash)])
            ([word (in-list words)])
    (hash-update freq-hash word add1 0)))