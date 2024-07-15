(* Write a function freq that takes a list of strings  
   returns a hash table where the keys are the unique strings from the list
   and the values are their respective frequencies in the list.*)


let freq string_list =
  let hash_table = Hashtbl.create (List.length string_list) in
  List.iter (fun s ->
    match Hashtbl.find_opt hash_table s with
    | Some count -> Hashtbl.replace hash_table s (count + 1)
    | None -> Hashtbl.add hash_table s 1
  ) string_list;
  hash_table