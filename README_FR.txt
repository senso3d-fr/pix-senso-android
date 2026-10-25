PIX-SENSO ANDROID — PROJET POUR GÉNÉRER UN APK

Le fichier HTML transmis dans la conversation est intégré localement à l'application Android : app/src/main/assets/index.html.
L'application ouvre ce fichier sans avoir besoin d'une connexion internet pour charger le générateur lui-même.

GÉNÉRER L'APK AVEC GITHUB ACTIONS
1. Crée ou ouvre le dépôt GitHub destiné au projet Android.
2. Décompresse cette archive sur ton ordinateur.
3. Téléverse le CONTENU du dossier à la racine du dépôt (les dossiers app/ et .github/ doivent rester à la racine).
4. Valide les fichiers sur la branche main.
5. Dans GitHub, ouvre l'onglet Actions puis « Build Pix-Senso APK ».
6. Clique sur « Run workflow » si le lancement automatique ne s'est pas fait.
7. Une fois le workflow terminé avec succès, télécharge l'artefact « Pix-Senso-APK-debug ».
8. Décompresse l'artefact : il contient app-debug.apk.
9. Transfère app-debug.apk sur un téléphone Android et ouvre-le pour l'installer. Autorise si nécessaire l'installation depuis cette source.

IMPORTANT
- Il s'agit d'un APK de test (debug), pas d'une version publiée sur Google Play.
- Tester sur le téléphone les grilles, pictogrammes, couleurs, exports, G-code, comptage et impression.
- Le HTML fourni est embarqué dans l'application. Pour changer de version du générateur, remplacer app/src/main/assets/index.html puis relancer la compilation.
