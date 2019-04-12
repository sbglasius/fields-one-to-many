package fields.one.to.many

class BootStrap {

    def init = { servletContext ->
        Category.withNewSession {
            ['Cereal','Dairy','Non food','Juice','Fruit'].each {
                new Category(name: it).save(failOnError: true)
            }
            new Order(customer: 'Mr. Jones').save(failOnError: true)
        }
    }
    def destroy = {
    }
}
