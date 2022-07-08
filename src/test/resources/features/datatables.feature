Feature:
    #datatable

  @dataTable
  Scenario: Menu Options Driver
    Given user logged in on the fleet management homepage with the "driver" information
    Then use should be able to see following modules
      | Fleet     |
      | Customers  |
      | Activities |
      | System     |


  # DataTable - ListOfMap
  Scenario: verify each product price
    Given User is on the HomePage
    Then User should be able to see expected prices in following products
      | Category | Product           | ExpectedPrice |
      | Phones   | Samsung galaxy s6 | 360           |
      | Phones   | Nokia lumia 1520  | 820           |
      | Phones   | Nexus 6           | 650           |
      | Laptops  | Sony vaio i5      | 790           |
      | Laptops  | Sony vaio i7      | 790           |
      | Laptops  | MacBook air       | 700           |
      | Monitors | Apple monitor 24  | 400           |
      | Monitors | ASUS Full HD      | 230           |

#First row with header will be they key
# and the value will be the cells

#List[Map1->((K: Category,V: Phones),(Product,Samsunggalaxy s6), (expectedPrice, 360))
#     Map2->((Category,Phones),(Product,Nokia lumia 1520 ), (expectedPrice, 820))
#     Map3->((Category,Phones),(Product,Nexus 6 ), (expectedPrice, 650))]
  @wip
  Scenario: verify each product price listOfList
    Given User is on the HomePage
    Then User should be able to see expected prices in following products with listOflist
      | Phones   | Samsung galaxy s6 | 360 |
      | Phones   | Nokia lumia 1520  | 820 |
      | Phones   | Nexus 6           | 650 |
      | Laptops  | Sony vaio i5      | 790 |
      | Laptops  | Sony vaio i7      | 790 |
      | Laptops  | MacBook air       | 700 |
      | Monitors | Apple monitor 24  | 400 |
      | Monitors | ASUS Full HD      | 230 |