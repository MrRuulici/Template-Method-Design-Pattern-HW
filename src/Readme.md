Template Method e un behavioral design care are in structura 2 parti mari:
 1. O clasa abstracta care e superclasa si deefineste scheletul unui algoritm
 2. Clase "concrete" care implementeaza anumiti pasi specifici pentru acea clasa
 
 In codul exemplu avem clasa "PageTemplate" care e clasa abstracta si unde se afla scheletul
 algoritmului dorit, "WelcomePage" si "AboutUsPage" sunt subclasele care modifica sau implementeaza
 superclasa cu pasi specifici.
 
 Acest design pattern ofera o structura comuna care e si flexibila si customizabila prin subclase
 
 Pros:
  - Cod reutilizabil, structura usor de utilizat
  - Structura usor de inteles, face codul mai lizibil
  - Ofera flexibilitate fara sa strice structura si scheletul
  - Detaliile algoritmului sunt incapsulate in clasa abstracta
 
 Cons:
  - Esti limitat de scheletul algoritmului din superclasa
  - Se pare ca nu bate cu "Liskov Substitution Principle", adica pui un pas din implementare sa fie
  dependent de subclasa
  - Metoda tinde sa devina din ce in ce mai complex de intretinut cu cat mai mult cod ai
  
  Caz special: (il scriu direct in engleza)
  
  Introducing "hook" methods in the template class allows subclasses to optionally override certain 
  steps of the algorithm. These hooks provide additional customization points. The template method 
  calls these hooks, but the subclass is not obligated to implement them.