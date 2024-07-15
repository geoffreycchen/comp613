let swap a b =
  let temp = !b in
  b := !a;
  a := temp

