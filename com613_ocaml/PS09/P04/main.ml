type num =
 | Intv of int
 | Floatv of float
 | Stringv of string

 let convert_from_string str =
  match int_of_string_opt(str) with
    | Some v -> Intv v 
    | None -> match float_of_string_opt str with 
              | Some v -> Floatv v
              | None -> Stringv "error: not a number"

let convert_to_string n =
  match n with
  | Intv v -> Stringv (Int.to_string v)
  | Floatv v -> Stringv (Float.to_string v)
  | Stringv v -> Stringv "nope"

let rec sums a b =
  match a, b with
  | Intv x, Intv y -> Intv (x + y)
  | Floatv x, Floatv y -> Floatv (x +. y)
  | Intv x, Floatv y -> Floatv ((float_of_int x) +. y)
  | Floatv x, Intv y -> Floatv (x +. (float_of_int y))
  | Stringv x, Stringv y ->  convert_to_string (sums (convert_from_string x) (convert_from_string y))
  | Stringv x, _ -> sums (convert_from_string x) b
  | _, Stringv y -> sums a (convert_from_string y) 

let (+++) = sums