- S'inclou una colecció de Postman amb els endpoints a cridar.

Nivell 3:
- Es fa servir Lombok
- S'ha de crear manualment la base de dades "FruitaDb", el document "Fruita" i el document "sequence".
- També es pot fer mitjançant les següents comandes:
	use FruitaDb
	db.createCollection("Fruita")
	db.sequence.insertOne({_id:"fruita",seq:0})
	

