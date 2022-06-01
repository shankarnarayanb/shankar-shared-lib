def call(Map config = [:], String otherParam) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    sh "echo $otherParam"
    if (otherParam.equalsIgnoreCase( "zaap" )) {
        return true
    } else {
        return false   
    }
}
