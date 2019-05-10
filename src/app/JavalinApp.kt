package app

import io.javalin.Javalin

class JavalinApp(private val port: Int) {

    fun init(): Javalin {

        val app = Javalin.create().apply {
            port(port)
            exception(Exception::class.java) { e, _ -> e.printStackTrace() }
        }.start()

        app.routes { }

        return app
    }
}