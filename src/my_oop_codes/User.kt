package my_oop_codes

class User(name:String,email:String,password:String){
    var userName:String
    var userEmail:String
    var userPassword:String
    init {
        this.userName = name
        this.userEmail = email
        this.userPassword = password
    }
    fun register(){
        println("Yes, i can register with email $userEmail")
    }
    fun login(){
        println("Yes, i can login with email $userEmail")
    }
}