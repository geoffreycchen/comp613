(*Given a hash table that maps strings to integers (representing some kind of ID), 
write a function hashinv
to create a newhash table where the integers map back to their original strings. 
Assume no two strings map to the same integer. *)


let hashinv hash_table =
  let inverted_hash = Hashtbl.create (Hashtbl.length hash_table) in
  Hashtbl.iter (fun key value -> Hashtbl.add inverted_hash value key) hash_table;
  inverted_hash