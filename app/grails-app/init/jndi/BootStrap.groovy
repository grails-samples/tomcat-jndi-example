package jndi

class BootStrap {

    def init = { servletContext ->
        new Book(title: 'Grails 3 - Step by Step').save(flush: true)
        new Book(title: 'Grails 3: A Practical Guide to Application Development').save(flush: true)
        new Book(title: 'Falando de Grails').save(flush: true)
    }
    def destroy = {
    }
}
