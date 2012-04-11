#!/bin/sh
BASEURI="http://localhost:8080/repositories"

curl -d '{"name" : "John Doe"}' -H "Content-Type: application/json" $BASEURI/person
curl -d '{"name" : "Jane Doe"}' -H "Content-Type: application/json" $BASEURI/person
curl -d '{"postalCode":"12345","province":"MO","lines":["1 W 1st St."],"city":"Univille"}' -H "Content-Type: application/json" $BASEURI/address
curl -d "$BASEURI/address/1" -H "Content-Type: text/uri-list" $BASEURI/person/1/addresses
curl -d '{"postalCode":"54321","province":"MO","lines":["2 W 1st St."],"city":"Univille"}' -H "Content-Type: application/json" $BASEURI/address
curl -d "$BASEURI/address/2" -H "Content-Type: text/uri-list" $BASEURI/person/2/addresses
curl -d '{"type" : "twitter", "url": "#!/johndoe"}' -H "Content-Type: application/json" $BASEURI/profile
curl -d "$BASEURI/profile/1" -H "Content-Type: text/uri-list" $BASEURI/person/1/profiles
curl -d '{"type" : "facebook", "url": "/janedoe"}' -H "Content-Type: application/json" $BASEURI/profile
curl -d '{"_links": [{"rel":"facebook", "href": "$BASEURI/profile/2"}]}' -H "Content-Type: application/json" $BASEURI/person/2/profiles
