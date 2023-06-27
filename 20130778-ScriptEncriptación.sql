-- TECNM CAMPUS LA LAGUNA
-- SEMESTRE: Enero-Junio 2022
-- MATERIA: Taller de Base de Datos
-- GRUPO: C15A
-- ALUMNO: Ygnacio Martínez Sánchez
-- NO. DE CONTROL: 20130778
-- PROFESOR: José Dolores Ruiz Ayala

-- UNIDAD 4: Seguridad.
-- Se pone en uso la base de datos tiendaVinilos
use tiendaVinilos
go

-- Creación de la llave de encriptado
create master key encryption
by password = 'ejercici03ncriptacion'
go

-- Se añaden las columnas de la información a encriptar
alter table dbo.vinilos
add sencilloLider varchar (50),
sencilloLider_enc varbinary (256)

-- Creación de la llave simétrica
create symmetric key sencilloLider_sym_key
with algorithm = AES_256
encryption by password = 'ejercici03ncriptacion'

-- Apertura de la llave simétrica con la contraseña, para poder encriptar la información
open symmetric key sencilloLider_sym_key decryption
by password = 'ejercici03ncriptacion'

update dbo.vinilos
set [sencilloLider_enc] = encryptbykey(key_guid('sencilloLider_sym_key'), [sencilloLider])

-- Se hace una consulta para comprobar que haya funcionado
select convert(varchar(50), decryptbykey([sencilloLider_enc])) as [sencilloLider_desenc]
from dbo.vinilos

-- Se cierra la llave simétrica
close symmetric key sencilloLider_sym_key 

-- Se hace un select para comprobar toda la información de la tabla vinilos
select * from dbo.vinilos order by idVinilo