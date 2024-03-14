package task2A

object MatchCases extends App{
   
    val positive : Int => String = _ match
        case n if n >= 0 => "positive"
        case _ => "negative"

    val pos = 5;
    val neg = -5;
    
    println(positive(pos))
    println(positive(neg))

    def positiveMethod(x: Int) : String = x match
        case x if x >= 0 => "positive"
        case _ => "negative"
    
    println(positiveMethod(pos))
    println(positiveMethod(neg))

}
