 ```markdown
## ReferenceDataController

The `ReferenceDataController` class is a controller that handles requests for reference data.

### Constructor

The `ReferenceDataController` constructor takes the following parameters:

* `referenceDataService`: A reference data service.

### Methods

The `ReferenceDataController` class has the following methods:

* `getCountries()`: Gets a list of countries.
* `getStates(String countryCode)`: Gets a list of states for a given country.
* `getCities(String stateCode)`: Gets a list of cities for a given state.

### Usage

The `ReferenceDataController` class can be used to get reference data for countries, states, and cities. For example, the following code gets a list of countries:

```java
ReferenceDataController controller = new ReferenceDataController(new ReferenceDataService());
List<Country> countries = controller.getCountries();
```

The following code gets a list of states for a given country:

```java
ReferenceDataController controller = new ReferenceDataController(new ReferenceDataService());
List<State> states = controller.getStates("US");
```

The following code gets a list of cities for a given state:

```java
ReferenceDataController controller = new ReferenceDataController(new ReferenceDataService());
List<City> cities = controller.getCities("CA");
```
```