Feature:
    #datatable

@dataTable
  Scenario: Menu Options Driver
    When the user enters the "driver" information
    Then use should be able to see following modules
      | Fleets     |
      | Customers  |
      | Activities |
      | System     |