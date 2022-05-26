
fun main() {
    // while Loop
    // kód se provádí, dokud podmínka uvnitř () nebude false
    var index = 5
    while(index < 15) {
        println("$index")
        index++
    }
    // do while loop
    //nejdřív se provede kód, potom se checkne podmínka
    do {
        println(index)
        index--
    } while(index > 5)
    //narozdíl od while loop, se  do while loop provede aspoň jednou

    //break
    // stejný jako v javě, pokud se na něj narazí, tak vyskočí z daného cyklu, v němž je napsaný
    while(true) {
        println(index)
        if(index == 10)
            break
        index++
    }
    // V kotlinu je ale i labeled break, ten umožňuje vyskočit i z vnějších loopů
    index = 0
    var num = 10
    test@ while (index < 100) {
        zkouska@ while(index < num) {
            index++
            println(index)
            if (index == 56)
                break@test
        }
        num += 10
    }
    // continue
    //tak jako v javě continue přeskočí specifikovaný kód a pokračuje v toku programu
    for (i in 1..5) {
        if(i == 3) {
            continue
        }
        println(i)
    }
    //Labeled continue umožňuje taky vyskakování ze specifikovaného loopu
    jump@for (i in 1..5) {
        for (o in 7..13) {
            if(i == 4) {
                continue@jump
            }
        }
        println("$i - i")
    }
    // funkce
    // jsou user Defined a standard library function
    //syntax:
        fun funkce() {
        //tělo funkce
        }
        funkce()
        fun sum(cislo1: Int,cislo2: Int): Int { // u parametrů musí být uveden typ proměnné
            return cislo1 + cislo2  // Po kulatých závorkách se dává, co za typ se vrací (nechám nic pokud nechci vracet)
            // pokud nic nevrací, vrátí se Kotlin.unit
        }
        var result = sum(5,6)
        println(result)
        // default parametry = parametr kde neni passnuty argument, takze se pouzije default argument
        fun run(num: Int= 7,zprava: Char= 'a') {
            println("parametry ve funkci: $num a $zprava")
        }
        run()
        run(1)
        run(4,'i')
        // run('q') - nejde, neboť se q posílá na první argunemt, jenž je typu Int
        //Named argument = definujeme tím, jakýmu parametru se má poslat
        run(zprava='q')
        // lambda výrazy = jsou esenciálně anonymní funkce, jenž považujeme za hodnoty
        //              parametry       tělo
        val mojeLambda = { num: Int -> num * 2}
        var i = mojeLambda(1)
        println(i)
        // lambda může být jako parametr u funkceyp Int
        // zde ve funkci je parametr typ Int a vracející Int
        fun lambda(num: Int,num2: Int,mojeLambda: (Int) -> Int): Int {
            var soucin = num * num2
            return mojeLambda(soucin)
        }
        var o = lambda(4,2,mojeLambda)
        println(o)
        // Higher order funkce = funkce jako parametr funkce
}



