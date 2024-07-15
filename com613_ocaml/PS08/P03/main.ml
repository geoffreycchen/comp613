type person = {name : string; age : int};;
type book  = {title : string; author : person; year_published: int};;

let ps1 = {age = 78 ; name = "trump"};;
let bk1 = {title = "art"; author = ps1; year_published = 2020}
let author_age_at_publication  {title; author; year_published} = 
  author.age - (2024 - year_published)