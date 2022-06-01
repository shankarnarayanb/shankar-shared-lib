def call(String otherParam) {
    sh "echo $otherParam"
    if (otherParam.equalsIgnoreCase( "zaap" )) {
        return true
    } else {
        return false   
    }
}
