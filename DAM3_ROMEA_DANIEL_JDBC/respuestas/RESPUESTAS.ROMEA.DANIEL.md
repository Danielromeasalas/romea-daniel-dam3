PREGUNTA 1: Explica como funciona la relacion 1:N entre Soc e Incidente tanto en SQL como en Java

    En java, la clase Incidente tiene un atributo Soc, ya que un incidente solo puede tener un Soc. Sin embargo, 
    en la clase Soc no ponemos una atributo de Incidente ya que un soc puede estar asociado a varios Incidentes.
    En SQL, en la tabla 'incidentes' incluimos una columna de id_soc en la que ponemos le id del soc al que esta asociado
    ese incidente.

PREGUNTA 2: Explica por que en java utlizamos private Soc soc; y no: private int socId;

    En java utilizamos Soc soc ya que queremos que el incidente este directamente asociado al objeto de ese soc, 
    si utilizáramos int socId cada vez que quisieramos buscar el soc al que hace referencia, seria mucho mas complejo, ya que no
    hace referencia al objeto, sino al un atributo del mismo.

PREGUNTA 3: Explica que ventaja aporta PreparedStatement frente a concatenar SQL manualmente.

    PreparedStatement presenta una gran ventaja ya que nos permite reutilizar consultas siempre que queramos ya que solo cambian 
    los valores introducidos por el usuario.