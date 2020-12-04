Feature: Edit View

  Scenario Outline: Editing a DvSum View
    Given User is on Column Dictionary Page on DvSum App
    When User edits a view
    | viewName   | newViewName   | databaseType   | databaseFilter   | databaseName   | columnsToBeSelected   |
    | <viewName> | <newViewName> | <databaseType> | <databaseFilter> | <databaseName> | <columnsToBeSelected> |
    Then View should be updated with edited details

    Examples:
    | viewName | newViewName    | databaseType | databaseFilter | databaseName | columnsToBeSelected                                                                                                                                                                               |
    | testView | testViewEdited | Dataset       | Includes       | SCHOOL_SETTINGS     | Primary Key, Density, Dataset, Profile Status, Source, Entity Type, Length, User Description, Source Type, Column, Distribution Type, Column Type, Min Value, Foreign Key, Sensitivity Level |
