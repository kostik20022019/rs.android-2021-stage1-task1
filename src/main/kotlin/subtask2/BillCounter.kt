package subtask2

import java.util.ArrayList

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        //throw NotImplementedError("Not implemented")
        val fairlySplit = "bon appetit"
        var array = ArrayList<Int>()
        var a = bill.size
        for (i in 0 until a) {
            array.add(bill[i])
        }
        array.removeAt(k)
        a--
        var sum=0
        for (i in 0 until a) {
            sum+=array[i]
        }
        sum /= 2
        if(sum==b)
            return fairlySplit
        else {
            sum = b - sum
            return sum.toString()

        }
    }
}
