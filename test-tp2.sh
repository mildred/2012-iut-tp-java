#!/bin/sh

cd "$(dirname "$0")"

set -x

java -cp tp2/bin:tp1/bin tp2.AfficherInfosClasse tp2.Serveur a
java -cp tp2/bin:tp1/bin tp2.AfficherInfosClasse tp2.Serveur m
java -cp tp2/bin:tp1/bin tp2.AfficherInfosClasse tp2.Serveur i

java -cp tp2/bin:tp1/bin tp2.AfficherInfosClasse java.lang.Class a
java -cp tp2/bin:tp1/bin tp2.AfficherInfosClasse java.lang.Class m
java -cp tp2/bin:tp1/bin tp2.AfficherInfosClasse java.lang.Class i

