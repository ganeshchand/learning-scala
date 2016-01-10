/*
Make a class Info that has a String field name that can be retrieved from outside the class
(but not modified)
and a String field description that can be both modified and retrieved from outside the class”
 */

class Info(val name: String, var description: String){

}


val info = new Info("stuff", "Something")
info.name
/* not possible
  info.name = "new stuff"
  */
info.description
info.description = "this is new"
info.description





