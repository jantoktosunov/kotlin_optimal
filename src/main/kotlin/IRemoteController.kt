interface IRemoteController {
    fun off(): Unit
    fun on(): Unit

    fun play() {
        println("play")
    }
}

interface IHaltbar {
    fun halten(): Unit
}

class TVController (val marke: String) : IRemoteController, IHaltbar {
    override fun off() {
        println("off")
    }

    override fun on() {
        println("on")
    }

    override fun halten() {
        TODO("Not yet implemented")
    }

    //vererben nur Klassen
    //implemntieren nur Interfaces
}

class BeamerController : IRemoteController {
    override fun off() {
        TODO("Not yet implemented")
    }

    override fun on() {
        TODO("Not yet implemented")
    }

    fun rotiereScreen() {

    }
}

class RemoteSchrank() {
    fun putRemote(remote: IRemoteController) {

    }
}
fun main() {
    val remoteSchrank = RemoteSchrank()
    val tvController = TVController("Sony")
    tvController.play()
    val beamer = BeamerController()
    remoteSchrank.putRemote(tvController)
}