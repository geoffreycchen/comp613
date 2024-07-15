let rec filter predicate lst =
  match lst with
  | [] -> []  (* Base case: If the list is empty, return an empty list *)
  | head :: tail ->
      if predicate head then
        head :: filter predicate tail  (* Include head if it satisfies the predicate *)
      else
        filter predicate tail  (* skip the head and continue filtering *)
