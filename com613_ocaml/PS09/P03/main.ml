type nested_int =
  | Int of int
  | Lst of nested_int list

  let rec flatten ll =
  match ll with
  | [] -> []
  | Int hd :: tl -> hd :: (flatten tl)
  | Lst hd :: tl -> (flatten hd) @ (flatten tl)