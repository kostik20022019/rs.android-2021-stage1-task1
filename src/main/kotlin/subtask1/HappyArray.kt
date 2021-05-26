package subtask1
import java.util.*


class HappyArray {
    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        //throw NotImplementedError("Not implemented")
        if (sadArray.isNotEmpty()) {
            var array = ArrayList<Int>()
            var a = sadArray.size
            for (i in 0 until a) {
                array.add(sadArray[i])
            }
            a -= 1
            var i = 1
            while (i != a) {
                var b = array[i - 1]
                var c = array[i + 1]
                if (b + c < array[i]) {
                    array.removeAt(i)
                    i = 0
                    a--
                }
                i++
            }
            a = array.size
            var sArray = IntArray(a, { 0 });
            for (i in 0 until a) {
                sArray[i] = array[i];
            }
            return sArray
        }
    else
    {
        return sadArray
    }
    }
}
