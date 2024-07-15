
type color =
  | Red
  | Green
  | Blue
  | RGB of int * int * int

let components color = 
  match color with
  | Red -> (255, 0, 0)
  | Green -> (0, 255, 0)
  | Blue -> (0, 0, 255)
  | RGB (r, g, b) -> (r, g, b)



