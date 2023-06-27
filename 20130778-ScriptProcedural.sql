-- TECNM CAMPUS LA LAGUNA
-- SEMESTRE: Enero-Junio 2022
-- MATERIA: Taller de Base de Datos
-- GRUPO: C15A
-- ALUMNO: Ygnacio Martínez Sánchez
-- NO. DE CONTROL: 20130778
-- PROFESOR: José Dolores Ruiz Ayala

-- UNIDAD 6: SQL Procedural.

-- VISTA
	-- Se comprueba que la vista no exista antes de su creación, con la
	-- finalidad de evitar errores
	IF OBJECT_ID ('personalizada_view', 'V') IS NOT NULL
		DROP VIEW personalizada_view;
	GO

	-- Se crea la vista, la cual es totalmente personalizable desde la
	-- app en Java. El valor del * siempre puede variar, según
	-- lo que el usuario haya escogido en la app, por lo que la
	-- vista se estará eliminando y creando constantemente
	CREATE VIEW personalizada_view AS
		SELECT * FROM vinilos
	GO

	-- Finalmente, se seleccionan los valores desde la vista
	SELECT * FROM personalizada_view
	GO


-- PROCEDIMIENTO ALMACENADO
	-- Se comprueba que el procedimiento no exista antes de su creación, con la
	-- finalidad de evitar errores
	IF OBJECT_ID ('insert_sp', 'V') IS NOT NULL
		DROP VIEW insert_sp;
	GO

	-- Se crea el procedimiento almacenado, el cual hace un insert
	-- en la tabla principal con los datos que el usuario desee
	-- con el fin de ahorrar la escritura de código
	CREATE PROCEDURE insert_sp
		@tipo varchar(10), @tamano int, @nombre varchar(50), @artista varchar(50), @precio int, @cantidad int, @disquera varchar(50), @activo int, @sencilloLider varchar(50)
	AS
		INSERT INTO vinilos (tipo, tamano, nombre, artista, precio, cantidad, disquera, activo, sencilloLider) VALUES (@tipo, @tamano, @nombre, @artista, @precio, @cantidad, @disquera, @activo, @sencilloLider)
	GO

	-- Finalmente, se ejecuta el procedimiento con los parámetros
	-- a insertar en la tabla
	EXECUTE insert_sp 'Gatefold', 12, 'Prism', 'Katy Perry', 1099, 2, 'Capitol Records', 1, 'Roar'
	GO


-- TRIGGER
	-- Se crea una tabla adicional (llamada stock), en la cual se guardarán
	-- parámetros adicionales cada que se haga un insert
	CREATE TABLE stock (
		idStock INT IDENTITY(1,1) PRIMARY KEY,
		fecha DATE,
		hora TIME,
		noPiezasSurtidas INT
	)
	GO

	-- Se comprueba que el trigger no exista antes de su creación, con la
	-- finalidad de evitar errores
	IF OBJECT_ID ('stock_trigger', 'TR') IS NOT NULL
		DROP TRIGGER stock_trigger
	GO

	-- Se crea el trigger, el cual almacenará los parámetros que se generen
	-- según la fecha y la hora en la que se añada información a la
	-- tabla principal (vinilos)
	CREATE TRIGGER stock_trigger ON vinilos
	AFTER INSERT AS 
		BEGIN
			INSERT INTO stock (fecha, hora, noPiezasSurtidas)
			VALUES (getDate(), CONVERT(TIME(0),GETDATE()), FLOOR(RAND()*(100-1)+1))
		END
	GO

	-- Se insertan parámetros para comprobar el funcionamiento del trigger
	INSERT INTO vinilos VALUES ('Gatefold', 12, 'Smile', 'Katy Perry', 799, 9, 'Capitol Records', 1, 'Never Really Over', null)
	GO

	-- Se hace un select para comprobar la información en ambas tablas
	SELECT * FROM vinilos
	GO
	SELECT * FROM stock
	GO