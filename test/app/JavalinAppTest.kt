package app

import io.javalin.Javalin
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class JavalinAppTest {

    private lateinit var app : Javalin
    private val url = "http://localhost:8000/"

    @Before
    fun foo() {
        app = JavalinApp(8000).init()
    }

    @After
    fun tearDown() {
        app.stop()
    }

    @Test
    fun testDummy() {
        Assert.assertEquals(1, 1)
    }
}