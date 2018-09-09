package kst

fun main(args: Array<String>){

    var m: MeetingP? = null
    var newMeetting = MeetingP()

    //Recebe m se for diferente de null senão cria um novo
    newMeetting = m ?: MeetingP()

    closeMeeting(m)
    closeMeeting(newMeetting)
    //validando se não é null para a chamada da função
    m?.let { closeMeetingNonNull(m) }

 }

fun closeMeetingNonNull(m: MeetingP): Boolean {
    return if(m.canClose) m.close()
    else false
}

fun closeMeeting(m: MeetingP?): Boolean? {
    //return if(m?.canClose == true) m?.close()
    //else false

    return if(m!!.canClose) m.close()
    else false
}

class MeetingP {

    val canClose: Boolean = false
    //inicializador tardil
    lateinit var address: Address

    fun close(): Boolean {
        return true;
    }

    fun save(o: Any) {
        val saveable = o as? ISaveable
        saveable?.save()
    }

    fun init(address: Address){
        this.address = address
    }
}

interface ISaveable {
    fun save()
}

class Address {

}