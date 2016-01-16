package backend

class Company {

    static constraints = {
        name(blank: false)
        createdAt(blank: false)
    }

    Date createdAt;
    String name;

}
