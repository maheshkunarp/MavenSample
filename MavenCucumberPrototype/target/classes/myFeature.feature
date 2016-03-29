Feature: This is my dummy feature file

 
  Scenario Outline: This is my first dummy step
    Given Login to Flipart
    When Search "<item>" item
    Then then "<display>" are displayed
    And Page is closed
    

    
 @Unit   
  Examples: 
 | item | display | 
 | unit | unit |

 @Regression
 
 Examples: 
 | item | display | 
 | reg | reg |
 
 
   
   

