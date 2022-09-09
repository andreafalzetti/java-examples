fun main(args: Array<String>) {
    if (args.size < 2) {
        println("missing args")
        return
    }
    val (hour, minute, second) = args[0].split(' ')
    val (day, month, year) = args[1].split(' ')
    println("$hour:$minute:$second $day/$month/$year")
}

main(args)

