package my_oop_codes

fun main() {
    var myUser = User("Cliff","cliff@gmail.com","1234")
    println(myUser.userName)
    //we can also access the methods on the user class using the myUser object
    myUser.login()
    var myAdmin = UserValidation.Admin("cliff@gmail","cliff1234")
    myAdmin.register()
    myAdmin.generateReports()
}