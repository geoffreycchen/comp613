
let isconsonant x = 
  match x with 
  | 'a' | 'e' | 'i' | 'u' | 'o' -> false
  | _ when x >= 'a' && x <= 'z' -> true
  | _ -> false
