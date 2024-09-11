package org.kotlin.training.leetCode

class ZigzagConversion {
}

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s

    val arrByLine = Array<String>(numRows){""}
    var row = 0;
    var lineDown = true

    s.forEach {
        arrByLine[row] = arrByLine[row] + it

        lineDown = if (row == 0) true else if (row == numRows-1) false else lineDown
        if (lineDown) row++ else row--
    }

    val sb = StringBuilder()
    arrByLine.forEach {
        sb.append(it)
    }

    return sb.toString()
}