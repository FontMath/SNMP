# SNMP
SNMP Web application


## 1. Corregir referencia de javaee7
No sé por qué pero no encontré esa referencia, entonces Crea una nueva librería y agrega el .jar libs/javaee-endorsed-api-7.0-sources.jar

## 2. Activar SNMP en Windows

2.1 Vete a programas y caractéristicas, y después a activar o desactivar funciones de windows

<a href="http://es.tinypic.com?ref=2vcvrm9" target="_blank"><img src="http://i63.tinypic.com/2vcvrm9.png" border="0" alt="Image and video hosting by TinyPic"></a>

2.2 Buscar la función SNMP y palomea

<a href="http://es.tinypic.com?ref=ejd1sp" target="_blank"><img src="http://i63.tinypic.com/ejd1sp.png" border="0" alt="Image and video hosting by TinyPic"></a>

2.3 Reinicia la computadora<br>
2.4 Windows+R y ejecuta services.msc<br>
2.5 Busca "SNMP Service". Clic derecho y "Propiedades"<br>
2.6 Vete al tab "Security"<br>
2.7 Agrega una nueva comunidad con el nombre "clases" con privilegios de lectura y escritura.<br>
2.8 Elige Accept SNMP packets from any host<br>
2.8 Apply<br>

<a href="http://es.tinypic.com?ref=2yy3y48" target="_blank"><img src="http://i67.tinypic.com/2yy3y48.png" border="0" alt="Image and video hosting by TinyPic"></a>

## 3. Cambiar IP en Source Packages/default package/generatePieDisk.java

3.1 Ubica la línea 34 y cambia la IP a la tuya. En mac puedes hacer eso con "ifconfig" en terminal.

<a href="http://es.tinypic.com?ref=35id9hh" target="_blank"><img src="http://i67.tinypic.com/35id9hh.png" border="0" alt="Image and video hosting by TinyPic"></a>

## 4. Glassfish server en Netbeans (porque lo pediste)
1. Tools -> Server Manager
2. Add Server.
3. Selecciona GlassFish y Next.
4. Selecciona la ubicación de instalacción.
TERMINAR
