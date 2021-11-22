package my_oop_codes

open class UserValidation(open var email:String,open var password:String){
    fun register() {
        println("Yes, i can register")
        fun login() {
            println("Yes, i can login")
        }

        fun logout() {
            println("Yes, i can logout")
        }
    }
class Admin(override var email: String,override var password: String) :UserValidation(email,password)
fun generateReports(){
    println("Yes, i can generate reports")
    }
}