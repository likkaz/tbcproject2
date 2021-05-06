class Converting() {
    var nothing = ""
    var set1 = arrayOf<String>(
        nothing, "ერთი", "ორი", "სამი", "ოთხი", "ხუთი", "ექვსი", "შვიდი", "რვა", "ცხრა", "ათი",
        "თერთმეტი", "თორმეტი", "ცამეტი", "თოთხმეტი", "თხუთმეტი", "თექვსმეტი", "ჩვიდმეტი", "თვრამეტი", "ცხრამეტი"
    )

    var set2 = arrayOf<String>(
        nothing, "ათი", "ოცი", "ოცდაათი", "ორმოცი", "ორმოცდაათი",
        "სამოცი", "სამოცდაათი", "ოთხმოცი", "ოთხმოცდაათი"
    )

    var set3 = arrayOf<String>(
        nothing,
        nothing,
        "ოცდა",
        "ოცდა",
        "ორმოცდა",
        "ორმოცდა",
        "სამოცდა",
        "სამოცდა",
        "ოთხმოცდა",
        "ოთხმოცდა"
    )
    var set4 = arrayOf<String>(
        nothing, "ას ", "ორას", "სამას ", "ოთხას ", "ხუთას ", "ექვსას ",
        "შვიდას ", "რვაას ", "ცხრაას "
    )
    var set5 = arrayOf<String>(
        nothing,
        "ასი",
        "ორასი",
        "სამასი",
        "ოთხასი",
        "ხუთასი",
        "ექვსასი",
        "შვიდასი",
        "რვაასი",
        "ცხრაასი",
        "ათასი"
    )

    fun convertingNums(num: Int): String {
        var num = num
        var text: String
        if (num == 0) return nothing
        return if (num % 100 < 20 && num % 100 != 0) {
            text = set1[num % 100]
            text
        } else if (num in 21..99 && num % 10 != 0) {
            text = set3[num / 10] + set1[num % 20]
            text
        } else if (num in 101..999 && num % 100 != 0) {
            (set4[num / 100] + set3[(num % 100) / 10] + set1[((num % 100) % 20)]).also { text = it }
            text

        } else if (num % 100 == 0) {
            text = set5[num / 100]
            text
        } else set2[num / 10]

    }
}