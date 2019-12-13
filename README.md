**usuario 1**

> Se crea la carpeta y se hace un git init:
	- mkdir (nombre de la carpeta)
	- cd (nombre de la carpeta)
        - git init
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~$ mkdir pruebaGit
	alumno@profesor-B85M-DS3H-A:~$ cd pruebaGit
	alumno@profesor-B85M-DS3H-A:~$ git init
	Reinicializado el repositorio Git existente en /home/alumno/.git/
	*******************************************************************
> Se crea el README.md y se enlaza con el repositorio de git
        - sudo nano README.md.
        - git remote add (nombre para relacionar el enlace)  (el enlace del repositorio del GitHub) 
	  git remote add github https://github.com/amadoojosazules/GitPrueba.git
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ sudo nano README.md
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git remote add github 
	https://github.com/amadoojosazules/GitPrueba.git
	*******************************************************************

> Se añaden todos los archivos de seguimiento y se hace el primer commit:
        - git add .
        - git commit -m "Primera version"
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git add .
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git commit -m "primera prueba"
	[master (commit-raíz) 7b36958] primera prueba
	 1 file changed, 0 insertions(+), 0 deletions(-)
 	create mode 100644 README.md
	*******************************************************************

> Se suben los archivos a la rama master:
        - git pull github
	
	*******************************************************************
	git pull github master
	Desde https://github.com/amadoojosazules/GitPrueba
	 * branch            master     -> FETCH_HEAD
	Ya está actualizado.
	*******************************************************************

-----------------------------------------------------------------------------------------------
**Usuario 2**

> Clono el repositorio de mi compañera en local:
    - git clone https://github.com/amadoojosazules/GitPrueba.git

> Creo una nueva rama y cambio a esta:
    - git branch amado
    - git checkout amado
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git branch amado
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git checkout amado
	Cambiado a rama 'amado'
	*******************************************************************

> Modifico el archivo Mcd.java:
    - sudo nano Mcd.java
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ sudo nano Mdc.java
	*******************************************************************

> Cambio a la rama Master:
    - git checkout master
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git checkout master
	Cambiado a rama 'master'
	*******************************************************************

> Añado todos los archivos al repositorio guardando los cambios:
    - git add .
    - git status
    - git commit -m "Cambio Amado"
    - git push https://github.com/amadoojosazules/GitPrueba.git amado
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git add .
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git status
	En la rama master
	Cambios a ser confirmados:
  	(usa "git restore --staged <archivo>..." para sacar del área de stage)
	nuevo archivo:  Mdc.java

	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git commit -m "añadir Mcd.java"
	[master 4ee2065] añadir Mcd.java
 	1 file changed, 30 insertions(+)
 	create mode 100644 Mdc.java
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git push https://github.com/amadoojosazules/GitPrueba.git amado
	Username for 'https://github.com': amadoojosazules
	Password for 'https://amadoojosazules@github.com': 
	Enumerando objetos: 3, listo.
	Contando objetos: 100% (3/3), listo.
	Escribiendo objetos: 100% (3/3), 220 bytes | 220.00 KiB/s, listo.
	Total 3 (delta 0), reusado 0 (delta 0)
	To https://github.com/amadoojosazules/GitPrueba.git
 	* [new branch]      amado -> amado
	*******************************************************************

-----------------------------------------------------------------------------------------------
**Usuario 1**

> Se descargan / Sincronizan los archivos de la rama amado
        - git pull https://github.com/amadoojosazules/GitPrueba.git amado
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git pull github amado
	Desde https://github.com/amadoojosazules/GitPrueba
	 * branch            amado      -> FETCH_HEAD
	Ya está actualizado.
	*******************************************************************

> Se modifica el archivo mcd2.java se agrega y se hace el commit:
        - nano mcd2.java
        - git add .
        - git commit -m "Modificado el archivo MCD2.java"
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ sudo nano mcd2.java
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git add .
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git status
	En la rama master
	Cambios a ser confirmados:
 	 (usa "git restore --staged <archivo>..." para sacar del área de stage)
	nuevo archivo:  mcd2.java

	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git commit -m "Modificado el archivo MCD2.java"
	[master a4398f0] Modificado el archivo MCD2.java
 	1 file changed, 30 insertions(+)
 	create mode 100644 mcd2.java
	*******************************************************************

> Se suben los cambios al respositorio:
        - git push https://github.com/amadoojosazules/GitPrueba.git master
	
	*******************************************************************
	alumno@profesor-B85M-DS3H-A:~/pruebaGit$ git push github master
	Username for 'https://github.com': amadoojosazules	
	Password for 'https://amadoojosazules@github.com': 
	Enumerando objetos: 6, listo.
	Contando objetos: 100% (6/6), listo.
	Compresión delta usando hasta 4 hilos
	Comprimiendo objetos: 100% (5/5), listo.
	Escribiendo objetos: 100% (5/5), 836 bytes | 836.00 KiB/s, listo.
	Total 5 (delta 1), reusado 0 (delta 0)
	remote: Resolving deltas: 100% (1/1), done.
	remote: 
	remote: Create a pull request for 'master' on GitHub by visiting:
	remote:      https://github.com/amadoojosazules/GitPrueba/pull/new/master
	remote: 
	To https://github.com/amadoojosazules/GitPrueba.git
	 * [new branch]      master -> master
	*******************************************************************

-----------------------------------------------------------------------------------------------
