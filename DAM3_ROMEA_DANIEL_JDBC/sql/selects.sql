   --Add
   INSERT INTO incidentes (codigo_incidente, tipo_incidente, fecha_deteccion, estado, fk_soc_id) VALUES (?, ?, ?, ?, ?)


   --Update
    UPDATE incidentes SET codigo_incidente=?,  tipo_incidente=?, fecha_deteccion=?, estado=?, fk_soc_id=? WHERE id = ?

    --Find
    SELECT * FROM incidentes WHERE id = ?

    --FindAll
    SELECT * FROM incidentes ORDER BY id

    --FindBySoc
    SELECT * FROM incidentes WHERE fk_soc_id = ? ORDER BY id

    --FindWithInforme
    SELECT * FROM incidentes INNER JOIN informes_incidente ON incidentes.id = informes_incidente.fk_incidente_id WHERE informes_incidente.id = ?