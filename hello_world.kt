import java.util.*

private val s1 = "Délka je $"

private val s2 = "pole je na indexu"

// Hello World Program
fun main() {
    println("Hello World");


// kotlin je staticky typovaný
// používá se na více operačních systémech (android, IOS,..)
// kotlin běží na JVM
// Open source
// interoperabilní s java
// ! eliminuje null hrozby
// nemusí se psát středníky na konci řádku

// kotlin podporuje procedurální programování a OOP
// procedurální = kód se přečte ze shora dolů


// proměnné
// deklarují se pomocí var a val

    val cislo = 5;
    var zprava = "ahoj";

//nemusíme specifikovat typ proměnný, ale když specifikujeme, tak za jemno dáme dvojtečku, mezeru a typ
// ctrl + shift + p a najeti na promennou pro jeji typ

    val hodnota: Int = 20;
    var zprava2: String = "8"

    var promenna: Int;
    promenna = 3;

    // nejde!!!!!
    // var cau
    // cau = "cau"
    // !!!!!

    // typ promenny se automaticky priradi podle typu nebo velikosti cisla

    //rozdíl mezi var a val
    // var = hodnota uvnitř může být změměna v pozdější fázi programu
    var jmeno = "Tomáš"
    jmeno = "David"
    var hodnota3 = 5
    hodnota3 = 4
    // val = hodnota uvnitř nemůže být změněna v pozdější fázi programu(konstanta)
    // val cislo2 = 2
    // cislo2 = 5 (nejde)

    //pro výpis proměnný
    println("$jmeno")
    // nebo
    println(jmeno)

    //String
    // jako v Javě, jsou neměnitelný
    // 2 typy - escaped a raw string
    // escaped - používají se uvozovky (""), mohou mít speciální znaky \n, \t, \b,...
        // \n - nový řádek, \r - carriage return, \t, - tab, \b - backspace, \", \', \\, \$ - používá se na proměnné
    // raw - používají se trojité uvozovky(""" """), neobsahují speciální znaky, mohou obsahovat více řádků
    var raw: String = "rawString"
    var escaped: String = "Escaped\n String"
    var s = String() //prázdný String
    var r = s.length;
    println(raw.compareTo(escaped))
    println(raw[0])
    println(raw.get(0))
    // Iterace
    for (e in raw) {
        print(e)
    }
    //templates
    var temp = "Délka je ${raw.length}"

    //konvertace datových typů
    // z menších na větší to nejde takhle:
    var value = 10
    // var value2: Long = value; // Compile error
    // místo toho se používají funkce
    var value2: Long = value.toLong();
    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
    var vetsi: Long = 100
    var mensi: Int = vetsi.toInt();

    //Pole
    // deklarace:
    var pole = arrayOf(1,2,3);
    //deklarace pomocí Array() konstruktoru
    //1. parametr je velikost pole
    // 2. parametr je funkce, která se použije nan inicializaci a vrátí pole prvků každý s vlastním indexem
    val arr = Array(5, {i -> i*2})

    // Operators

    // in operator = contains
    // pouziva se u podminek
    if ("j" in temp) {
        println("JO")
    }
    if (temp.contains("j")) {
        println("Jo")
    }
    if ("A" !in raw) {
        println("a neni")
    }
    // range operator
    //interval od startovní hodnoty do konečné hodnoty
    // používají se dvě tečky ..
    // je doplněno in a !in
    // všechno co je mezi startovní a konečnou hodnotou se projde
    for (a in 1..5) {
        print("$a ")
    }
    for (a in 'a'..'g') {
        print("$a ")
    }
    val range = 1..5
    println(range)
    println("3 v rozemzí je ${3 in range}")

    //Input
    //Kotlin má předdefinovanou funkci readLine(), vrací to, co se napsalo do vstupu nebo null
    val name = readLine()
    println(name)
    // Ostatní typy jsou explicitně convertovány do korenspodentních typů
    // Pro ostatní typy se musí vytvořit objekt Scanneru
    val sc = Scanner(System.`in`)
    val i =sc.nextInt() //nextFloat(), nextBoolean(), nextLong(), nextDouble()
    println(i)

    //zakometování:
    // koment
    /*
    koment na více
    řádků
     */

    // podmínky
    // narozdíl od javy, v kotlinu if vrací hodnotu, musím tam ale použít i else část
    val returnHodnota = if (i > 2) {
        "$i je větší než 2"
        vetsi = 50
        "SS"
        "LL"
    } else {
        "$i je menší než 2 nebo rovno 2"
    }
    //proměnné se přiřadí poslední řádek projité podmínky
    println(returnHodnota)
    val num1 = 25
    val num2 = 20
    val num3 = 30
    val z = if (num1 > num2) {
        var t = if(num1 > num3) {
            4
        } else {
            89
        }
        println(t)
        8 // tady je poslední řádek
    } else if (num2 > num3) {
       7
    } else {
        3
    }
    println("$z")
    //samozřejmě nemusím použít vracející hodnotu
    if(num1 > num2) {
        println(num1)
    } else {
        println(num2)
    }
    //!!!!! nešlo by
    //var s = if(num1> num3) {
      //  println(num1)
    //} else {
      //  println(num3)
    //}

    //switch
    // V kotlinu je when místo switch
    // Místo default je tu else
    // na konec každé možnosti se nedává break

    var num = 2
    var cau = when(num) {
        1 -> 8
        2 -> {
            "a"
            "i" // jako u podmínek, i tady se k proměnné přiřadí hodnota z posledního řádku casu
        }
        3 -> "ahoj3"
        4 -> "čau"
        else -> "Konec"
        }
    println(cau)
    when(num) {
        1, 2, 3, 4 -> println(1..4); //v kotlinu jde napsat, že několik možností bude mít stejné vykonání programu
        in 5..10 -> println("rozmezí mezi 5 a 10"); // jde použít i range
        else -> println("Nic")
        }
    //for loop
    // kotlin for loop je ekvivalent foreach loopu v javě
    for (el in arr)
        println(el)//nemusí se psát {}, když tam je jenom řádek v těle forloopu

    //for loop na indexování
    for (el in pole.indices) {
        println("na indexu v poli: pole[$el] je " + pole[el])
        }
    //Iterace for loopu pomocí range operátoru
    print("1..5: ")
    for (i in 1..5)
        print("$i, ")
    println()
    print("5..1: ")
    for (i in 5..1) //nic nevypíše
        print("$i, ")
    println()
    print("5 downTo 1: ")
    for (i in 5 downTo 1) //musí se napsat downTo, aby výpis byl proveden sestupně
        print("$i, ")
    println()
    print("1..11 step 2: ")
    for (i in 1..11 step 2) // i se zvětší vždy o 2
        print("$i, ")
    println()
    print("16 downTo 1 step 3: ")
    for (i in 16 downTo 1 step 3) //  i se zmenší vždy o 3
        print("$i, ")
    }








