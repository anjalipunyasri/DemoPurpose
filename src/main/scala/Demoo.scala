object Demoo extends App{
    val number = List(1,2,3,4,5)
    println(number)
    val maximum : Int = number.reduce((a,b) => a max b)
    println(maximum)
}
