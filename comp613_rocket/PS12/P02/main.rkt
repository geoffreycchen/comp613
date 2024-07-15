#lang racket

(require racket racket/stream)

;; Read floating point input from the command line. If any number in the command line has absolute value ≤ 5e-4, then raise your exception.
;; The output from the program should be:
;; If the exception is raised, then display "A too-small value encountered in command line"
;; Otherwise, display "Minimum value on command line is <min value>".

;; define a function that takes a list of floats
;; and either raises the exception, or produces the min
;; (define (process-inputs arglst)

(define p02-ex 'my-exception) ;; creates a global variable p02-ex and assigns it the symbol 'my-exception
(define (raise-exception float-value)
  (when (<= (abs float-value) 5.e-4)
    (raise p02-ex))
  float-value)

;;Minimum 
(define (process-inputs arglist)
  (apply min (map raise-exception arglist)))


;; define a main helper function that takes a list of strings representing floating point numbers
;; then run process-inputs on the floating point list 

(define (mainx strlst)
  (define args (for/list ([arg strlst])
                 (string->number arg)))
  (with-handlers ([(lambda (e) (equal? e 'my-exception))
                   (lambda (e) (displayln "A too-small value encountered in command line"))])
    (printf "Minimum value on command line is ~a~n"
            (process-inputs args))))

(define (main)
  (mainx (current-command-line-arguments)))