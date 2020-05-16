Egy autókereskedést modellezünk a szoftverrel (nem vár user inputot, a cél az alábbi tervezési minták megvalósítása). Külföldről lehet autókat behozni, azokat árulja a kereskedés, akár megrendelésre.

#### Programtervezési minták
- Singleton: az menedzsert bárki elérheti és tehet fel kérdéseket (metódusok hívása), de belőle csak egy van. A getInstance-al férünk hozzá.
- Prototype: pl ha azt mondja a menedzser, hogy “külföldről hozzunk be 100 ugyanilyen autót, mint amit az előbb jó áron eladtunk”, akkor abból az autóból kell elkészteni 100 példányt (deep copy).
- Decorator: eladás előtt adunk az autóknak bizonyos tulajdonságokat, hogy kelendőbbek legyenek. Például lemossuk, kifényezzük, ellenőrizzük.
- Strategy: a vevő kéri, hogy hadd próbálja ki az autót. Kinyitja az ajtót, beül, elindítja, leállítja. Például: egy kis autó halkan brummog, egy nagy autó hangosan brummog.

#### Unit teszt ötletek
- A sorfőr eljutása A-ból B pontba
- Megjön az összes rendelt autó (annyi van raktáron mennyit kértünk?)
- Az ügyvezető valóban azt válaszolja amit kell (a raktárkészlet alapján)?
- ...

#### TDD megvalósítása:
(todo)