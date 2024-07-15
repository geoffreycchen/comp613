type person = {name : string; age : int};;

let ps1 = {age = 3 ; name = "Geoffrey"};;

let greet {name; age} = 
  "Hello " ^ name ^ ". You are " ^ string_of_int age ^ " years old."