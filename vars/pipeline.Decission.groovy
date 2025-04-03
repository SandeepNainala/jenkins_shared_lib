#!groovy

//declaring a function
def decidePipeline(Map configMap) {    // defining a function with a Map parameter
    type = configMap.get("type")
    switch(type) {                     // switch statement to check the value of type
        case "nodejsEKS":
            nodejsEKS(configMap)
            break
        case "nodejsVM":
            nodejsVM(configMap)
            break
        default:
            error "type is not matched"
            break
    }
}