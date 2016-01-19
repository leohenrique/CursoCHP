package backend

class Address {

    static constraints = {
        number(nullable: true)
        complement(nullable: true)
        reference(nullable: true)
    }

    static belongsTo = [
        company: Company
    ]

    String street
    Integer number
    String complement
    String zip
    String reference
    String formattedAddress
    Double latitude
    Double longitude

}
