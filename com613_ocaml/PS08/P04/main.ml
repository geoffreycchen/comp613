

type circle = { radius: float }
type rectangle = {width: float ; height: float }


type shape = 
  | Cir of circle
  | Rect of rectangle

let area shp = 
  match shp with 
  | Cir c -> 3.14159 *. c.radius *. c.radius
  | Rect r -> r.width *. r.height

let perimeter shp =
  match shp with 
  | Cir c -> 3.14159 *. 2 *. c.radius
  | Rect r -> (r.width +. r.height) *. 2