import org.example.Constants

def call(Map config=[:]) {
    if (config.type == "slack") {
        echo "Printing NJ SLACK MESSAGE"
        echo config.message
    } else {
        echo "Printing NJ E-MAIL MESSAGE"
        echo config.message
    }
}
