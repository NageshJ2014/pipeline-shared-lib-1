//def call(Map config=[:], Closure body) {
def call(Map config=[:]) {
    node {
        git url: "https://github.com/werne2j/sample-nodejs"
        stage("Install") {
            //sh "npm install"
            echo "Came Into Install Block"
        }
        stage("Test") {
            //sh "npm test"
            echo "Came Into Test Block"
        }
        stage("Deploy") {
            if (config.deploy) {
                //sh "npm publish"
                echo "Came Into Deploy Block"
            }
        }
        //body()
    }
}
