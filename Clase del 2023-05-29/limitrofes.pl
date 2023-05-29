limita(argentina, brasil).
limita(uruguay, argentina).
limita(bolivia, argentina).
limita(argentina, chile).
limita(paraguay, argentina).
limita(uruguay, brasil).

limita(chile, bolivia).
limita(chile, peru).

limita(bolivia, peru).
limita(bolivia, brasil).
limita(bolivia, paraguay).

limita(paraguay, brasil).

limita(peru, brasil).
limita(peru, ecuador).
limita(peru, colombia).

limita(colombia, ecuador).
limita(colombia, brasil).
limita(colombia, venezuela).
limita(colombia, panamá).

limita(venezuela, brasil).
limita(venezuela, guyana).

limita(guyana, surinam).
limita(guyana, brasil).

limita(surinam, brasil).
limita(surinam, francia).


limita_con(X, Y):-
limita(X,Y);limita(Y,X).

translimita_con(X,Y):- limita_con(X,Pais),
limita_con(Pais,Y), \+limita_con(X,Y).


