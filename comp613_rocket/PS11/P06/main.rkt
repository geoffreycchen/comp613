(require racket racket/stream)

(define p06
  (let loop ((i 1))
    (stream-cons
     (/ (- (expt 3 i) 1) 2)
     (loop (add1 i)))))
