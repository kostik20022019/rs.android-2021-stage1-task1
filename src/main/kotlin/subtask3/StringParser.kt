package subtask3

import java.util.*
import java.util.stream.Collector
import kotlin.collections.ArrayList

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String):Array<String> {
        //throw NotImplementedError("Not implemented")
        val a=inputString.length
        var stack_ch=ArrayList<Char>()
        var stack_in=ArrayList<Int>()
        var array=ArrayList<String>()
        var i=0
        while (i<a){
            if(inputString[i]=='<'||inputString[i]=='['||inputString[i]=='('){
                stack_ch.add(inputString[i])
                stack_in.add(i)
            }
            if (inputString[i]==')'){
                var sise=stack_in.size
                while (sise!=0){
                    if(stack_ch[sise-1]=='('){
                        sise -= 1
                        break}
                    sise--
                    //c++
                }
                val x=stack_in[sise]
                stack_in.removeAt(sise)
                val strHello = inputString.substring(x+1, i)
                array.add(strHello)
                stack_ch.removeAt(sise)
            }
            if (inputString[i]==']'){
                var sise=stack_in.size
                while (sise!=0){
                    if(stack_ch[sise-1]=='['){
                        sise -= 1
                        break}
                    sise--
                }
                val x=stack_in[sise]
                stack_in.removeAt(sise)
                val strHello = inputString.substring(x+1, i)
                array.add(strHello)
                stack_ch.removeAt(sise)
            }
            if (inputString[i]=='>'){
                var sise=stack_in.size
                while (sise!=0){
                    if(stack_ch[sise-1]=='<') {
                        sise -= 1
                        break}
                    sise--
                }
                val x=stack_in[sise]
                stack_in.removeAt(sise)
                val strHello = inputString.substring(x+1, i)
                array.add(strHello)
                stack_ch.removeAt(sise)
            }
            i++
        }
        var si=array.size
        var ror=Array<String>(si,{""})
        si -= 1
        for (i in 0..si){
        ror[i]=array[i]
        }
        return ror
    }
}
