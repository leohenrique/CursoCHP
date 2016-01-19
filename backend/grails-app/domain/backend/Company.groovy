package backend

import grails.rest.Resource

@Resource(uri = '/companys', formats = ['json', 'xml'])
class Company {

    static constraints = {
    }

    static hasOne = [
        address: Address
    ]

    static hasMany = [
        employee: Employee
    ]

    static mapping = {
        address cascade: 'all'
        employee cascade: 'all'
        createdAt defaultValue: 'now()'
        createdAt updateable: false
    }

    Date createdAt
    String name

}
