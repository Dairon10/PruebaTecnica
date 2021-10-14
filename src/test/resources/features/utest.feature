

  @stories
   Feature: Academy Choucair

     As a user, I must enter the page unit, click on register and fill out the form
     @scenario1
    Scenario: As a user, I must enter the page unit, click on register and fill out the form

      Given  than dairon wants to register on the Utest page


      When he fills out the first step of the registration form
        | strName   | strLastName   | strEmail            | StrPassword    | StrConfirmPassword |
        | Dairon    | Altamairanda  | daironalexxx@gmail.com |                |                    |

      Then he fills out the second step of the registration form

      And he fills out the third step of the registration form

      And he fills out the fourth step of the registration form
        | strName   | strLastName   | strEmail | StrPassword    | StrConfirmPassword |
        |           |               |          | 1qw2er3rt45tY. | 1qw2er3rt45tY.     |




