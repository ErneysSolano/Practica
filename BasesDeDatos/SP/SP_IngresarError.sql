use  DBErrores
go

create procedure SP_RegistrarErrores
@descripcion varchar (40)
as 
begin
  declare @CodigoError bigint;

 SET @CodigoError =  RIGHT('000000' + CAST(ABS(CHECKSUM(NEWID())) % 1000000 AS VARCHAR(6)), 6);

insert into TblErrores(codigoError,descripcion) values(@CodigoError,@descripcion)

end
go
