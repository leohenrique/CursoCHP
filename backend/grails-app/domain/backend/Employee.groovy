package backend

class Employee {

    static constraints = {
        role(nullable: true)
    }

    static belongsTo = [
        company: Company
    ]

    Date createdAt
    String name
    EmployeeRole role

}
