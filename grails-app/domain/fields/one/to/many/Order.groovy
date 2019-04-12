package fields.one.to.many

class Order {
    String customer
    static hasMany = [lines: OrderLine]
    static constraints = {
    }

    static mapping = {
        table "order_table"
    }
}
