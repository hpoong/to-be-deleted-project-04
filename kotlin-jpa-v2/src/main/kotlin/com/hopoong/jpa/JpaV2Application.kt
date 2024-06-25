package com.hopoong.jpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@PropertySource("file:./pwd.ini")
class JpaV2Application

fun main(args: Array<String>) {
	runApplication<JpaV2Application>(*args)
}
