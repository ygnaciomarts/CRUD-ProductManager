-- TECNM CAMPUS LA LAGUNA
-- SEMESTRE: Enero-Junio 2022
-- MATERIA: Taller de Base de Datos
-- GRUPO: C15A
-- ALUMNO: Ygnacio Mart�nez S�nchez
-- NO. DE CONTROL: 20130778
-- PROFESOR: Jos� Dolores Ruiz Ayala

-- UNIDAD 4: Seguridad.
-- Se pone en uso la base de datos tiendaVinilos
use tiendaVinilos
go

-- Creaci�n de la llave de encriptado
create master key encryption
by password = 'ejercici03ncriptacion'
go

-- Se a�aden las columnas de la informaci�n a encriptar
alter table dbo.vinilos
add sencilloLider varchar (50),
sencilloLider_enc varbinary (256)

-- Creaci�n de la llave sim�trica
create symmetric key sencilloLider_sym_key
with algorithm = AES_256
encryption by password = 'ejercici03ncriptacion'

-- Apertura de la llave sim�trica con la contrase�a, para poder encriptar la informaci�n
open symmetric key sencilloLider_sym_key decryption
by password = 'ejercici03ncriptacion'

update dbo.vinilos
set [sencilloLider_enc] = encryptbykey(key_guid('sencilloLider_sym_key'), [sencilloLider])

-- Se hace una consulta para comprobar que haya funcionado
select convert(varchar(50), decryptbykey([sencilloLider_enc])) as [sencilloLider_desenc]
from dbo.vinilos

-- Se cierra la llave sim�trica
close symmetric key sencilloLider_sym_key 

-- Se hace un select para comprobar toda la informaci�n de la tabla vinilos
select * from dbo.vinilos order by idVinilo