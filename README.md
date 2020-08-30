The repository (for now) holds a MongoDB learning project.
Instructions to setup and populate MongoDB database below.
## Setup MongoDB in Docker
Install docker for Linux, MacOS or Windows and copy+paste below commands in the terminal.
*assuming mongodb data will be stored at `/Users/sherry/mongodb`*

    docker network create my-network
    docker pull mongo:latest
    docker run -p 27017:27017 --name=mongoCon --net=my-network -v /Users/sherry/mongodb:/data/db -d mongo:latest
    docker exec -it mongoCon bash
    mongo
    
    use admin
    db.createUser({
        user: "root",
        pwd:  "root", // passwordPrompt()
        roles: [ { role: "userAdminAnyDatabase", db: "admin" }, "readWriteAnyDatabase"]  })
    exit
    exit
    
    docker stop mongoCon
    docker rm mongoCon
    docker run -p 27017:27017 --name=mongoCon --net=my-network -v /Users/sherry/mongodb:/data/db -d mongo:latest --auth
    docker exec -it mongoCon bash
    
    mongo -u "root" -p
    < Enter password: "root" >

## Sample data for `shopdb` database

    use shopdb
    db.product.insertOne({ name:"T-Shirt", 
    		       price:12.99, 
    		       description: "Duke's high quality T-Shirt"})
    db.product.insertOne({ name:"Ravpower 90W 2 port PD Charger", 
    		       price:56.99})
    db.product.insertOne({ name:"T-Shirt", 
    		       price:12.99, 
    		       description: "Gaming PC", 
    		       specs: {
    				cpu: "Ryzen 3950X",
    				ram: "32GB",
    				gpu: "Nvidia GTX 3080TI"
    			     }
    		       })					
    db.product.find().pretty()

