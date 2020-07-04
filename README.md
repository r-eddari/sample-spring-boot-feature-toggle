# Feature toggles aka Feature flags
Feature toggles or Feature flags are a mechanism that allows us to enable or disable specific functionality of our application without having to modify code or, ideally, redeploy our app

## Installation
Clone the project in your workspace, build it with maven and run SampleSpringBootFeatureToggleApplication.java, the application should start on the port 8080.

### Usage
Call the below endpoint:
```http
http://localhost:8080/api/v1/employes
```
You should get the following result:

```json
[
    {
        "info": "Employe 1 from DB"
    },
    {
        "info": "Employe 2 from DB"
    },
    {
        "info": "Employe 3 from DB"
    },
    {
        "info": "Employe 4 from DB"
    },
    {
        "info": "Employe 5 from DB"
    }
]
```
In application.properties file set the value of property feature.toggles.employesFromWebService to true and recall the same endpoint above:

you should get the following result:

```json
[
    {
        "info": "Employe 1 from web service"
    },
    {
        "info": "Employe 2 from web service"
    },
    {
        "info": "Employe 3 from web service"
    },
    {
        "info": "Employe 4 from web service"
    },
    {
        "info": "Employe 5 from web service"
    }
]
```

To display the list of properties used in the toggle features  example, we exposed it using custom actuator endpoint:

```http
http://localhost:8080/actuator/feature-toggles
```
The result is : 

```json
{
    "employesFromWebService": true
}
```
