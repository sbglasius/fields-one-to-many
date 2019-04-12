package fields.one.to.many

class OrderLine {
    String item
    Category category
    int quantity = 0
    BigDecimal price = 0.00

    static belongsTo = [order: Order]

    static constraints = {
    }

    String toString() {
        "$item ($quantity x $price = ${quantity * price})"
    }
}
