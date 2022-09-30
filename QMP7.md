# Esbozo de rquest de QMP7:  
  ## Dominio base: http://qmp.com  
  ***Aclaracion para todos los casos en caso de error del sistema el codigo de devolucion sera 500***

#### Como usuarie de QueMePongo quiero ver todas las prendas que tengo en mi guardarropas desde el navegador para poder administrarlas   
- URI: http://qmp.com/prendas 
- Method: get  
- Response:
  - Headers:
    - content: application/json  
  - Code: 200
  - Body:
    ```json
        
        [
              {
                  "id":12,
                  "tipoPrenda": "String tipoPrenda", //REMERA, CHOMBA, CAMISA, PANTALON,....
                  "colorPrimario": {
                      "rojo": 20, // integer
                      "verde": 30, //integer
                      "azul": 50 //integer
                  },
                  "colorSecundario": {
                      "rojo": 20, // integer
                      "verde": 30, //integer
                      "azul": 50 //integer
                  },
                  "trama": "String trama", //LISA, RAYADA, LUNARES, CUADRICULADA, ESTAMPADA
                  "material": "String material", //ALGODON, ELASTICO, SEDA, GOMA, PIQUE, ACETATO
                  "temperatura": 30 //integer
              } 
          ]
   ```

#### Como usuario de QueMePongo, quiero crear una prenda desde el navegador  
- URI: http://qmp.com/prendas 
- Method: post  
- Request:
  - headers:
    - content-type: application/json  
  - Body:
    ```json
              {
                  "tipoPrenda": "String tipoPrenda", //REMERA, CHOMBA, CAMISA, PANTALON,....
                  "colorPrimario": {
                      "rojo": 20, // integer
                      "verde": 30, //integer
                      "azul": 50 //integer
                  },
                  "colorSecundario": {
                      "rojo": 20, // integer
                      "verde": 30, //integer
                      "azul": 50 //integer
                  },
                  "trama": "String trama", //LISA, RAYADA, LUNARES, CUADRICULADA, ESTAMPADA
                  "material": "String material", //ALGODON, ELASTICO, SEDA, GOMA, PIQUE, ACETATO
                  "temperatura": 30 //integer
              }
    ```  
- Response:
  - Code: 201
  - Headers: 
    - content-type: application/json
  - Body:
    ```json
    {
      "message:":"succesfull created",
      "id":13
    }
    ```

#### Como usuarie de QueMePongo quiero ver una prenda en particular que tengo en mi guardarropas para poder editarla  
- URI: http://qmp.com/prendas/{id} 
- Method: get  
- Response:
  - headers:
    - content-type: application/json  
  - Body:
    ```json
              {
                  "id":{id},
                  "tipoPrenda": "String tipoPrenda", //REMERA, CHOMBA, CAMISA, PANTALON,....
                  "colorPrimario": {
                      "rojo": 20, // integer
                      "verde": 30, //integer
                      "azul": 50 //integer
                  },
                  "colorSecundario": {
                      "rojo": 20, // integer
                      "verde": 30, //integer
                      "azul": 50 //integer
                  },
                  "trama": "String trama", //LISA, RAYADA, LUNARES, CUADRICULADA, ESTAMPADA
                  "material": "String material", //ALGODON, ELASTICO, SEDA, GOMA, PIQUE, ACETATO
                  "temperatura": 30 //integer
              }
    ```
  - Code:
    - 200 en caso de encontrar la prenda y devuelve el body
    - 404 not found en caso de no encontrar la prenda
    - 400 bad request en caso de no colocar un id numerico

#### Como usuarie de QueMePongo, quiero poder eliminar una prenda de mi guardarropas  
- URI: http://qmp.com/prendas/{id} 
- Method: delete  
- Response:
  - headers:
    - content-type: application/json  
  - Body:
    ```json
    {
      "message:":"succesfull deleted",
      "id":{id}
    }
    ```
  - Code:
    - 204 en caso de que funcione o no encuentre la prenda por ya estar eliminada ( delete idempotente) 
    - 400 bad request en caso de no colocar un id numerico

#### Como usuarie de QueMePongo, quiero poder ver mis eventos para administrarlos  
- URI: http://qmp.com/eventos 
- Method: get  
- Response:
  - Headers:
    - content: application/json  
  - Code: 200
  - Body:
    ```json
        
        [  NIEVE, LLUVIA, GRANIZO, SOL, VIENTO ]
   ```

## Como usuarie de QueMePongo, quiero poder abrir las sugerencias de prendas para un evento en mi navegador  
- URI: http://qmp.com/eventos/{evento} 
- Method: delete  
- Response:
  - headers:
    - content-type: application/json  
  - Body:
    ```json
    [
      {
          "prendaSuperior" : {...Objeto prenda desarrolado anteriormente...},
          "prendaInferior" : {...Objeto prenda desarrolado anteriormente...},
          "calzado" : {...Objeto prenda desarrolado anteriormente...},
          "accesorio" : {...Objeto prenda desarrolado anteriormente...}
      }
    ]
    ```
  - Code:
    - 200 devolvera el body desarrollado en caso de que funcione correctamente
    - 400 bad request en caso de que no exista el evento que ingreso 
