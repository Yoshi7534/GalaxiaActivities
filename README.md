🌌 Sistema Solar - Navegación entre Actividades

📌 Descripción de la Aplicación

Esta aplicación educativa permite a los usuarios explorar información sobre los planetas del Sistema Solar. Cada planeta tiene su propia actividad con una breve descripción y una imagen representativa. También incluye una sección con un fragmento que muestra información adicional sobre Mercurio.

🔄 Manejo de Transiciones entre Actividades

La navegación entre actividades se implementa utilizando Intents en Android. Al presionar un botón en la pantalla principal, se inicia la actividad correspondiente al planeta seleccionado. Además:

Se utiliza startActivity(Intent(this, NombreDeLaActividad::class.java)) para abrir nuevas actividades.

Para evitar la creación innecesaria de múltiples instancias de MainActivity, se emplea finish() en las actividades secundarias cuando se quiere regresar.

La actividad de Mercurio incluye un Fragment, el cual se carga dinámicamente dentro de un FragmentContainerView al presionar un botón.

🚀 Instrucciones para Ejecutar y Probar la Aplicación

🔧 Requisitos Previos

Android Studio instalado.

Un dispositivo físico con Android o un emulador configurado.

Configuración mínima de Android 6.0 (API 23) o superior.

📥 Instalación y Ejecución

Clona este repositorio:

git clone https://github.com/Yoshi7534/GalaxiaActivities

Abre el proyecto en Android Studio.

Conéctate a un dispositivo físico o inicia un emulador.

Ejecuta la aplicación presionando Run (botón ▶ en la barra superior).

🧪 Pruebas

Al iniciar la aplicación, debería aparecer la pantalla principal con opciones para cada planeta.

Al hacer clic en un planeta, se debería abrir una nueva actividad con su descripción.

La navegación entre actividades debe ser fluida sin cierres inesperados.
