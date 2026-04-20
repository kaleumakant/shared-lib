package com.example

class Helper implements Serializable {
    def steps
    
    Helper(steps) {
        this.steps = steps
    }

    def sayHello(String name) {
        steps.echo "Hello, ${name}! This is from a class in src/."
    }
}

