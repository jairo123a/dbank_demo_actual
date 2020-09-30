Feature: Realizar  un registro de manera de manera exitosa en el aplicativo
   como usuario
  quiero ingresar al sitio web http://dbankdemo.com/signup y diligenciar un formulario
  para realizar un registro.

  Background:
    Given ingresar al sitio web
  @caso1
  Scenario: Ingresar al sitio web y diligenciar los datos para verificar un registro exitoso de un usuario

    When  diligenciar los datos y  registrar un usuario
    |titulo    |firstname    |lastname    |gender    |dateofbirth|social        |correo                  |password |confirmar|address|locality|region  |postal|country |telefono|celular  |telefonotrabajo|
    | MR.      |jairo        |henao       |f         |12/30/1987 |203-13-1162   |correo1@gmail.com      |Pjairo123|Pjairo123 |123   |medellin|andina  |12345 |colombia|392-5436| 392-5436| 392-5436 |
    Then  Verificar el registro exitoso de un usuario "Registration Successful. Please Login."
  @caso2

  Scenario: Ingresar al sitio web y diligenciar los datos para verificar un registro exitoso de una informacion financiera
    When  diligenciar los datos y  registrar una informacion financiera
      |user                   |password        |employment   |totalanual    |Monthlyrent   |monthlyauto|monthlyother      |monthlyminimum|creditcard1|accound|
      |correo1@gmail.com      |Pjairo123       |Employed     |  1000000     |   50000      |   500     |0                 |45            |   50      |Checking and Savings |
    Then  Verificar el registro exitoso de una informacion financiera "Thank you for your interest in a Digital Credit account. Your application has been accepted. Once your application has completed the review process, you will recieve an update from the credit review team."