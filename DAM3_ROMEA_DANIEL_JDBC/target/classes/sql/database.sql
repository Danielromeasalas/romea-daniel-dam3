-- Tabla SOCS

drop table if exists SOCS;
create table SOCS(
	ID SERIAL,
	NOMBRE VARCHAR(100),
	PAIS VARCHAR(100),
	NIVEL_SEGURIDAD INT,
	AUTOR_EXAMEN VARCHAR(50) default 'Daniel_Romea_dam',
	constraint PK_SOCS primary key (ID)
);


-- Tabla INCIDENTES

drop table if exists INCIDENTES;
create table INCIDENTES(
	ID SERIAL,
	CODIGO_INCIDENTE INT,
	TIPO_INCIDENTE VARCHAR(100),
	FECHA_DETECCION VARCHAR(20),
	ESTADO VARCHAR(100),
	FK_SOC_ID SERIAL,
	AUTOR_EXAMEN VARCHAR(50) default 'Daniel_Romea_dam',
	constraint PK_INCIDENTE primary key (ID),
	constraint FK_INCIDENTE_SOC_ID foreign key (FK_SOC_ID) references socs (ID)
);


-- Tabla INFORMES_INCIDENTE

drop table if exists INFORMES_INCIDENTE;
create table INFORMES_INCIDENTE(
	ID SERIAL,
	MALWARE_DETECTADO INT default 0 not null,
	NIVEL_SEGURIDAD INT not null,
	CONCLUSION VARCHAR(100) not null,
	FK_INCIDENTE_ID SERIAL,
	AUTOR_EXAMEN VARCHAR(50) default 'Daniel_Romea_dam',
	constraint PK_INFORMES_INCIDENTE primary key (ID),
	constraint UQ_FK_INCIDENTE_ID unique (FK_INCIDENTE_ID),
	constraint FK_INFORMES_INCIDENTE_INCIDENTE_ID foreign key (FK_INCIDENTE_ID) references incidentes (ID)
);