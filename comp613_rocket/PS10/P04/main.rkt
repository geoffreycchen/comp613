
(define (deep-rev lol)
  (cond
    [(null? lol) '()]
    [(= (length lol) 1) (list (reverse (car lol)))]
    [else
     (append (deep-rev (cdr lol)) (list (reverse (car lol))))]

    )
  )
