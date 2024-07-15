
(define (count-them! L)
  (foldl (lambda (item acc)
           (let ((entry (assoc item acc)))
             (if entry
                 (cons (cons (car entry) (+ 1 (cdr entry)))
                       (remove entry acc))
                 (cons (cons item 1) acc))))
         '()
         L))