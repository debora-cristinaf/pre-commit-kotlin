package com.example.precommit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrecommitApplication

fun main(args: Array<String>) {
    runApplication<PrecommitApplication>(*args)
}
