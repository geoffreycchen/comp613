let rec powerxn x n = 
  if n = 0 then 1 else x * powerxn x (n-1);;
