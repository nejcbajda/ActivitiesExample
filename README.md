# Naloga 5 – Delo z različnimi aktivnostmi

Šolska naloga pri predmetu **Razvoj mobilnih aplikacij (Naloga 5)**.
Android aplikacija v jeziku **Java** s tremi aktivnostmi, med katerimi se prenaša vrednost števca.

## Opis

Aplikacija vsebuje tri zaslone:

- **MainActivity** – gumb **Count** poveča števec, gumba **Go to Activity 2** in **Go to Activity 3** odpreta ostali aktivnosti.
- **HelloActivity** – prikaže besedilo **Hello!** in vrednost števca, prenesena iz glavne aktivnosti (`putExtra()` / `getIntExtra()`). Gumb **Go to Activity 1** vodi nazaj na glavni zaslon.
- **ThirdActivity** – prikaže napis **Activity 3** in vrednost števca. Na prvo ali drugo aktivnost lahko preideš z gumbom ali s potezo: poteg s prstom proti levi odpre prvo aktivnost, poteg proti desni drugo (razred `OnSwipeTouchListener`).

Pri vračanju na prvo aktivnost se uporabljata zastavici `FLAG_ACTIVITY_CLEAR_TOP` in `FLAG_ACTIVITY_SINGLE_TOP`, da se ne ustvarja več zaporednih primerkov iste aktivnosti.


## Struktura projekta

| Datoteka | Opis |
|---|---|
| `MainActivity.java` | glavni zaslon, števec, zagon aktivnosti z `Intent` |
| `HelloActivity.java` | prikaz prenesenega števca, vrnitev na glavni zaslon |
| `ThirdActivity.java` | prikaz števca, navigacija z gumbi in potezami |
| `OnSwipeTouchListener.java` | zaznavanje potez levo in desno |
| `res/layout/activity_*.xml` | postavitve treh zaslonov |
| `AndroidManifest.xml` | zapisi vseh treh aktivnosti |

## Namestitev na telefon

Datoteka `app-debug.apk` je na voljo v razdelku **Releases** tega repozitorija.

1. Prenesi `app-debug.apk` na telefon.
2. Odpri datoteko in dovoli namestitev iz neznanih virov.
3. Tapni **Install** in nato **Open**.

## Avtor

Nejc Bajda – ŠC Nova Gorica, Elektrotehniška in računalniška šola
