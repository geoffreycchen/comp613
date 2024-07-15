let sum_opt a b =
  match a, b with 
  | (None, None) -> 2
  | (Some a, None) -> a + 1
  | (None, Some a) -> a + 1
  | (Some a, Some b) -> a + b
