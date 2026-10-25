PIX-SENSO ANDROID — PROJET POUR GENERER UN APK

Ce projet embarque le générateur HTML v93 dans une petite application Android (WebView).
Le dépôt contient un workflow GitHub Actions qui compile automatiquement un APK de test.

COMMENT OBTENIR L'APK SANS INSTALLER ANDROID STUDIO
1. Crée un dépôt GitHub distinct, par exemple pix-senso-android.
2. Téléverse TOUT le contenu de ce dossier à la racine du nouveau dépôt (pas le dossier parent lui-même).
3. Valide les fichiers dans la branche main.
4. Ouvre l'onglet Actions du dépôt.
5. Sélectionne « Build Pix-Senso APK » puis « Run workflow » si le workflow n'a pas démarré automatiquement.
6. Quand l'exécution est terminée avec succès, ouvre-la et télécharge l'artefact « Pix-Senso-APK-debug ».
7. Décompresse l'artefact téléchargé : il contient app-debug.apk.
8. Transfère le APK sur le téléphone Android et ouvre-le. Android peut demander d'autoriser l'installation depuis cette source.

IMPORTANT
- C'est un APK debug destiné aux essais, non signé pour une distribution publique.
- Le code HTML est embarqué localement dans l'application. Les impressions doivent être testées sur le téléphone : le comportement d'impression peut varier selon Android et le modèle.
- Cette première version utilise le HTML v93 existant et ne réécrit pas le générateur pour mobile. Il peut donc rester des zones moins pratiques sur petit écran.
- Avant toute publication ou distribution, il faudra tester les fonctions importantes (grille, pictogrammes, couleurs, G-code, comptage et impression).
