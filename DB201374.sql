CREATE DATABASE DB201374;
USE DB201374;
Create table Dueño(
IdDueño int not null primary key auto_increment,
Nombre varchar(45),
Direccion varchar(45),
Telefono integer not null
);

Create table Mascotas(
IdMascota int not null primary key auto_increment,
TipoMascota varchar(45),
Nombre varchar(45),
FechaIngreso varchar(45),
IdDueño int not null,
Sexo varchar(45),
Motivo varchar(45) not null
);

Create table Cita(
IdCita int not null primary key auto_increment,
NombreMascota varchar(45),
Fecha varchar(45),
Servicio varchar(45)
);

Create table Medicamentos( 
Codigo int not null primary key auto_increment,
NombreMedicamento varchar(45),
SustanciaActiva varchar(45),
Caducidad varchar(45)
);