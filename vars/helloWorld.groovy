def call(Map config = [:], String otherParam) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    sh "echo $otherParam"
    return true
}
