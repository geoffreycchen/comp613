let swap a b =
  let temp = !b in
  b := !a;
  a := temp;;

let arev a =
  let len = Array.length a in
  for i = 0 to (len / 2) - 1 do
    let ai = ref a.(i) in
    let aj = ref a.(len - i - 1) in
    swap ai aj;
    a.(i) <- !ai;
    a.(len - i - 1) <- !aj
  done;;
  a



