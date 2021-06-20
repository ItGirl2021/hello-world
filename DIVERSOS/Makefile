all: msg clean build run

msg:
	@echo by Danielle Guia 2021

run: Buscador.class Dicionario.class
	java Buscador

build: Buscador.java Dicionario.java
	javac Buscador.java Dicionario.java

clean:
	rm *.class