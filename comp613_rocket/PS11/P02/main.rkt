

(define (p02 vec)
  (let iter ([i 0] [acc 0] [result '()])
    (if (= i (vector-length vec))  ;If i = len, it has processed all elements, and it returns reversed order 
        (if (null? result) '(0) (reverse result))
        (let ([new-acc (+ acc (vector-ref vec i))])
          (iter (add1 i) new-acc (cons new-acc result))))))

