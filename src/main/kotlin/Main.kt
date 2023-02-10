fun main(args: Array<String>) {
    greetPerson("Myres")
    remainder(34,2)
    sum(1,2,3,4)
    interestingFact()

}
fun greetPerson(name: String){
    println("Hello $name")
}
fun remainder(num1:Int, num2:Int):Int{
    var remainder=num1%num2
    println(remainder)
    return(remainder)
}
fun sum(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    var sum=num1+num2+num3+num3
    println(sum)
    return(sum)
}
fun interestingFact(){
println("I love watching Documentaries") // This is a comment
}