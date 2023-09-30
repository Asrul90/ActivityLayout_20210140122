fun main() {
    println("Selamat datang di simulator memasak telur!")

    print("Apakah Anda ingin memasak telur (ya/tidak)? ")
    val input = readLine()

    if (input?.toLowerCase() == "ya") {
        cookEggs()
    } else {
        println("Terima kasih. Selamat tinggal!")
    }
}

fun cookEggs() {
    println("Pilih jenis telur yang ingin Anda masak:")
    println("1. Telur rebus")
    println("2. Telur dadar")

    print("Masukkan nomor pilihan Anda: ")
    val choice = readLine()?.toInt()

    when (choice) {
        1 -> boilEggs()
        2 -> makeScrambledEggs()
        else -> println("Pilihan tidak valid. Telur tidak dimasak.")
    }
}

fun boilEggs() {
    println("Anda memasak telur rebus.")
    println("1. Siapkan telur dan panci dengan air.")
    println("2. Masukkan telur ke dalam panci berisi air dingin.")
    println("3. Nyalakan kompor dan rebus selama 9-12 menit.")
    println("4. Tiriskan dan sajikan.")
}

fun makeScrambledEggs() {
    println("Anda membuat telur dadar.")
    println("1. Kocok telur dalam mangkuk dengan sedikit garam dan merica.")
    println("2. Panaskan wajan dengan sedikit minyak.")
    println("3. Tuangkan telur yang sudah dikocok ke dalam wajan.")
    println("4. Aduk-aduk telur hingga matang.")
    println("5. Sajikan.")
}
