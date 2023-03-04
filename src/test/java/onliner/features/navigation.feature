Feature: Onliner

  Scenario: Step-by-step navigation to "Игровые ноутбуки" page
    Given Go to "https://www.onliner.by/"
    When User navigates to the "Каталог" page
      And User selects "Компьютеры и сети" from the navigation menu
      And User hovers mouse over "Ноутбуки, компьютеры, мониторы" label
      And User clicks on "Игровые ноутбуки" label
    Then "Игровые ноутбуки" category page opened