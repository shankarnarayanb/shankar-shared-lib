def call(String otherParam) {
    sh "echo $otherParam"
    if (otherParam.equalsIgnoreCase( "ap-name-zaap" )) {
        return true
    } else {
        return false   
    }
}
