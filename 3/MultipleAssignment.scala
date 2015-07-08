def getPersonInfo(primaryKey : Int) = {
  // for purposes of exercise, hard-code reponse and ignore key
  (("Henry", "Addison"), "henry@dressipi.com")
}

val ((name), emailAddress) = getPersonInfo(1)

println(s"First Name: ${name._1}")
println(s"Last Name: ${name._2}")
println(s"Email Address: $emailAddress")
