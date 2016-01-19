package backend

class Address {

    static constraints = {
        number(nullable: true)
        reference(nullable: true)
    }

    static belongsTo = [
        company: Company
    ]

    String street
    String number
    String zip
    String reference
    String formattedAddress
    Double latitude
    Double longitude

}
