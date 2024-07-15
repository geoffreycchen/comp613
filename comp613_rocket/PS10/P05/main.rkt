
(define (no-dup lst)
  (cond
    [(null? lst)]
    [(= (length lst) 1) lst]
    [(member (car lst) (cdr lst)) (no-dup (cdr lst))]
    [else (cons (car lst) (no-dup (cdr lst)))]

    )

  )