package fields.one.to.many

class OrderLine {
    String item
    int quantity
    BigDecimal price

    static belongsTo = [order: Order]

    static constraints = {
    }
}
