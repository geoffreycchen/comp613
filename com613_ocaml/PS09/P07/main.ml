module StringMap = Map.Make(String)

let update_count key map =
  let count = match StringMap.find_opt key map with
  | Some c -> c + 1
  | None -> 1
  in
  StringMap.add key count map

let freq2 strings =
  List.fold_left (fun acc str -> update_count str acc) StringMap.empty strings

let print_map map =
  StringMap.iter (fun key value -> Printf.printf "%s %d\n" key value) map

let main () =
  let args = Array.to_list Sys.argv |> List.tl in
  let frequencies = freq2 args in
  print_map frequencies


let () = main ()