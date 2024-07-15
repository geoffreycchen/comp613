type person = {name : string; age : int};;

let ps1 = {age = 3 ; name = "Geoffrey"};;

let birthday {name; age} = 
  {name = name; age = age + 1 }