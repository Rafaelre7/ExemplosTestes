package com.rafaelpimenta.exemplostestes.rules

import org.junit.rules.TestWatcher
import org.junit.runner.Description

class RegraCustomizada : TestWatcher() {

    var log: String = ""
    override fun starting(description: Description?) {
        super.starting(description)
        println("==setUP - $log")
    }

    override fun finished(description: Description?) {
        super.finished(description)
        println("==finished - $log")
    }
}