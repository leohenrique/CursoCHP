package backend

import grails.rest.Resource

@Resource(uri = '/employees', formats = ['json', 'xml'])
class Employee {

    static constraints = {
        role(nullable: true)
    }

    static belongsTo = [
        company: Company
    ]

    static mapping = {
        createdAt defaultValue: 'now()'
        createdAt updateable: false
    }

    Date createdAt
    String name
    EmployeeRole role

}
