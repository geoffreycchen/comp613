
(define (merge-them! lst1 lst2)
  (cond
    [(null? lst1) lst2]                     ; If lst1 is empty, return lst2
    [(null? lst2) lst1]                     ; If lst2 is empty, return lst1
    [else
     (let ([car1 (car lst1)]                ; First element of lst1
           [cdr1 (cdr lst1)]                ; Rest of lst1
           [car2 (car lst2)]                ; First element of lst2
           [cdr2 (cdr lst2)])               ; Rest of lst2
       (cond
         [(<= car1 car2)
          (cons car1 (merge-them! cdr1 lst2))] ; If car1 is less than or equal to car2,
                                               ; add car1 to the merged result of cdr1 and lst2
         [else
          (cons car2 (merge-them! cdr2 lst1))] ; Otherwise, add car2 to the merged result of cdr2 and lst1
        ))]))