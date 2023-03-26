# Instalacion de Groovy

## Entorno
   - Sistema Operativo: Windows 10
   - WSL: Sí
   - Distro WSL: Ubuntu 20.04
   - Terminal con zsh

## Pasos
   1. Instalar un jdk (seleccione openjdk 13)

      ``sudo apt-get update``
      ``sudo apt install openjdk-13-jre-headless # installs for java 13``

   2. Asegurarse de contar con la variable **JAVA_HOME**

      Localizar la carpeta donde se instalo open-jdk, que suele ser bajo ``/usr/lib/jvm/`` y agregar las siguientes líneas al final del perfil personal de zsh (Archivo en home: ``.zshrc``)

      ``export JAVA_HOME=/usr/lib/jvm/java-13-openjdk-amd64``
      ``export PATH="$JAVA_HOME/bin:$PATH"``

   3. Instalar [sdkman](https://sdkman.io/)

      ``curl -s "https://get.sdkman.io" | bash``
      ``source "$HOME/.sdkman/bin/sdkman-init.sh"``

   4. Instalar [groovy](https://groovy-lang.org/install.html)

      ``sdk install groovy``
      ``groovy -version``

   5. Si el comando anterior genera un mensaje informando la versión de groovy, todo esta listo （＾∀＾●）ﾉｼ
