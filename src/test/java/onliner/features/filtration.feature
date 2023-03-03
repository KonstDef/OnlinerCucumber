Feature: Onliner

  Scenario: Test "Автобарахолка" page filtration
    Given Go to "https://www.onliner.by/"
    When User navigates to the "Автобарахолка" page
      And User sets "" - "100000""USD" range for "Цена" filter
      And User sets "Седан" for "Тип кузова" checkbox filter
      And User sets "Автоматическая" for "Коробка передач" checkbox filter
    Then Parameters for all car cards are correct