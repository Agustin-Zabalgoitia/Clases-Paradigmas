padre_de(lucas, rolando).
padre_de(roly, donroly).
padre_de(matias, roly).
padre_de(marco, donroly).
padre_de(clemen, donclemen).

madre_de(lucas, clemen).
madre_de(clemen, elba).
madre_de(roly, doñaroly).
madre_de(matias, doñamatias).

hijo_de(Progenitor, Hijo):-padre_de(Hijo, Progenitor); madre_de(Hijo, Progenitor).

abuelo_de(Nieto, Abuelo):-
	hijo_de(Progenitor, Nieto),
	hijo_de(Abuelo, Progenitor).




