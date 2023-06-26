#!/bin/env groovy //on utilise le langage groovy

import groovy.json.* //importe toutes les lib groovy nécessaires

def 	call(body) { //declare une fonction qui récupère un call de la fonction 'hello World'. body récupère les variables
	def mapVars = [:] //sorte de hash qui permet de récupérer ou stocker les clés-valeurs
	body.resolveStrategy = Closure.DELEGATE_FIRST //récupérer le body et de l'intégrer dans la map : mapVars
	body.delegate = mapVars
	body ()

	def name = mapVars.name //récupère la valeur et l'insère dans name
	def action = mapVars.action //récupère la valeur et l'insère dans name/

	println ( action + " " + name + "!!")
}
