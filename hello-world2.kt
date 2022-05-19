
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

}