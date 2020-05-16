Egy autókereskedést modellezünk a szoftverrel (nem vár user inputot, a cél az alábbi tervezési minták megvalósítása). Külföldről lehet autókat behozni, azokat árulja a kereskedés, akár megrendelésre.

#### Programtervezési minták
- Singleton: az menedzsert bárki elérheti és tehet fel kérdéseket (metódusok hívása), de belőle csak egy van. A getInstance-al férünk hozzá.
- Prototype: pl ha azt mondja a menedzser, hogy “szerezzünk ugyanilyen autót”, akkor abból az autóból kell készíteni akármennyi példányt (deep copy).
- Template: egy autó tesztlésének meg van a módja
- Strategy: a vevő kéri, hogy hadd próbálja ki az autót. Kinyitja az ajtót, beül, elindítja, leállítja (template). De például: egy kis autó halkan brummog, egy nagy autó hangosan brummog, ez már az autó brummogási stratégiája.

#### Unit teszt ötletek
- Store: sikerül hozzáadni az autót?
- Store: annyi autó van benn amennyinek lenne kell?
- Store: sikerül törölni az autót?
- Store: törés után annyi elem lesz amennyinek lennie kell?
- Stb...

#### TDD megvalósítása:
Store osztály addCar, removeCar, getList metódusán.