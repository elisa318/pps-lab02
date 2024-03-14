package task2A

import u02.CaseMatch.f
import u02.Values.s

object NegPredicate extends App:

    val neg : (String => Boolean) => (String => Boolean) = 
        f => (i => (f(i)))

    def negM(pred: String => Boolean) : (String => Boolean) =
        s => (pred(s))

    println(negM(_ == "")("casa"))
    println(neg(_ == "")("casa"))


    //println(neg(name))
  
