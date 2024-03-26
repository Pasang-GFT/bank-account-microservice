 # ReferenceDataController.java

## Table of Contents

- [Overview](#overview)
- [Class Diagram](#class-diagram)
- [Detailed Design](#detailed-design)
  - [Attributes](#attributes)
  - [Methods](#methods)

## Overview

The `ReferenceDataController` class is responsible for handling requests related to reference data. It provides methods for creating, retrieving, updating, and deleting reference data.

## Class Diagram

[Image of the class diagram for the ReferenceDataController class]

## Detailed Design

### Attributes

The `ReferenceDataController` class has the following attributes:

- `referenceDataService`: This attribute is of type `ReferenceDataService` and is used to access the reference data service.

### Methods

The `ReferenceDataController` class has the following methods:

- `createReferenceData()`: This method is used to create a new reference data entry. It takes the following parameters:
  - `referenceData`: This parameter is of type `ReferenceData` and contains the data to be stored.
- `getReferenceData()`: This method is used to retrieve a reference data entry by its ID. It takes the following parameter:
  - `id`: This parameter is of type `Long` and contains the ID of the reference data entry to be retrieved.
- `updateReferenceData()`: This method is used to update an existing reference data entry. It takes the following parameters:
  - `referenceData`: This parameter is of type `ReferenceData` and contains the updated data.
- `deleteReferenceData()`: This method is used to delete a reference data entry by its ID. It takes the following parameter:
  - `id`: This parameter is of type `Long` and contains the ID of the reference data entry to be deleted.