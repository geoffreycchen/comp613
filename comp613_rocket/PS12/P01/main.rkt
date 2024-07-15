#lang racket
(require racket racket/stream)

(struct song (title singer year))

(define (read-song)
  (let [(title (read-line (current-input-port) 'any))
        (singer (read-line (current-input-port) 'any))
        (year (read-line (current-input-port) 'any))]
    (song title singer year))) ; song  a constructor that packages these details into a structured form


(define (chk-eq song1 song2)
  (string=? (song-singer song1) (song-singer song2)))

(define (main)
  (let [(song-1 (read-song))
        (song-2 (read-song))]
    (if (chk-eq song-1 song-2)
        (printf "Yes! ~a and ~a have the same singer: ~a~n"
                (song-title song-1)
                (song-title song-2)
                (song-singer song-1))
        (printf "No! ~a and ~a do not have the same singer~n"
                (song-title song-1)
                (song-title song-2)))))
(main)