package backend

class Company {

    static constraints = {
    }

    static hasOne = [
        address: Address
    ]

    static hasMany = [
        employee: Employee
    ]

    Date createdAt
    String name

}
