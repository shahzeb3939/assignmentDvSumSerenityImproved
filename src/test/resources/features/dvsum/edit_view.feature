Feature: Edit View

  Scenario Outline: Editing a DvSum View
    Given User is on Column Dictionary Page on DvSum App
    When User edits a view
    | viewName   | newViewName   | databaseType   | databaseFilter   | databaseName   | columnsToBeSelected   |
    | <viewName> | <newViewName> | <databaseType> | <databaseFilter> | <databaseName> | <columnsToBeSelected> |
    Then View should be updated with edited details

    Examples:
    | viewName | newViewName    | databaseType | databaseFilter | databaseName | columnsToBeSelected                                                                                                                                                                               |
    | testView | testViewEdited | Source       | Excludes       | sarah db     | Primary Key, Density, Count Blanks, Profile Status, Source, Entity Type, Length, User Description, Source Type, Column, Distribution Type, Column Type, Min Value, Foreign Key, Sensitivity Level |
