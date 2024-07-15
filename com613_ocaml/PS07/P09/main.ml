let rec accumr v f lst =
  match lst with
  | [] -> [v]
  | x :: tl ->
 
    let new_acc = f v x in
    new_acc :: accumr new_acc f tl 