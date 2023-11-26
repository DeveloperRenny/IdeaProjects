# language: en
Feature:Realizar compras de articulos
  Como un nuevo cliente
  Quiero ingresar a la pagina www.abc.com
  Para realizar una compra de un articulo.

  @ScenarioWithExample
  Scenario: Agregar articulos al carrito de compras
    Given que un nuevo cliente accede hasta la web de compras
    When el agrega 4 unidades de mascarilla reutilizable FFP3 KN95 al carro
    Then el ve los productos listado en el carro de compras

 @ScenarioWithoutExample
  Scenario Outline: Agregar articulos al carrito de compras
    Given que un nuevo cliente accede hasta la web de compras
    When el agrega productos al carro
      | <nombreProducto> | <cantidadAgregar> |
    Then el ve los productos listado en el carro de compras

    Examples:
      | nombreProducto | cantidadAgregar |
      | tapabocas n95  | 100             |