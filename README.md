# Kotlin

Kotlin es un lenguaje moderno, se puede usar en cualquier lugar donde Java se usa actualmente, en desarrollo back-end, aplicaciones Android, etc..

* No requiere puntos y comas para finalizar instrucciones
* Soporta **type inference**, es decir, declara el tipo de dato por su valor.

### Porque pasar de Java a Kotlin?

* Es un lenguaje moderno, fue creado usando caracteristicas de Phyton o Swift, con tecnicas y sintaxis mas moderna y simple. Tambien poseen mas soporte.
* Posee un estilo de programacion mucho mas sencillo. Nos ahorramos mucho codigo que esta de más en Java.
* Elimina el `null pointer exception` que existe en Java. La idea es que no hayan huecos en la aplicacion, como variables sin inicializar.
* Kotlin tiene soporte por Google, y se actualiza seguido. Google anuncio que todo desarrollo para Android será Kotlin-First.

## Android

#### Tipos de Layout

* **Linear layout**: Los elementos se acomodan de manera vertical u horizontal. No tenemos que preocuparnos de acomodar los elementos, es todo automatico. Este tipo de diseño se puede volver complejo con respecto a las anidaciones.
* **Relative layout**: acomodamos elementos que son relativos a la posicion de otros elementos.
* **Constraint layout**: Usamos un relative layout. Podemos acomodar con flechas mediante blueprint la posicion de los elementos con respecto al resto. Es la que se pone por defecto cuando creamos el proyecto.

#### Tamaños elementos

* **Match Parent:** Va a poder cubrir la misma altura y/o ancho del contenedor padre.
* **Wrap Content:** Fijar las dimensiones en base al contenido o a los elementos dentro del mismo.
* Puedo utilizar ambos, uno para ancho y otro para el alto, o viceversa, si asi lo quiero.

#### Recursos

* **Layout**: Activities, vistas.
* **Drawable**: Recursos vectorales o de imagenes que se van a mantener estaticos
* **Mipmap**: Iconos o el splash screen de la aplicacion
* **Values**: Constantes, como colores, Strings, estilos en particular, etc..

#### Elemento R

Es un archivo dinamico, el compilador de Android va a estar actualizandolo siempre, con la info sobre la vista, para que pueda ser vista por el controlador.
Podemos obtener accesos inmediatos a otras clases estaticas sin tener que instanciarlas.

Ids: `R.id.nombre`
Drawables: `R.drawable.imagen`
Layouts: `R.layout.MainActivity`
String: `R.strings.texto`

