let rec factorial n = 
  if n <= 0 then 1
  else n * factorial (n-1)

let maybe_fact lst =
  List.map (fun x ->
    if x < 0 then None
    else Some (factorial x)
      ) lst